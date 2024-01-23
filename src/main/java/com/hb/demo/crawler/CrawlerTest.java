package com.hb.demo.crawler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class CrawlerTest {
    public static void main(String[] args) {
        try {
            // 创建URL对象
            URL url = new URL("https://www.baidu.com");

            // 打开连接
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            // 读取网页内容
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // 关闭连接
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
