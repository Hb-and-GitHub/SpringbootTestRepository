package com.hb.demo.test.string;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class TestUTF {
    public static void main(String[] args) {
        String encodedString = "d%2F6r3eF8ssC8g8s%2BuwkOREUGtS0yrk4oEa2z6fBtEXElIIZDJ7ATZ6zD9rcZFgQRdEsYz5yNvYWs%0AdqIpjaGSEqh3j8PGYLW1iVA%2F0oWFzZQUZI4g4HSv1366ZDCDibxskr7gmtBAIb3lM8DhbjFpOwc8%0AJSJz%2F4BarkzRPTtDw3Abh3v4MSHl3Hu3RL4JDeBwpOO9NYDLQjCWk0bwR1JKkNV6HeYU7dDXctx8%0A692V9Z31yFHda4udSylA13HtVFOjR7%2BFp42ywP2gBXaO%2FTTsjncpMx495YQ6NQzNqmzJFtSv1dg6%0AB1PJKi%2BH%2Fzq6jpVY6zMd%2FeS5hdDaDLquUjfttK9UBME%3D|预订|5l000G181450|G1814|AOH|ZAF|AOH|UUH|14:05|16:15|02:10|N|zvw9kCzjian1Gc6AQ1XS6BpkGbwYFelL0La1Q%2B5M6kYhPUtf|20240125|3|H6|01|03|1|0|||||||||||无|无|无||90M0O0|9MO|0|1||9110000000M052700000O031900000|0|||||1|0#1#0#0#z#0#z||7|CHN,CHN|||N#N#||90094M0098O0095|202401111330|";

        try {
            String decodedString = URLDecoder.decode(encodedString, "UTF-8");
            System.out.println(decodedString);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
