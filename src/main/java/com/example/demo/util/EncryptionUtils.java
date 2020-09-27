package com.example.demo.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * @description:
 * @author: huangyixin
 * @create: 2020/9/24 16:40
 **/
@Slf4j
public class EncryptionUtils {
    public EncryptionUtils(){

    }

    public static String md5(String s) {
        return DigestUtils.md5Hex(s);
    }

    public static String sha256(String s) {
        return DigestUtils.sha256Hex(s);
    }

    public static String passwordEncrpytion(String password, String salt) {
        return sha256(md5(password) + salt);
    }
}
