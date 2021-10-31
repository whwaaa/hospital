package com.kkb.controller;

import com.kkb.pojo.Drug;
import com.kkb.service.DrugService;
import com.kkb.vo.AjaxResultVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

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


    // 新增药品
    public AjaxResultVo addDrug(Drug drug){

        return null;
    }


}





