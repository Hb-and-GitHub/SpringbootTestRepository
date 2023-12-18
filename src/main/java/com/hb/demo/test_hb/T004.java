package com.hb.demo.test_hb;

import com.mysql.cj.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class T004 {

    public static void main(String[] args){
        List<String> list = Arrays.asList("1aw", "22q", "111", "");
        System.out.println(list.size());
        ArrayList<String> list1 = list.stream().filter(e -> !StringUtils.isNullOrEmpty(e)).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(list1.size());
        for(String i:list1){
            System.out.println(i);
        }
        String str = "   ";
        String str1 = "";
        System.out.println(str.length()+"..."+str1.length());

    }
}
