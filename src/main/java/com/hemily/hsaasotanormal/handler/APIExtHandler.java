package com.hemily.hsaasotanormal.handler;


import com.hemily.hsaasotanormal.dto.APIResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 系统统一异常处理类
 */
@RestControllerAdvice
public class APIExtHandler {

    @ExceptionHandler(value = Exception.class)
    APIResult handlerException(Exception ex, HttpServletRequest request){
        return APIResult.error();
    }


}