package com.kkb.controller;

import com.github.pagehelper.PageInfo;
import com.kkb.pojo.Chargeproject;
import com.kkb.service.ChargeService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author:XiaoFei
 * @version:1.0
 * @Date:2021/10/28/20:39
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class ChargeControllerTest extends TestCase {
    @Resource
    private ChargeService service;

    @Test
    public void testQueryByPage() {
        PageInfo<Chargeproject> pageInfo = service.queryByPage(1, 5, null);
        System.out.println(pageInfo);
    }
}