package com.kkb.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.pojo.BeHospital;
import com.kkb.pojo.ChargeProject;
import com.kkb.pojo.PricePeople;
import com.kkb.service.ChargeService;
import com.kkb.service.CkChargeService;
import com.kkb.service.PricePeopleService;
import com.kkb.vo.AjaxResultVo;
import com.kkb.vo.ChargeQueryVo;
import com.kkb.vo.CkChargeQueryVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author:XiaoFei
 * @version:1.0
 * @Date:2021/11/02/20:17
 */
@Controller
@RequestMapping("ckcharge")
@ResponseBody
public class CheckChargeController {
    @Resource
    private CkChargeService ckChargeService;
    @Resource
    private PricePeopleService pricePeopleService;
    @Resource
    private ChargeService chargeService;
    @RequestMapping(value = "list",method = RequestMethod.GET)
    public AjaxResultVo queryByPage(Integer pageNum, Integer pageSize, CkChargeQueryVo vo){
        if (pageNum == null || pageNum <=0){
            pageNum = 1;
        }
        if (pageSize == null || pageSize <=0){
            pageSize = 10;
        }
        PageInfo chargePageInfo = ckChargeService.queryByPage(pageNum,pageSize,vo);
        return new AjaxResultVo(chargePageInfo);
    }
    //查询用户收费项目
    @RequestMapping(value = "chargelist",method = RequestMethod.GET)
    public AjaxResultVo queryByPage2(Integer pageNum, Integer pageSize, CkChargeQueryVo vo){
        if (pageNum == null || pageNum <=0){
            pageNum = 1;
        }
        if (pageSize == null || pageSize <=0){
            pageSize = 10;
        }
        //查询中间表,获取收费项chapId
        PageHelper.startPage(pageNum,pageSize);
        List<PricePeople> pricePeoples = pricePeopleService.queryByBehId(vo.getBehId());
        //获取病人信息
        BeHospital beHospital = ckChargeService.queryById(vo.getBehId());
        List<ChargeProject> list = new ArrayList<>();
        for (PricePeople pricePeople : pricePeoples) {
            Integer chapId = pricePeople.getChapId();
            //获取收费项目信息
            ChargeProject chargeProject = chargeService.queryById(chapId);
            chargeProject.setBeChargeTime(pricePeople.getCreateTime());
            chargeProject.setBeHospital(beHospital);
            list.add(chargeProject);
        }
        PageInfo chargePageInfo = new PageInfo(list);
        chargePageInfo.setPageSize(pageSize);
        return new AjaxResultVo(chargePageInfo);
    }
    @RequestMapping(value = "{behId}",method = RequestMethod.GET)
    public AjaxResultVo queryById(@PathVariable("behId") Integer behId){
        BeHospital beHospital = ckChargeService.queryById(behId);
        return new AjaxResultVo(beHospital);
    }
    //获取余额
    @RequestMapping(value = "blank",method = RequestMethod.GET)
    public AjaxResultVo queryBlank(Integer behId){
        BigDecimal allcast = ckChargeService.queryBlank(behId);

        return new AjaxResultVo(allcast);
    }
    //结算操作
    @RequestMapping(value = "{behId}",method = RequestMethod.PUT)
    public AjaxResultVo pay(BigDecimal blank,Integer behId){
        if (blank.compareTo(new BigDecimal("0.00"))>=0) {
            Integer i = ckChargeService.pay(behId);
            if (i > 0) {
                return new AjaxResultVo(200, "ok", null);
            }
            return new AjaxResultVo(500,"内部服务器异常，请稍后重试",null);
        }
        return new AjaxResultVo(400, "余额不足，请充值！", null);
    }
}
