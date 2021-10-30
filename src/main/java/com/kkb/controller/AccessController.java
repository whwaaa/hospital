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
    public AjaxResultVo login(User user){
        List<User> users = accessService.queryByUserNameAndPassword(user);
        if(users == null || users.size() == 0){
            // 用户名或密码错误
            return new AjaxResultVo(401, "用户名或密码错误");
        }
        user = users.get(0);
        if(user.getU_state() != 0){
            // 角色禁用
            return new AjaxResultVo(401, "此用户被禁用请联系管理员。");
        }
        // 将用户id和用户名称封装, 生成jwtToken令牌返回
        Map<String, Object> payLoadMap = new HashMap<>();
        payLoadMap.put("u_id", user.getU_id());
        payLoadMap.put("u_loginName", user.getU_loginName());
        String jwtToken = JWTUtil.generToken(payLoadMap);
        return new AjaxResultVo(200, "ok", jwtToken);
    }


    // 获取用户名信息, 并判断用户是否登录 前端jwtToken已经保存用户名信息,
    // 再次通过后端解析jwtToken可经过拦截器, 判断jwtToken是否过期
    @RequestMapping(value = "/access/login", method = RequestMethod.GET)
    public AjaxResultVo isLogin(@RequestParam(value = "jwtToken", required = false) String jwtToken) throws JWTTokenInvalidException {
        Claims claims = null;
        try {
            claims = JWTUtil.verifyToken(jwtToken);
        } catch (Exception e) {
            // jwtToken刚好过期
            throw new JWTTokenInvalidException("token失效, 验证失败");
        }
        // 正常解析返回用户名
        String u_loginName = claims.get("u_loginName").toString();
        return new AjaxResultVo(200, "ok", u_loginName);
    }
}
