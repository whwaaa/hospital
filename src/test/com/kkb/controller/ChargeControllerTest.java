package com.kkb.controller;

import com.github.pagehelper.PageInfo;
import com.kkb.mapper.DoctorMapper;
import com.kkb.mapper.DrugMapper;
import com.kkb.pojo.ChargeProject;
import com.kkb.pojo.Doctor;
import com.kkb.pojo.Drug;
import com.kkb.pojo.DrugExample;
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

    @Resource
    private DrugMapper drugMapper;

    @Test
    public void testDoctor(){
        // 条件
        DrugExample drugExample = new DrugExample();
        DrugExample.Criteria criteria = drugExample.createCriteria();

        List<Drug> drugs = drugMapper.selectByExample(drugExample);
        System.out.println(drugs);
        for (Drug drug : drugs) {
            System.out.println(drug);
        }
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