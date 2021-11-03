package com.kkb.controller;

import com.kkb.pojo.Drug;
import com.kkb.service.AccessService;
import com.kkb.service.DrugService;
import com.kkb.utils.ValidUtil;
import com.kkb.vo.AjaxResultVo;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Date;

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


}





