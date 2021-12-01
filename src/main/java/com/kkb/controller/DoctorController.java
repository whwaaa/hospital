package com.kkb.controller;

import com.github.pagehelper.PageInfo;
import com.kkb.pojo.*;
import com.kkb.service.DoctorService;
import com.kkb.utils.excel.ExcelUtil;
import com.kkb.vo.AjaxResultVo;
import com.kkb.vo.DoctorQueryVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

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
     */
    @RequestMapping(value = "{dId}",method = RequestMethod.GET)
    public AjaxResultVo queryById(@PathVariable("dId")Integer dId) throws Exception {
        Doctor doctor = doctorService.queryById(dId);
        return new AjaxResultVo(doctor);
    }

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
     * 根据主键更新
     * @param dId
     * @param doctor
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "{dId}", method = RequestMethod.PUT)
    public AjaxResultVo updateById(@PathVariable("dId") Integer dId, Doctor doctor) throws Exception {
        int i = doctorService.updateById(dId, doctor);
        if(i > 0){
            return new AjaxResultVo();
        }
        return new AjaxResultVo(500, "服务器内部异常, 请稍后再试!");
    }


    /**
     * 根据主键删除逻辑删除
     * @param dId
     * @return
     */
    @RequestMapping(value = "{dId}",method = RequestMethod.DELETE)
    public AjaxResultVo deleteDoctor(@PathVariable("dId")Integer dId, @RequestParam("uId") Integer uId) throws Exception {
        int i = doctorService.deleteDoctor(dId, uId);
        if (i == 1) {
            return new AjaxResultVo(204, "ok");
        }
        return new AjaxResultVo(500, "服务器内部异常, 请稍后再试!");
    }


    /**
     * 导出Excel
     * @param request
     * @param response
     * @throws Exception
     */
    @RequestMapping(value = "export",method = RequestMethod.GET)
    public void exportAll(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String[] dIds = request.getParameterValues("dIds");
        List<Integer> intdIds = new ArrayList<>();
        for (String dId : dIds) {
            Integer intdId;
            try {
                intdId = Integer.parseInt(dId);
                intdIds.add(intdId);
            } catch (Exception e) {
                String msg = "dId不是纯数字:" + dId;
                String encode = URLEncoder.encode(msg, "UTF-8");
                throw new Exception(encode);
            }
        }
        List<Doctor> doctorList = doctorService.createExcelMsg(intdIds);
        ExcelUtil.exportDefault(doctorList,"门诊医生信息",response);
    }
}
