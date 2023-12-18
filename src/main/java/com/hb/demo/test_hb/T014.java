package com.hb.demo.test_hb;

public class T014 {
    public static void main(String[] args) {
        final String s = "abc";
        String x = "abc" + "def";
        String y = s + "def";
        String z = x + "abc";
        String z1 = s + "def" + "abc";


        String s1 = "black";
        String s2 = "board";
        String s3 = s1 + s2;
        String s4 = "black" + s2;
        System.out.println("s3==s4 " + (s3 == s4));
        System.out.println(s4.intern() == s3.intern());

        Integer i1 = 50;
        Integer i2 = 50;
        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i1 == i2);//true
        System.out.println(i3 == i4);//false
        System.out.println(i1.equals(i2));//true
        System.out.println(i1.equals(i2));//true
        System.out.println(i3.equals(i4));//true

    }
}


