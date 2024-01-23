package com.hb.demo.test.sortMethod;

import java.util.Arrays;
import java.util.Comparator;

public class SortTest {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,3,7,5,9,2};
        System.out.println("排序前：------");
        for(Integer i : arr){
            System.out.print(i);
        }
        Arrays.sort(arr,new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println("排序后：");
        for(Integer i : arr){
            System.out.print(i);
        }
    }
}
