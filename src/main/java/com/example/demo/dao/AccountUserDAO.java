package com.example.demo.dao;

import com.example.demo.po.AccountUser;
import com.example.demo.po.AccountUserKey;
import org.springframework.stereotype.Repository;

/**
 * AccountUserDAO继承基类
 */
@Repository
public interface AccountUserDAO extends MyBatisBaseDao<AccountUser, AccountUserKey> {
}