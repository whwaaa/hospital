package com.kkb.controller;

import com.kkb.exceptions.JWTTokenInvalidException;
import com.kkb.pojo.Role;
import com.kkb.pojo.User;
import com.kkb.service.AccessService;
import com.kkb.service.RoleService;
import com.kkb.utils.JWTUtil;
import com.kkb.vo.AjaxResultVo;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping(value = "access")
public class AccessController {

    @Autowired
    private AccessService accessService;

    @Autowired
    private RoleService roleService;

    // 用户登陆验证
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public AjaxResultVo login(HttpServletRequest request, HttpServletResponse response, User user) throws JWTTokenInvalidException {
        // 验证用户名密码是否正确
        List<User> users = accessService.queryByUserNameAndPassword(user);
        if(users == null || users.size() == 0){
            // 用户名或密码错误
            return new AjaxResultVo(401, "用户名或密码错误");
        }
        user = users.get(0);
        if(user.getuState() != 0){
            // 用户被禁用
            return new AjaxResultVo(403, "此用户被禁用请联系管理员。");
        }
        Role role = roleService.queryByRId(user.getrId());
        if(role.getrState() != 0){
            // 角色被禁用
            return new AjaxResultVo(403, "此用户所属角色被禁用请联系管理员。");
        }

        // 生成token存入cookie
        return accessService.createToken(request, response, user);
    }

    // 获取用户信息
    @RequestMapping(value = "user", method = RequestMethod.GET)
    public AjaxResultVo getUserMessage(HttpServletRequest request){
        User user = accessService.paseUserMessage(request);
        if(user != null){
            return new AjaxResultVo(200, "ok", user);
        }
        return new AjaxResultVo(401, "用户信息过期");
    }

    // 验证原始密码是否一致
    @RequestMapping(value = "verify-password", method = RequestMethod.POST)
    public AjaxResultVo verifyPassword(User user){
        // 验证原始密码是否一致
        List<User> users = accessService.queryByUserIdAndPassword(user);
        if(users == null || users.size() == 0){
            // 密码验证失败
            return new AjaxResultVo(401, "与原始密码不一致");
        }
        return new AjaxResultVo();
    }

}
