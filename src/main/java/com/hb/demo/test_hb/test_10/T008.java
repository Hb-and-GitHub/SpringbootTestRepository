package com.hb.demo.test_hb.test_10;

import java.util.ArrayList;

public class T008 {
    public static void main(String[] args) throws Exception{
        try {
            // 可能会抛出异常的代码
            int result = 10 / 0; // 这里会抛出 ArithmeticException
        } catch (ArithmeticException e) {
            // 只是打印日志，没有重新抛出异常
            System.out.println("发生了算术异常：" + e.getMessage());

        }
        ArrayList list = new ArrayList<>();
// 后续的代码会继续执行
        System.out.println("异常处理后的代码");
        System.out.println("size"+ "   "+ list.size());

    }
}
