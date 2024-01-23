package com.hb.demo.test.thread;

public class LambdaThreadTest {
    public static void main(String[] args) {
        // Thread t = new Thread(() -> {
        //     for (int i = 0; i < 10; i++) {
        //         System.out.println("新建线程->" + ":" + i);
        //     }
        // });
        // t.start();
        // System.out.println("主线程执行结束");
        String str = "1.6.6 (1112)";
        int index = str.indexOf("(");
        System.out.println(index);
    }
}
