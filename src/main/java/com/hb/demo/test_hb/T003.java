package com.hb.demo.test_hb;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class T003 {
    public static void main(String[] args){
        int[] arr = new int[]{4,3,2,5,1};
        int len = arr.length;
        log.info("排序前:", arr);
        for(int i : arr){
            System.out.print(i);
        }
        Arrays.sort(arr);
        log.info("排序后:",arr );
        for(int i : arr){
            System.out.print(i);
        }
        List names = Arrays.asList(new String[]{"aaa","bbb"});
        System.out.println(names);
        Queue<Object> Queue = new LinkedList<>();
        Queue.add(1);
        Queue.add(2);
        System.out.println(Queue.peek()+"  "+Queue.size());
        Stack<Integer> integers = new Stack<>();
        integers.push(1);
        integers.push(2);
        System.out.println(integers.peek()+"   "+integers.pop()+"   "+integers.peek());
    }
}
