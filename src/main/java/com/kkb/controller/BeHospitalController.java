package com.kkb.controller;

import com.github.pagehelper.PageInfo;
import com.kkb.pojo.BeHospital;
import com.kkb.pojo.HosRegister;
import com.kkb.service.BeHospitalService;
import com.kkb.utils.excel.ExcelUtil;
import com.kkb.vo.AjaxResultVo;
import com.kkb.vo.RegisterQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 住院模块控制器
 * @author wuhanwei
 * @version 1.0
 * @date 2021/11/21
 */
@Controller
@RequestMapping("be-hospital")
@ResponseBody
public class BeHospitalController {

    @Autowired
    private BeHospitalService service;

    // 多条件分页查
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public AjaxResultVo queryList(@RequestParam(value = "pageNum") Integer pageNum,
                                  @RequestParam(value = "pageSize") Integer pageSize,
                                  RegisterQueryVo vo){
        PageInfo pageInfo = service.queryList(pageNum, pageSize, vo);
        if(pageInfo != null){
            return new AjaxResultVo(pageInfo);
        }
        return new AjaxResultVo(500, "服务器内部异常, 请稍后再试!");
    }

    // 添加住院信息
    @RequestMapping(value = "", method = RequestMethod.POST)
    public AjaxResultVo addData(HttpServletRequest request,
                                @RequestParam(value = "hosrId")Integer hosrId,
                                BeHospital beHospital){
        Integer add = service.add(request, hosrId, beHospital);
        if(add > 0){
            return new AjaxResultVo();
        }
        return new AjaxResultVo(500, "服务器内部异常, 请稍后再试!");
    }

    // 根据主键更新
    @RequestMapping(value = "{beh-id}", method = RequestMethod.PUT)
    public AjaxResultVo updateById(@PathVariable(value = "beh-id")Integer behId, BeHospital beHospital){
        Integer res = service.updateById(behId, beHospital);
        if(res != 0){
            return new AjaxResultVo(200,"更新成功");
        }
        return new AjaxResultVo(500, "服务器内部异常, 请稍后再试!");
    }

    // 缴纳金额
    @RequestMapping(value = "add-amount/{beh-id}", method = RequestMethod.PUT)
    public AjaxResultVo addAmount(@PathVariable(value = "beh-id")Integer behId, BeHospital beHospital) throws Exception {
        Integer res = service.addAmount(behId, beHospital);
        if(res != 0){
            return new AjaxResultVo(200,"更新成功");
        }
        return new AjaxResultVo(500, "服务器内部异常, 请稍后再试!");
    }

    // 根据主键查询
    @RequestMapping(value = "{hosr-id}", method = RequestMethod.GET)
    public AjaxResultVo queyrById(@PathVariable("hosr-id") Integer hosrId) throws Exception {
        Map<String, Object> map = service.queryById(hosrId);
        if(map!=null && map.size()==2){
            return new AjaxResultVo(map);
        }
        return new AjaxResultVo(500, "服务器内部异常, 请稍后再试!");
    }

    // 查询消费信息
    @RequestMapping(value = "{hosr-id}/{beh-id}", method = RequestMethod.GET)
    public AjaxResultVo queryByIds(@PathVariable("hosr-id") Integer hosrId,@PathVariable("beh-id") Integer behId){
        Map<String, Object> stringObjectMap = service.queryByIds(hosrId, behId);
        if(stringObjectMap!=null && stringObjectMap.size()!=0){
            return new AjaxResultVo(stringObjectMap);
        }
        return new AjaxResultVo(500, "服务器内部异常, 请稍后再试!");
    }

    // 导出Excel
    @RequestMapping(value = "export",method = RequestMethod.GET)
    public void exportAll(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String[] hosrIds = request.getParameterValues("hosrId");
        List<Integer> intHosrIds = new ArrayList<>();
        for (String hosrId : hosrIds) {
            Integer intHosrId;
            try {
                intHosrId = Integer.parseInt(hosrId);
                intHosrIds.add(intHosrId);
            } catch (Exception e) {
                String msg = "hosrId不是纯数字:" + hosrId;
                String encode = URLEncoder.encode(msg, "UTF-8");
                throw new Exception(encode);
            }
        }
        List<BeHospital> beHospitalList = service.createExcelMsg(intHosrIds);
        ExcelUtil.exportDefault(beHospitalList,"住院病人信息",response);
    }
}
