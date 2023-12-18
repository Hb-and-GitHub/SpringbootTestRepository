package com.hb.demo.test_hb.test_10;

public class T001 {

    private volatile String str;
    private String num;

    public synchronized static void main(String[] args) {

    }

    synchronized void getStr() {
        System.out.println("str");
    }

    String getString() {
        System.out.println("getString");
        return "getString";
    }
}
