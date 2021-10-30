package com.kkb.controller;

import com.kkb.mapper.UserMapper;
import com.kkb.pojo.User;
import com.kkb.pojo.UserExample;
import com.kkb.service.UserService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;

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

    @Resource
    private UserMapper userMapper;

    @Test
    public void testQueryByPage() {
    }

    public void testQueryById() {
    }

    @Test
    public void testAddUser() {

    }

    @Test
    public void testDeleteById() {
        User user = new User();
        user.setuId(21);
        user.setuIsDel(1);
        user.setuUpdateTime(new Date());
        int i = userMapper.updateByPrimaryKeySelective(user);
    }

    public void testUpdateById() {
    }
}