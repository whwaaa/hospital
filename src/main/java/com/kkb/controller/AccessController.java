package com.kkb.controller;

import com.kkb.exceptions.JWTTokenInvalidException;
import com.kkb.pojo.User;
import com.kkb.service.AccessService;
import com.kkb.utils.JWTUtil;
import com.kkb.vo.AjaxResultVo;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 账户登陆登出控制器
 * @author wuhanwei
 * @version 1.0
 * @date 2021/10/28
 */
@Controller
@ResponseBody
public class AccessController {

    @Autowired
    private AccessService accessService;

    // 用户登陆验证
    @RequestMapping(value = "/access/login", method = RequestMethod.POST)
    public AjaxResultVo login(HttpServletResponse response, User user){
        // 验证用户名密码是否正确
        List<User> users = accessService.queryByUserNameAndPassword(user);
        if(users == null || users.size() == 0){
            // 用户名或密码错误
            return new AjaxResultVo(401, "用户名或密码错误");
        }
        user = users.get(0);
        if(user.getuState() != 0){
            // 角色禁用
            return new AjaxResultVo(401, "此用户被禁用请联系管理员。");
        }
        // 生成token存入cookie
        return accessService.createToken(response, user);
    }

    // 获取用户信息
    @RequestMapping(value = "/access/user", method = RequestMethod.GET)
    public AjaxResultVo getUserMessage(HttpServletRequest request){
        User user = accessService.paseUserMessage(request);
        if(user != null){
            return new AjaxResultVo(200, "ok", user);
        }
        return new AjaxResultVo(401, "用户信息过期");
    }
}
