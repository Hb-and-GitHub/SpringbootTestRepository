package com.hb.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.util.UriComponentsBuilder;
@SpringBootTest
class DemoApplicationTests {

    @Test
//        public static void main(String[] args) {
//            // 创建一个基础的URI
//            UriComponentsBuilder builder = UriComponentsBuilder.fromUriString("https://example.com");
//
//            // 添加路径参数
//            builder.path("/api/users/{id}").buildAndExpand(123);
//
//            // 添加查询参数
//            builder.queryParam("page", 1)
//                    .queryParam("limit", 10);
//
//            // 构建最终的URI
//            String uri = builder.build().toUriString();
//            System.out.println(uri);
//        System.out.println("OK"+1+2);
//        }


    public static void main(String[] args) {
            System.out.println(val());
        }

    public static int val() {
        int num = 5;
        try {
            num = num / 0;
        } catch (Exception e) {
            num = 10;
        } finally {
            num = 15;
        }
        return num;
    }

}
