package com.hb.demo.test.redissionTest;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@Slf4j
public class RedissionTest {

    @Resource
    private static RedissonClient redissonClient;

    private static RLock rLock;


    @Test
    public void testRedission() throws InterruptedException {
        rLock = redissonClient.getLock("test");
        boolean lock = rLock.tryLock(1L, TimeUnit.SECONDS);
        if(!lock){
            log.error("获取锁失败");
            return;
        }
        try {
            log.info("获取锁成功。。。");
            method();
        } finally {
            log.info("开始执行业务。。。main");
            rLock.unlock();
        }

    }
    static void method(){
        boolean b = rLock.tryLock();
        if(!b){
            log.error("获取锁失败");
            return ;
        }
        try {
            log.info("获取锁成功。。。method");
            log.info("开始执行业务");
        } finally {
            log.warn("准备释放锁...method");
            rLock.unlock();
        }
    }
}
