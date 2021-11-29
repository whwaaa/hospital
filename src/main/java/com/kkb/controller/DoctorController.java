package com.kkb.controller;

import com.github.pagehelper.PageInfo;
import com.kkb.pojo.Doctor;
import com.kkb.service.DoctorService;
import com.kkb.vo.AjaxResultVo;
import com.kkb.vo.DoctorQueryVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("doctor")
@ResponseBody
public class DoctorController {
    @Resource
    private DoctorService doctorService;

    /**
     * 多添加分页查询
     * @param pageNum
     * @param pageSize
     * @param vo
     * @return
     */
    @RequestMapping(value = "list",method = RequestMethod.GET)
    public AjaxResultVo queryByPage(Integer pageNum, Integer pageSize, DoctorQueryVO vo){
        // 对于分页数据的初始化
        if (pageNum==null || pageNum<=0){
            pageNum = 1;
        }
        if (pageSize==null || pageSize<=0){
            pageSize=5;
        }
        PageInfo<Doctor> doctorPageInfo = doctorService.queryByPage(pageNum, pageSize, vo);
        return new AjaxResultVo(200,"查询成功",doctorPageInfo);
    }

    /**
     * 根据主键查询
     * @param dId
     * @return
     *//*
    @RequestMapping(value = "{dId}",method = RequestMethod.GET)
    public AjaxResultVo queryById(@PathVariable("dId")Integer dId){
        Doctor doctor = doctorService.queryById(dId);
        return new AjaxResultVo(doctor);
    }*/

    /**
     * 根据主键添加
     * @param doctor
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public AjaxResultVo addDoctor(Doctor doctor) throws Exception {
        if (doctorService.queryByIdCar(doctor.getdIdCar()) == 0){
            int i = doctorService.addDoctor(doctor);
            if (i > 0) {
                return new AjaxResultVo(200, "ok");
            }
            return new AjaxResultVo(500, "服务器内部异常, 请稍后再试!");
        }
        return new AjaxResultVo(400, "医生信息已存在，请检查再试！");
    }

    /**
     * 根据主键删除，即物理删除
     * @param dId
     * @return
     */
    /*@RequestMapping(value = "{dId}",method = RequestMethod.DELETE)
    public AjaxResultVo deleteDoctor(@PathVariable("dId")Integer dId){
        int i = doctorService.deleteDoctor(dId);
        if (i == 1) {
            return new AjaxResultVo(201, "ok");
        }
        return new AjaxResultVo(500, "服务器内部异常, 请稍后再试!");
    }*/
}
