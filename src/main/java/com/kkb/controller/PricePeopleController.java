package com.kkb.controller;

import com.kkb.pojo.PricePeople;
import com.kkb.service.PricePeopleService;
import com.kkb.vo.AjaxResultVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author:XiaoFei
 * @version:1.0
 * @Date:2021/11/08/21:41
 */
@Controller
@RequestMapping("pricepeople")
@ResponseBody
public class PricePeopleController {
   @Resource
    private PricePeopleService pricePeopleService;
    @RequestMapping(value = "add",method = RequestMethod.POST)
    public AjaxResultVo queryBlank(PricePeople pricePeople){
        Integer i = pricePeopleService.addPricePeople(pricePeople);
        if (i > 0) {
            return new AjaxResultVo(200, "ok");
        }
        return new AjaxResultVo(500, "服务器内部异常, 请稍后再试!");
    }
}


