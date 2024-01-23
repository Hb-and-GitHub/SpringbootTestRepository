package com.hb.demo.test.redis;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;


import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@SpringBootTest
public class RedisTest {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testRedis(){
        redisTemplate.opsForValue().set("testKey","testValue",30, TimeUnit.SECONDS);
        System.out.println("key-value设置成功");
        System.out.println("取值结果："+redisTemplate.opsForValue().get("testKey"));
    }
}
