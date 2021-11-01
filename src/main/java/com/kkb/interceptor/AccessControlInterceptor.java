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
        // 获取请求中的token
        Cookie[] cookies = request.getCookies();
        String jwtToken = null;
        // 遍历cookie
        if(cookies != null){
            for (Cookie cookie : cookies) {
                // 查找name=jwtToken的cookie
                if(cookie.getName()!=null && "jwtToken".equals(cookie.getName())){
                    jwtToken = cookie.getValue();
                }
            }
        }
        if(jwtToken != null){
            // 验证成功则更新token, 验证失败抛出异常
            try {
                // 验证成功并更新token
                String newJwtToken = JWTUtil.updateToken(jwtToken);
                Cookie cookie = new Cookie("jwtToken", newJwtToken);
                cookie.setPath("/");
                cookie.setMaxAge(3*24*60*60);     // 设置过期时间3天 3*24*60*60秒
                response.addCookie(cookie);
                // 放行
                return true;
            } catch (Exception e) {
                // token验证失败
                throw new JWTTokenInvalidException("token失效");
            }
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
