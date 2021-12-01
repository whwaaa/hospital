package com.kkb.controller;

import com.github.pagehelper.PageInfo;
import com.kkb.mapper.DoctorMapper;
import com.kkb.pojo.ChargeProject;
import com.kkb.pojo.Doctor;
import com.kkb.service.ChargeService;
import com.kkb.vo.DoctorQueryVO;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:XiaoFei
 * @version:1.0
 * @Date:2021/10/28/20:39
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class ChargeControllerTest extends TestCase {
    @Resource
    private ChargeService service;

    @Resource
    private DoctorMapper doctorMapper;

    @Test
    public void testDoctor(){
        DoctorQueryVO vo = new DoctorQueryVO();
        vo.setdId(4);
        vo.setdKeshi("泌尿");
        vo.setUserName("毒");
        List<Doctor> doctorList = doctorMapper.selectDoctorList(vo);
        System.out.println(doctorList);
    }

    @Test
    public void testQueryByPage() {
        PageInfo<ChargeProject> pageInfo = service.queryByPage(1, 5, null);
        System.out.println(pageInfo);
    }
    @Test
    public void queryById(){
        ChargeProject chargeProject = service.queryById(1001);
        System.out.println(chargeProject);
    }
}