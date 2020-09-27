package com.example.demo.dao;

import com.example.demo.po.AuthUserRole;
import com.example.demo.po.AuthUserRoleKey;
import org.springframework.stereotype.Repository;

/**
 * AuthUserRoleDAO继承基类
 */
@Repository
public interface AuthUserRoleDAO extends MyBatisBaseDao<AuthUserRole, AuthUserRoleKey> {
}