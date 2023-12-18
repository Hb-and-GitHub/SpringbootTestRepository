package com.hb.demo.test_hb.test_10;

import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class T007 {
    // public static void main(String[] args) {
    //     Map<Integer,String> map = new HashMap<>();
    //     map.put(104,"value_4");
    //     map.put(103,"value_3");
    //     map.put(101,"value_1");
    //     map.put(102,"value_2");
    //
    //     map.entrySet().stream().forEach(System.out :: println);
    //     System.out.println("按值降序排序之后：------------------------");
    //     map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out :: println);
    // }

    // public static void main(String[] args) {
    //     TreeMap<Integer, String> map = new TreeMap<>();
    //         map.put(104,"value_4");
    //         map.put(103,"value_3");
    //         map.put(101,"value_1");
    //         map.put(102,"value_2");
    //
    //         //降序排序
    //     map.descendingMap().entrySet().stream().forEach(System.out :: println);
    //     System.out.println("过滤小于等于指定键后------------------------------");
    //     map.headMap(102,true).entrySet().stream().forEach(System.out :: println);
    //     System.out.println("过滤大于等于指定键后------------------------------");
    //     map.tailMap(102,true).entrySet().stream().forEach(System.out :: println);
    //     System.out.println("过滤指定区间键后------------------------------");
    //     map.subMap(101,false,103,true).entrySet().stream().forEach(System.out :: println);
    //
    //
    //     String guidString = "287d81b3b22041c2b56e5a0443f84e9f";
    //
    //     // 将16进制的GUID字符串转换为BigInteger
    //     BigInteger bigInteger = new BigInteger(guidString, 16);
    //
    //     System.out.println("GUID转换后的BigInteger值: " + bigInteger);
    // }

    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String > map = new ConcurrentHashMap<>();
        map.put(104,"value_4");
        map.put(103,"value_3");
        map.put(101,"value_1");
        map.put(102,"value_2");
        System.out.println("map的大小为："+map.size());
        System.out.println("----------------------------------------------");
        System.out.println("map是否包含key:104   "+map.containsKey(104));
        System.out.println("----------------------------------------------");
        map.replace(104,"新的Value_4");
        System.out.println("map更改后的104的值：   "+map.get(104));
    }
}
