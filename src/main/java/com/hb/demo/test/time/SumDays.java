package com.hb.demo.test.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class SumDays {
    public static void main(String[] args) {
        LocalDate now = LocalDate.of(2023, 12, 21);
        LocalDate end = LocalDate.of(2024, 11, 11);

        int days = 0;
        LocalDate localDate = now;
        while(localDate.isBefore(end) || localDate.isEqual(end)){
            if(localDate.getDayOfWeek() != DayOfWeek.SATURDAY && localDate.getDayOfWeek() != DayOfWeek.SUNDAY){
                days ++;
            }
            localDate = localDate.plusDays(1);
        }
        System.out.println("现在的日期是："+now+ "  到2024年双11相隔天数（不包括周六周日）："+days);

    }
}
