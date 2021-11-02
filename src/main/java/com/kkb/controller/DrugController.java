package com.kkb.controller;

import com.kkb.pojo.Drug;
import com.kkb.service.DrugService;
import com.kkb.vo.AjaxResultVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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


    /**
     * 新增药品
     * @param drug 药品信息
     * @return 新增结果
     */
    @RequestMapping(value = "",method = RequestMethod.POST)
    public AjaxResultVo addDrug(Drug drug){
        // 药品编码唯一性判断
        Drug byId = drugService.findDrugById(drug.getDrId());
        if (byId!=null){
            return new AjaxResultVo(400,"药品编码不唯一,请重新输入");
        }
        // 可加图片检查，其他检查在实体类中加上了
        // 保存药品
        int i = drugService.addDrug(drug);
        if (i==1){
            return new AjaxResultVo(200,"药品添加成功");
        }else {
            return new AjaxResultVo(500,"药品添加失败");
        }
    }


}





