package com.kkb.interceptor;

import com.kkb.exceptions.JWTTokenInvalidException;
import com.kkb.utils.JWTUtil;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

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
        String jwtToken = request.getParameter("JWTToken");
        if(jwtToken != null){
            // 验证成功则更新token, 验证失败抛出异常
            try {
                JWTUtil.updateToken(jwtToken);
                // 验证成功并更新token,放行
                return true;
            } catch (Exception e) {
                // token验证失败
                throw new JWTTokenInvalidException("token失效, 验证失败");
            }
        }
        // 没有token, 跳转登陆
        throw new JWTTokenInvalidException("没有token, 跳转登陆");
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
