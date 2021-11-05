package com.kkb.exceptions;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 全局异常处理
 * @author wuhanwei
 * @version 1.0
 * @date 2021/10/28
 */
@Component
public class GlobalExceptionHandle implements HandlerExceptionResolver {
    // 日志输出
    private final Logger logger = Logger.getLogger(org.apache.commons.logging.Log.class);

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) {
        ModelAndView mv = new ModelAndView();
        // JWTToken验证失败异常
        if(e instanceof JWTTokenInvalidException){
            String message = e.getMessage();
            logger.debug(message);
            // 判断请求的如果是ajax
            if("XMLHttpRequest".equals(request.getHeader("X-Requested-With"))){
                if("token失效".equals(message)){
                    response.setHeader("TOKEN-MSG", "token-invalid");
                }else if("没有token".equals(message)){
                    response.setHeader("TOKEN-MSG", "no-token");
                }
                // 返回重定向head标志给前端ajax
                response.setHeader("REDIRECT", "REDIRECT");
                // 返回重定向路径给前端ajax
                response.setHeader("CONTENTPATH", "/index/login.html");
                response.setStatus(HttpServletResponse.SC_FORBIDDEN); // 添加403状态码 (服务器拒绝)
            }else{
                try {
                    response.sendRedirect("/index/login.html");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return mv;
    }
}
