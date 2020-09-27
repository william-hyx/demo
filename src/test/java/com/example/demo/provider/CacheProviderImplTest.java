package com.example.demo.provider;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@Slf4j
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CacheProviderImplTest {
    @Autowired
    CacheProvider cacheProvider;

    String key1 = "key1";
    String value1 = "value1";
    String key2 = "key2";
    int value2 = 100;

    @Order(1)
    @Test
    void set() {
        cacheProvider.set(key1, value1);
    }

    @Order(2)
    @Test
    void testSet() {
        cacheProvider.set(key2, value2, 1000);
    }

    @Order(3)
    @Test
    void get() {
        Assert.assertNotEquals(value1, cacheProvider.get(key1));
        Assert.assertNotEquals(value2, cacheProvider.get(key2));
    }

    @Order(4)
    @Test
    void testGet() {
        Assert.assertEquals(true, StringUtils.equals(value1, cacheProvider.get(key1, String.class)));
    }

    @Order(5)
    @Test
    void del() {
        cacheProvider.del(key1);
    }

    @Order(6)
    @Test
    void hasKey() {
        Assert.assertEquals(false, cacheProvider.hasKey(key1));
        Assert.assertEquals(true, cacheProvider.hasKey(key2));
    }
}