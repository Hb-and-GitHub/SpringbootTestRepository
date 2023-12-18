package com.hb.demo.test_hb;


import org.junit.Test;
import org.springframework.util.DigestUtils;

import java.util.*;

/**
 * 测试MD5加密方法
 */

public class Test002 {

    public String MD5method(String num){
        String salt = "qwer";
        //MD5加密
        int nums = 1;
        return DigestUtils.md5DigestAsHex((salt+num+salt).getBytes()).toUpperCase();
    }
    @Test
    public void method(){
        System.out.println(MD5method("1112"));
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer a: list){
            System.out.println(a);
//            int i =1;
//            String key = String .format("key:%d",i++);
            int[] arr = new int[5];
            map.put(a++,a);
        }
        System.out.println(map);
    }
    @Test
    public void replace_str(){
        String str_name = "tg";
        String Monday = "monday";
        String str = "hello ${str_name},today is ${Monday}.";
        String message = str.replace("${str_name}",str_name)
                .replace("${Monday}",Monday);
        System.out.println(message);
    }

    public void sortSet(){
        Scanner sc = new Scanner(System.in);

        HashSet set = new HashSet<>();

        for(int i = 0;i<5;i++){
            int num = sc.nextInt();
            set.add(num);
        }

        for(Object num : set){
            System.out.println(num);
        }
    }

}