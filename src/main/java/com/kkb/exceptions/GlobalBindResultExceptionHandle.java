package com.kkb.exceptions;

import com.kkb.utils.ValidUtil;
import com.kkb.vo.AjaxResultVo;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * show 处理参数校验的异常
 *
 * @author guguofu
 * @since 2021/11/4
 */
@RestControllerAdvice
public class GlobalBindResultExceptionHandle {

    /**
     * JSR303参数校验的异常
     * @param e BindException
     * @return 消息提示
     */
    @ExceptionHandler(BindException.class)
    public AjaxResultVo bindExceptionHandler(BindException e){
        String errorMessage = ValidUtil.getErrorMessage(e);
        return new AjaxResultVo(400,errorMessage);
    }
}
