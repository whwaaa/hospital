package com.kkb.interceptor;

import com.kkb.exceptions.JWTTokenInvalidException;
import com.kkb.utils.JWTUtil;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 权限控制, 每一次请求需要带上JWTToken
 *
 * @author wuhanwei
 * @version 1.0
 * @date 2021/10/28
 */
public class AccessControlInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String jwtToken;
        jwtToken = request.getParameter("jwtToken");
//        // 获取请求中的token
//        Cookie[] cookies = request.getCookies();
//        // 遍历cookie
//        if(cookies != null){
//            for (Cookie cookie : cookies) {
//                // 查找name=jwtToken的cookie
//                if(cookie.getName()!=null && "jwtToken".equals(cookie.getName())){
//                    jwtToken = cookie.getValue();
//                }
//            }
//        }
        if(jwtToken != null){
            // 验证成功则更新token, 验证失败抛出异常
            String newJwtToken = null;
            try {
                // 验证成功并更新token
                newJwtToken = JWTUtil.updateToken(jwtToken);
            } catch (Exception e) {
                // token验证失败
                throw new JWTTokenInvalidException("token失效");
            }
            // 更新cookie
            try {
                Cookie cookie = new Cookie("jwtToken", newJwtToken);
                // 获取前端请求域名
                cookie.setPath("/");
//                String domain = request.getRequestURL().toString().split("/")[2];
//                cookie.setDomain(domain);
                cookie.setMaxAge(3*24*60*60);     // 设置过期时间3天 3*24*60*60秒
                response.addCookie(cookie);
                // 设置jwt
                // 后端没有域名设置cookie不会成功, 改用响应头传参, 前端再设置cookie
                response.addHeader("jwt", newJwtToken);
            } catch (Exception e) {
                throw new JWTTokenInvalidException("cookie的域名不能设置为ip地址,本地调试请在前端页面改用localhost访问");
            }
            // 放行
            return true;
        }
        // 没有token, 跳转登陆
        throw new JWTTokenInvalidException("没有token");
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
