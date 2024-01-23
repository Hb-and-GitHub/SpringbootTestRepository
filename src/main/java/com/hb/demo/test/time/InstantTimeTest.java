package com.hb.demo.test.time;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class InstantTimeTest {
    public static void main(String[] args) {
        //获取当前时间戳
        Instant now = Instant.now();
            //2023-12-21T08:24:31.903Z

        //创建指定时间戳
        Instant milli = Instant.ofEpochMilli(1639999999000L);
            //2021-12-20T11:33:19Z

        //时间戳格式化输出
        String s = milli.toString();
            //2021-12-20T11:33:19Z

        //时间戳与日期时间的转换
        LocalDateTime localDateTime = LocalDateTime.ofInstant(milli, ZoneId.systemDefault());
            //2021-12-20T19:33:19
        Instant instant = localDateTime.toInstant(ZoneOffset.UTC);
            //2021-12-20T19:33:19Z

    }
}
