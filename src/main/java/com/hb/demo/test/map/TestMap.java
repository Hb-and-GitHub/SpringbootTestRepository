package com.hb.demo.test.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 1;i<=10;i++){
            map.put(String.valueOf(i),i);
        }
        ArrayList<Map.Entry<String ,Integer>> list = new ArrayList<>();
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for (Map.Entry i : set){
            list.add(i);
        }
        for(Map.Entry i : list){
            System.out.println(i);
        }
        list.stream().filter(e->e.getValue()<5).map(e->e.getValue()).forEach(System.out :: println);
    }
}
