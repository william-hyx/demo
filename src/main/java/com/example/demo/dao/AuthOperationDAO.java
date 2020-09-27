package com.example.demo.dao;

import com.example.demo.po.AuthOperation;
import org.springframework.stereotype.Repository;

/**
 * AuthOperationDAO继承基类
 */
@Repository
public interface AuthOperationDAO extends MyBatisBaseDao<AuthOperation, Long> {
}