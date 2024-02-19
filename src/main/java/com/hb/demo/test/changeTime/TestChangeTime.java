package com.hb.demo.test.changeTime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class TestChangeTime {
    public static void main(String[] args) {
        // LocalDateTime now = LocalDateTime.now();
        Instant now = Instant.now();
        long l = now.toEpochMilli();
        System.out.println(l);
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(l), ZoneId.systemDefault());
        System.out.println(localDateTime.toString());
        System.out.println(localDateTime);

    }
}
