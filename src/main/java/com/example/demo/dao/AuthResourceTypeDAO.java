package com.example.demo.dao;

import com.example.demo.po.AuthResourceType;
import org.springframework.stereotype.Repository;

/**
 * AuthResourceTypeDAO继承基类
 */
@Repository
public interface AuthResourceTypeDAO extends MyBatisBaseDao<AuthResourceType, String> {
}