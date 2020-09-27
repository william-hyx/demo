package com.example.demo.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;

/**
 * @description: 生成随机字符串
 * @author: huangyixin
 * @create: 2020/9/24 16:50
 **/
@Slf4j
public class RandStringUtil {
    private static final String CHARS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ~!@#$%^&*()_+";
    public RandStringUtil() {

    }

    public static String generateRandomString(int length) {
        return RandomStringUtils.random(length, CHARS);
    }

    public static String generateAlphanumericRandomString(int length) {
        return RandomStringUtils.randomAlphanumeric(length);
    }
}
