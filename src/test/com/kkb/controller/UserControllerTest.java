package com.kkb.controller;

import com.kkb.service.UserService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * ControllerTest
 * @author wuhanwei
 * @version 1.0
 * @date 2021/10/28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class UserControllerTest extends TestCase {

    @Resource
    private UserService userService;

    @Test
    public void testQueryByPage() {
    }

    public void testQueryById() {
    }

    @Test
    public void testAddUser() {

    }

    public void testDeleteById() {
    }

    public void testUpdateById() {
    }
}