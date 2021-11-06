package com.kkb.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
/**
 * 静态注入中间类
 *
 * @author wuhanwei
 * @version 1.0
 * @date 2021/11/6
 */
public class RedisCacheTransfer {
    @Autowired
    public void setRedisTemplate(RedisTemplate redisTemplate) {
        RedisCache.setRedisTemplate(redisTemplate);
    }
}