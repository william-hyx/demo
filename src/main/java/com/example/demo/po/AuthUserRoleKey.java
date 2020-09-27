package com.example.demo.po;

import java.io.Serializable;

/**
 * auth_user_role
 * @author 
 */
public class AuthUserRoleKey implements Serializable {
    /**
     * 账户表中的uid
     */
    private Long uid;

    /**
     * 角色id
     */
    private Long roleId;

    private static final long serialVersionUID = 1L;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}