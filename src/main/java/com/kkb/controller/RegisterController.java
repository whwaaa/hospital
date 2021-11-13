package com.kkb.controller;

import com.github.pagehelper.PageInfo;
import com.kkb.service.RegisterService;
import com.kkb.vo.AjaxResultVo;
import com.kkb.vo.RegisterQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
                                  RegisterQueryVo vo){
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
        return new AjaxResultVo(500, "服务器内部异常,请稍后再试!");
    }
}
