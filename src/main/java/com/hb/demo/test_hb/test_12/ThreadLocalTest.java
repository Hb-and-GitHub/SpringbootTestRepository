package com.hb.demo.test_hb.test_12;

public class ThreadLocalTest {
    static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        new Thread(()->{
            String name = Thread.currentThread().getName();
            threadLocal.set("test_1");
            printThread(name);
            System.out.println(name + " after remove :"+threadLocal.get());
        },"t1").start();

        new Thread(()->{
            String name = Thread.currentThread().getName();
            threadLocal.set("test_2");
            printThread(name);
            System.out.println(name + " after remove :"+threadLocal.get());
        },"t2").start();
    }

    static void printThread(String str){
        //打印当前线程本地变量的值
        System.out.println(str + " :"+threadLocal.get());
        //清除本地变量的值
        threadLocal.remove();

    }

}
