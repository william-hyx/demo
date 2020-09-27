package com.example.demo.dao;

import com.example.demo.po.AuthRolePrivilege;
import com.example.demo.po.AuthRolePrivilegeKey;
import org.springframework.stereotype.Repository;

/**
 * AuthRolePrivilegeDAO继承基类
 */
@Repository
public interface AuthRolePrivilegeDAO extends MyBatisBaseDao<AuthRolePrivilege, AuthRolePrivilegeKey> {
}