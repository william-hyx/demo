package com.example.demo.dao;

import com.example.demo.po.AuthResource;
import org.springframework.stereotype.Repository;

/**
 * AuthResourceDAO继承基类
 */
@Repository
public interface AuthResourceDAO extends MyBatisBaseDao<AuthResource, Long> {
}