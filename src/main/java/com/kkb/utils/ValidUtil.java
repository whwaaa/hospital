package com.kkb.utils;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.List;

/**
 * show 用于校验参数的工具类
 *
 * @author guguofu
 * @since 2021/11/3
 */
public class ValidUtil {

    // 从绑定的参数中返回错误的信息字符串。
    public static String getErrorMessage(BindingResult result){
        boolean hasError = result.hasErrors();
        if (hasError){
            StringBuilder errorMessage = new StringBuilder();
            List<FieldError> errors = result.getFieldErrors();
            for (FieldError fe : errors){
                /* 这个是测试用来提示哪个字段不正确使用的 */
//                errorMessage.append(fe.getField());
//                errorMessage.append(":");
                errorMessage.append(fe.getDefaultMessage());
                errorMessage.append(";");
            }
            errorMessage.replace(errorMessage.lastIndexOf(";"),errorMessage.lastIndexOf(";")+1,"。");
            return errorMessage.toString();
        }else {
            return "";
        }
    }

}













