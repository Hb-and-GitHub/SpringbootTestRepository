package com.hb.demo.utils;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result<E> implements Serializable {
    /**
     * 状态码
     */
    private  Integer state;

    private String message;

    private E data;

    public Result(Throwable e) {

    }

    public Result() {

    }
}
