package com.kkb.controller;

import com.github.pagehelper.PageInfo;
import com.kkb.pojo.HosRegister;
import com.kkb.service.BeHospitalService;
import com.kkb.service.RegisterService;
import com.kkb.vo.AjaxResultVo;
import com.kkb.vo.RegisterQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

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
//    @RequestMapping(value = "", method = RequestMethod.POST)
//    public AjaxResultVo addData(HttpServletRequest request, ){
//
//    }



}
