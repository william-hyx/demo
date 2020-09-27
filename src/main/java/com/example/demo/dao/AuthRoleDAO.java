package com.example.demo.dao;

import com.example.demo.po.AuthRole;
import org.springframework.stereotype.Repository;

/**
 * AuthRoleDAO继承基类
 */
@Repository
public interface AuthRoleDAO extends MyBatisBaseDao<AuthRole, Long> {
}