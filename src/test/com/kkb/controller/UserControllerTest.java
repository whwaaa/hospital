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
import java.util.ArrayList;
import java.util.List;

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
        for(int i=0; i<30; i++){
            User user = new User();
            user.setR_id(1);
            user.setU_loginName("aaa" + i);
            user.setU_email("abc"+ i +"@gmail.com");
            user.setU_passWord("nicai" + i);
            user.setU_state(1);
            user.setU_trueName("bushuo" + i);
            userService.addUser(user);
        }
    }

    public void testDeleteById() {
    }

    public void testUpdateById() {
    }
}