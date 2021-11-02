package com.kkb.controller;

import com.github.pagehelper.PageInfo;
import com.kkb.pojo.ChargeProject;
import com.kkb.pojo.User;
import com.kkb.service.ChargeService;
import com.kkb.vo.AjaxResultVo;
import com.kkb.vo.ChargeQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;


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
    public AjaxResultVo queryByPage(Integer pageNum, Integer pageSize, ChargeQueryVo vo){
        if (pageNum == null || pageNum <=0){
            pageNum = 1;
        }
        if (pageSize == null || pageSize <=0){
            pageSize = 5;
        }
        PageInfo chargePageInfo = chargeService.queryByPage(pageNum,pageSize,vo);
        return new AjaxResultVo(chargePageInfo);
    }
    @RequestMapping(value = "{chapId}",method = RequestMethod.GET)
    public AjaxResultVo queryById(@PathVariable("chapId") Integer chapId){
        ChargeProject chargeProject = chargeService.queryById(chapId);
        return new AjaxResultVo(chargeProject);
    }
    //更新
    @RequestMapping(value = "{chapId}",method = RequestMethod.PUT)
    public AjaxResultVo update(@PathVariable("chapId") Integer chapId,ChargeProject chargeProject){
        if(chargeService.queryName(chargeProject.getChapName())<=1){
            chargeProject.setChapId(chapId);
        chargeProject.setChapUpdateTime(new Date());
        int i = chargeService.updateById(chargeProject);
        if(i > 0){
            return new AjaxResultVo(200, "ok", null);
        }
        return new AjaxResultVo(500, "服务器内部异常, 请稍后再试!");
        }
        return new AjaxResultVo(400, "该项目名称已存在，请重试！");
    }
    //删除
    @RequestMapping(value = "{chapId}", method = RequestMethod.DELETE)
    public AjaxResultVo deleteById(@PathVariable("chapId") Integer chapId){
        Integer i = chargeService.deleteById(chapId);
        if(i > 0){
            return new AjaxResultVo(200, "ok", null);
        }
        return new AjaxResultVo(500, "服务器内部异常, 请稍后再试!");
    }
    //增加
    @RequestMapping(value = "", method = RequestMethod.POST)
    public AjaxResultVo addCharge(ChargeProject chargeProject) {
        if (chargeService.queryName(chargeProject.getChapName()) ==0) {
            Integer i = chargeService.addCharge(chargeProject);
            if (i > 0) {
                return new AjaxResultVo(200, "ok");
            }
            return new AjaxResultVo(500, "服务器内部异常, 请稍后再试!");
        }
        return  new AjaxResultVo(400, "该项目名称已存在，请重试！");
    }
}
