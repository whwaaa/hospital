package com.kkb.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.kkb.pojo.Drug;
import com.kkb.service.AccessService;
import com.kkb.service.DrugService;
import com.kkb.utils.excel.ExcelUtil;
import com.kkb.vo.AjaxResultVo;
import com.kkb.vo.DrugQueryVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * show 药品业务的控制器
 *
 * @author guguofu
 * @since 2021/10/31
 */
@Controller
@ResponseBody
@RequestMapping("drug")
public class DrugController {

    @Resource
    private DrugService drugService;

    @Resource
    AccessService accessService;


    /**
     * 新增药品
     * @param drug 药品信息
     * @return 新增结果
     */
    @RequestMapping(value = "",method = RequestMethod.POST)
    public AjaxResultVo addDrug(@Valid Drug drug, HttpServletRequest request){
        // 药品编码唯一性判断
        Drug byId = drugService.findDrugById(drug.getDrId());
        // 该编码已经存在了
        if (byId!=null){
            return new AjaxResultVo(400,"药品编码不唯一,请重新输入");
        }
        // 设置创建人和创建时间
        try {
            drug.setuId(accessService.paseUserMessage(request).getuId());
            drug.setDrCreateTime(new Date());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("获取当前用户失败");
            return new AjaxResultVo(403,"用户未登录");
        }
        // 保存药品
        int i = drugService.addDrug(drug);
        if (i==1){
            return new AjaxResultVo(200,"药品添加成功");
        }else {
            return new AjaxResultVo(500,"药品添加失败");
        }
    }

    /**
     * 多条件分页查询药品
     * @param vo 条件
     * @param pageNum 页码
     * @param pageSize 分页大小
     * @return 查询的数据
     */
    @RequestMapping(value = "list",method = RequestMethod.GET)
    public AjaxResultVo getDrugByPage(DrugQueryVo vo, Integer pageNum, Integer pageSize){
        // 对于分页数据的初始化
        if (pageNum==null || pageNum<=0){
            pageNum = 1;
        }
        if (pageSize==null || pageSize<=0){
            pageSize=5;
        }
        PageInfo<Drug> pageInfo = drugService.findDrugByPage(vo, pageNum, pageSize);
        return new AjaxResultVo(200,"查询成功",pageInfo);
    }

    /**
     * 查询所有药品
     *
     * @return 查询的数据
     */
    @RequestMapping(value = "list/all",method = RequestMethod.GET)
    public AjaxResultVo getAllDrug(){
        PageInfo<Drug> pageInfo = drugService.findDrugByPage(null, 0, 0);
        return new AjaxResultVo(200,"查询成功",pageInfo);
    }


    /**
     * 通过药品编码查询药品信息
     * @param drId 药品编码
     * @return 查询结果
     */
    @RequestMapping(value = "{drId}",method = RequestMethod.GET)
    public AjaxResultVo getDrugByDrId(@PathVariable("drId")String drId){
        Drug drug = drugService.findDrugById(drId);
        if (drug!=null){
            return new AjaxResultVo(200,"ok",drug);
        }else {
            return new AjaxResultVo(400,"没有找到该药品!");
        }
    }

    /**
     * 更新药品
     * @param drug 药品信息
     * @return 更新结果
     */
    @RequestMapping(value = "{drId}",method = RequestMethod.PUT)
    public AjaxResultVo updateDrug(@PathVariable("drId") String drId, @Valid Drug drug, HttpServletRequest request){
        Drug byId = drugService.findDrugById(drId);
        // 该编码不存在存在
        if (byId==null){
            return new AjaxResultVo(400,"药品编码不存在,更新失败");
        }
        drug.setDrId(drId);
        // 没有对图片不修改的处理
        // 设置创建人和创建时间
        try {
            drug.setuId(accessService.paseUserMessage(request).getuId());
            drug.setDrUpdateTime(new Date());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("获取当前用户失败");
            return new AjaxResultVo(403,"用户未登录");
        }
        // 保存药品
        int i = drugService.updateDrug(drug);
        if (i==1){
            return new AjaxResultVo(200,"药品更新成功");
        }else {
            return new AjaxResultVo(500,"药品更新失败");
        }
    }

    /**
     * 添加药品库存
     * @param drId 药品编码
     * @param drNumber 添加的数量
     * @param request 请求的request
     * @return 更新结果
     */
    @RequestMapping(value = "addDrNumber/{drId}",method = RequestMethod.PUT)
    public AjaxResultVo updateDrug(@PathVariable("drId")String drId, Integer drNumber, HttpServletRequest request){
       if (drNumber==null){
           return new AjaxResultVo(400,"未设置添加数量！");
       }
        Drug drug = drugService.findDrugById(drId);
        // 该编码不存在存在
        if (drug==null){
            return new AjaxResultVo(400,"药品编码不存在,添加库存失败！");
        }
        // 保存药品
        Drug addDrugBean = new Drug();
        addDrugBean.setDrId(drId);
        addDrugBean.setDrNumber(drug.getDrNumber() + drNumber);
        // 设置创建人和创建时间
        try {
            addDrugBean.setuId(accessService.paseUserMessage(request).getuId());
            addDrugBean.setDrUpdateTime(new Date());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("获取当前用户失败");
            return new AjaxResultVo(403,"用户未登录");
        }
        int i = drugService.updateDrug(addDrugBean);
        if (i==1){
            return new AjaxResultVo(200,"药品更新成功");
        }else {
            return new AjaxResultVo(500,"药品更新失败");
        }
    }

    /**
     * 导出查询结果的所有数据
     * Excel文件下载并且失败的时候返回json（默认失败了会返回一个有部分数据的Excel）
     *
     * @param vo 查询数据的条件
     * @param response 响应对象,导出成功返回.xlsx文件,失败返回提示
     */
    @RequestMapping(value = "export",method = RequestMethod.GET)
    public void exportAll(DrugQueryVo vo,HttpServletResponse response) {
        PageInfo<Drug> drugByPage = drugService.findDrugByPage(vo, 0, 0);
        String fileName = "药品信息";
        ExcelUtil.exportDefault(drugByPage.getList(),fileName,response);
    }

    /**
     * 导出传入的药品编码对应的药品信息数据
     *
     */
    @RequestMapping(value = "export/drIds",method = RequestMethod.GET)
    public void exportByDrIds(@RequestParam("drId")List<String> drIds,HttpServletResponse response){
        List<Drug> list = drugService.findDrugByIdList(drIds);
        String fileName = "药品信息";
        ExcelUtil.exportDefault(list,fileName,response);
    }


}





