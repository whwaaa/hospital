package com.kkb.controller;

import com.github.pagehelper.PageInfo;
import com.kkb.pojo.Chargeproject;
import com.kkb.service.ChargeService;
import com.kkb.vo.AjaxResultVo;
import com.kkb.vo.ChargeQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author:XiaoFei
 * @version:1.0
 * @Date:2021/10/28/17:43
 */
@Controller
@RequestMapping("charge")
@ResponseBody
public class ChargeController {
    @Autowired
    private ChargeService chargeService;
    @RequestMapping(value = "list",method = RequestMethod.GET)
    public AjaxResultVo<Chargeproject> queryByPage(Integer pageNum, Integer pageSize, ChargeQueryVo vo){
        if (pageNum == null && pageNum <=0){
            pageNum = 1;
        }
        if (pageSize == null && pageSize <=0){
            pageSize = 5;
        }
        PageInfo<Chargeproject> chargePageInfo = chargeService.queryByPage(pageNum,pageSize,vo);
        System.out.println(chargePageInfo);
        return new AjaxResultVo<>(chargePageInfo);
    }

}
