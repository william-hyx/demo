package com.example.demo.po;

import java.io.Serializable;

/**
 * auth_role_privilege
 * @author 
 */
public class AuthRolePrivilegeKey implements Serializable {
    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 权限ID（功能操作ID或资源ID）
     */
    private Long privilegeId;

    private static final long serialVersionUID = 1L;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Long privilegeId) {
        this.privilegeId = privilegeId;
    }
}