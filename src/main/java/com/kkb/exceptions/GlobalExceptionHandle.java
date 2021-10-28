package com.kkb.exceptions;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
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
            logger.debug(e.getMessage());
            mv.setViewName("/index/login");
        }
        return mv;
    }
}
