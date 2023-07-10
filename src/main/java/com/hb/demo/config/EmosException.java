package com.hb.demo.config;

/**
 * 自定义异常类
 */
public class EmosException extends RuntimeException{
    private  int code = 500;
    private  String msg;

    //构造方法的补充
    public EmosException(String msg){
        super(msg);
        this.msg=msg;

    }

    public EmosException(String msg,int code){
        super(msg);
        this.msg=msg;
        this.code=code;
    }

    public EmosException(String msg,Throwable e){
        super(msg,e);
        this.msg=msg;
    }

    public EmosException(String msg,int code,Throwable e){
        super(msg,e);
        this.msg=msg;
        this.code=code;
    }
}
