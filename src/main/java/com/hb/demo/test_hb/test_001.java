package com.hb.demo.test_hb;

public class test_001 {

    public static void main(String[] args)   {
        Father a = new Father();
        a.print();
    }

}
class Father{
    void print(){
        System.out.println("father");
    }
}
class childern extends Father{
    void print(){
        super.print();
        System.out.println("child");
    }
}