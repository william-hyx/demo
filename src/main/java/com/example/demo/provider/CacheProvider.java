package com.example.demo.provider;

public interface CacheProvider {

    <T> boolean set(String key, T value);

    <T> Boolean set(String key,  T value, long expireTime);

    <T> T get(String key, Class<T> clazz);

    String get(String key);

    Boolean del(String key);

    Boolean hasKey(String key);
}
