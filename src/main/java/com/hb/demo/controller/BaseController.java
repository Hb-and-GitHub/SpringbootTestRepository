package com.hb.demo.controller;

import com.google.protobuf.ServiceException;
import com.hb.demo.utils.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 控制层的基类
 */
public class BaseController {

    public static  final int SUCCESS = 200;

    @ExceptionHandler(ServiceException.class)
    public Result<Void> handleException(Throwable e){
        Result<Void> result = new Result<>(e);
        if(e instanceof  Exception){
            result.setState(400);
            result.setMessage("未知错误");
        }
        else{
            result.setState(200);
            result.setMessage("成功");
        }
        return  result;
    }
}
