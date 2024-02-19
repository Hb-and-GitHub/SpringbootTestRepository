package com.hb.demo.test.time;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class TimeTest {

    public static void main(String[] args) {
        // //获取当前日期
        // LocalDate localDate = LocalDate.now();
        // //获取日期的年月日
        // int year = localDate.getYear();
        // Month month = localDate.getMonth();
        // int dayOfMonth = localDate.getDayOfMonth();
        //
        // //创建指定日期
        // LocalDate specialDate = LocalDate.of(2024, 12, 21);
        // LocalDateTime specialDateTime = LocalDateTime.of(2023, 12, 21,16,12,30);
        // //日期格式化输出
        // String formatDate = specialDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        // //日期运算
        // LocalDate localDatePlus = specialDate.plusDays(7);
        // //判断日期先后
        // boolean isBefore = localDatePlus.isBefore(localDate);
        // //日期间隔
        // long daysBetween = ChronoUnit.DAYS.between(localDate, localDatePlus);

        Date date = new Date();
        long time = date.getTime();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(time);
        System.out.println(date);
        System.out.println(localDateTime);

    }
}
