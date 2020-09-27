package com.example.demo.dao;

import com.example.demo.po.AuthOperationType;
import org.springframework.stereotype.Repository;

/**
 * AuthOperationTypeDAO继承基类
 */
@Repository
public interface AuthOperationTypeDAO extends MyBatisBaseDao<AuthOperationType, String> {
}