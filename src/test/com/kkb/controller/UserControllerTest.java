package com.kkb.controller;

import com.kkb.pojo.User;
import com.kkb.service.UserService;
import junit.framework.TestCase;
import org.apache.log4j.Logger;
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
        User user = new User();
        user.setR_id(1);
        user.setU_loginName("shuaige");
        user.setU_email("abc123@gmail.com");
        user.setU_passWord("nicai");
        user.setU_state(1);
        user.setU_trueName("bushuo");
        Integer res = userService.addUser(user);
        System.out.println(res);
    }

    public void testDeleteById() {
    }

    public void testUpdateById() {
    }
}