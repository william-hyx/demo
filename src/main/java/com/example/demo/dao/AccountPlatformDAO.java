package com.example.demo.dao;

import com.example.demo.po.AccountPlatform;
import org.springframework.stereotype.Repository;

/**
 * AccountPlatformDAO继承基类
 */
@Repository
public interface AccountPlatformDAO extends MyBatisBaseDao<AccountPlatform, Long> {
}