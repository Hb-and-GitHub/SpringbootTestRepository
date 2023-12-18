package com.hb.demo.test_hb;

import java.io.*;

public class singleton {
    //懒汉式单例模式
    private  static  singleton instance;
    private singleton(){}
    public static synchronized singleton getInstance(){
        if(instance==null){
            instance = new singleton();
        }
        return instance;
    }
}

class Singleton{
    //饿汉式单例模式
    private static Singleton instance = new Singleton();
    private Singleton(){

    }
    public static synchronized Singleton getInstance(){
        return instance;
    }
}
final class MyUtil{
    private  MyUtil(){
        throw new AssertionError();
    }
    public static void fileCopy(String source,String target) throws IOException{
        try(InputStream in = new FileInputStream(source)){
            try(OutputStream out = new FileOutputStream(target)){
                byte[] buffer = new byte[4096];
                int bytesToRead;
                while((bytesToRead = in.read(buffer))!=-1){
                    out.write(buffer,0,bytesToRead);
                }
            }
        }
    }
}
