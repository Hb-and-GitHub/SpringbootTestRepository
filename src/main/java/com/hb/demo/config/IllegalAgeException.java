package com.hb.demo.config;




public class IllegalAgeException extends RuntimeException {

    public IllegalAgeException() {

        super("年龄不能小于19");

    }

}




