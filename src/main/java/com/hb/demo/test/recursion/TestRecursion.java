package com.hb.demo.test.recursion;

import java.io.File;

public class TestRecursion {

    public static void main(String[] args) {
        String filePath = "C:\\";
        getFiles(filePath);

    }

    static void getFiles(String path){
        File file = new File(path);
        //该判断用于监测输入的文件地址是否存在
        if(!file.exists()){
            System.out.println("not exists");
            return;
        }
        File[] files = file.listFiles();
        if(files == null){
            System.out.println("列表为空");
            return;
        }
        for(File i : files){
            if(i.isFile()){
                System.out.println("file is :"+i.getAbsolutePath());
            }
            else if(i.isDirectory()){
                getFiles(i.getAbsolutePath());
            }
        }
    }
}
