package com.hb.demo.test_hb;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class T005 {
    public static void main(String[] args){
        LocalDate ld = LocalDate.now();
        LocalTime of = LocalTime.of(10, 30);
        LocalTime of1 = LocalTime.of(12, 0);
        LocalDateTime now = LocalDateTime.now();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LocalDateTime now2 = LocalDateTime.now();
        Duration between = Duration.between(of, of1);

        Duration between1 = Duration.between(now, now2);
        System.out.println("现在时间："+ ld+"---"+of+"---"+of1+"---"+now+"---"+between+"---"+between1);
    }
}
