package com.hb.demo.test_hb.test_10;

public class T006 {
    public String minWindow(String s, String t) {
        if(t.length()==1 && s.contains(t)){
            return t;
        }
        if(s.length()<t.length()){
            return null;
        }
        return null;
    }
}
