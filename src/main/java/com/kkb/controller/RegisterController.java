package com.kkb.controller;

import com.github.pagehelper.PageInfo;
import com.kkb.pojo.Doctor;
import com.kkb.pojo.Drug;
import com.kkb.pojo.HosRegister;
import com.kkb.service.RegisterService;
import com.kkb.utils.excel.ExcelUtil;
import com.kkb.vo.AjaxResultVo;
import com.kkb.vo.DrugQueryVo;
import com.kkb.vo.RegisterQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 挂号表
 * @author wuhanwei
 * @version 1.0
 * @date 2021/11/12
 */
@Controller
@ResponseBody
@RequestMapping("register")
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    // 多条件分页查
    @RequestMapping("list")
    public AjaxResultVo queryList(@RequestParam(value = "pageNum", required = false) Integer pageNum,
                                  @RequestParam(value = "pageSize", required = false) Integer pageSize,
                                  RegisterQueryVo vo) throws BindException {
        if(pageNum==null || pageNum<=0){
            pageNum = 1;
        }
        if(pageSize==null || pageSize<=0){
            pageSize = 5;
        }
        PageInfo pageInfo = registerService.queryList(pageNum, pageSize, vo);
        if(pageInfo != null){
            return new AjaxResultVo(pageInfo);
        }
        // 格式化时间异常
        return new AjaxResultVo(500, "查询时间格式有误!");
    }


    // 添加一条数据
    @RequestMapping(value = "", method = RequestMethod.POST)
    public AjaxResultVo add(HttpServletRequest request, HosRegister hosRegister){
        Integer add = registerService.add(request, hosRegister);
        if(add > 0){
            return new AjaxResultVo();
        }
        return new AjaxResultVo(500, "服务器内部异常, 请稍后再试!");
    }

    // 获取所有科室即医生信息
    @RequestMapping(value = "doctor/list", method = RequestMethod.GET)
    public AjaxResultVo getDoctorMsg() throws Exception {
        Map<String, List<Doctor>> stringListMap = registerService.queryAllDotorMsg();
        if(stringListMap!=null && stringListMap.size()>0){
            return new AjaxResultVo(stringListMap);
        }
        return new AjaxResultVo(500, "服务器内部异常, 请稍后再试!");
    }

    // 更改挂号信息
    @RequestMapping(value = "{hosr-id}",method = RequestMethod.PUT)
    public AjaxResultVo updateById(HttpServletRequest request, HosRegister hosRegister,
                                   @PathVariable("hosr-id") Integer hosrId){
        Integer res = registerService.updateById(request, hosRegister, hosrId);
        if(res > 0){
            return new AjaxResultVo();
        }
        return new AjaxResultVo(500, "服务器内部异常, 请稍后再试!");
    }

    // 查询挂号信息
    @RequestMapping(value = "{hosr-id}",method = RequestMethod.GET)
    public AjaxResultVo queryById(@PathVariable("hosr-id") Integer hosrId) throws Exception {
        HosRegister res = registerService.queryById(hosrId);
        if(res != null){
            return new AjaxResultVo(res);
        }
        return new AjaxResultVo(500, "服务器内部异常, 请稍后再试!");
    }


    // 导出Excel
    @RequestMapping(value = "export",method = RequestMethod.GET)
    public void exportAll(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<HosRegister> hosRegisterList = new ArrayList<>();
        String[] hosrIds = request.getParameterValues("hosrIds");
        for (String hosrId : hosrIds) {
            Integer intHosrId;
            try {
                intHosrId = Integer.parseInt(hosrId);
            } catch (Exception e) {
                throw new Exception("hosrId不是纯数字");
            }
            hosRegisterList.add(registerService.queryById(intHosrId));
        }
        ExcelUtil.exportDefault(hosRegisterList,"挂号信息",response);
    }
}














