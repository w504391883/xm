package com.xxd.main;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.concurrent.TimeUnit;

public class RedisTest extends BaseTest {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void testConn() throws InterruptedException {
        long old = System.currentTimeMillis();
        stringRedisTemplate.opsForValue().set("aaa", "111");
      //  stringRedisTemplate.expire("aaa",10, TimeUnit.SECONDS);
        System.out.println(stringRedisTemplate.opsForValue().get("aaa"));
        System.out.println("写入并且读取用了"+( System.currentTimeMillis()-old));
       // Thread.sleep(10000);
      //System.out.println(stringRedisTemplate.opsForValue().get("aaa"));
     //   Assert.assertEquals(null, stringRedisTemplate.opsForValue().get("aaa"));
    }
}
