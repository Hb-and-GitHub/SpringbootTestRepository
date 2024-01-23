// package com.hb.demo.test.redissionTest;
//
// import org.junit.Test;
// import org.springframework.data.redis.core.HashOperations;
// import org.springframework.data.redis.core.RedisTemplate;
// import org.springframework.data.redis.core.StringRedisTemplate;
// import org.springframework.data.redis.core.ValueOperations;
//
// import javax.annotation.Resource;
//
//
// public class RedisTest {
//
//     @Resource
//     private RedisTemplate redisTemplate;
//
//     @Resource
//     private StringRedisTemplate stringRedisTemplate;
//
//     @Test
//     public void addToRedis(){
//         ValueOperations valueOperations = redisTemplate.opsForValue();
//         valueOperations.set("key_1","value_1");
//         System.out.println("添加字符成功");
//     }
//
//     @Test
//     public void getData(){
//         ValueOperations valueOperations = redisTemplate.opsForValue();
//         Object key_1 = valueOperations.get("key_1");
//         System.out.println("获取到值为："+key_1);
//
//     }
// }
