package com.hb.demo.test.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        final Map map = new HashMap();
        map.put("1",1);
        map.put("1",2);
        System.out.println(map.get("1"));

    }
}
