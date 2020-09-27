package com.example.demo.provider;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: huangyixin
 * @create: 2020/9/27 14:40
 **/
@Slf4j
@Service
public class CacheProviderImpl implements CacheProvider {

    @Autowired
    RedisTemplate<String, String> redisTemplate;

    @Override
    public <T> boolean set(String key, T value) {
        return redisTemplate.execute((RedisCallback<Boolean>) action -> {
            RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
            Gson gson = new Gson();
            action.set(Objects.requireNonNull(serializer.serialize(key)), Objects.requireNonNull(serializer.serialize(gson.toJson(value))));
            return true;
        });
    }

    @Override
    public <T> Boolean set(String key, T value, long expireTime) {
        set(key, value);
        return redisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
    }

    @Override
    public <T> T get(String key, Class<T> clazz) {
        Gson gson = new Gson();
        return gson.fromJson(get(key), clazz);
    }

    @Override
    public String get(String key) {
        return redisTemplate.execute((RedisCallback<String>) action -> {
            RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
            byte[] value = action.get(Objects.requireNonNull(serializer.serialize(key)));
            return serializer.deserialize(value);
        });
    }

    @Override
    public Boolean del(String key) {
        return redisTemplate.delete(key);
    }

    @Override
    public Boolean hasKey(String key) {
        return redisTemplate.hasKey(key);
    }
}
