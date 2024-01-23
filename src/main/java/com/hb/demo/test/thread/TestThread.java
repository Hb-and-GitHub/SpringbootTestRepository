package com.hb.demo.test.thread;

public class TestThread {
    volatile static int i = 0;
    public static void main(String[] args) {
        for(int j = 0;j<10;j++){
            Thread thread = new Thread(() -> {
                System.out.println("1");
            },"th"+j);
            thread.start();
        }
    }
}
