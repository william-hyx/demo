package com.example.demo.po;

import java.io.Serializable;
import java.util.Date;

/**
 * auth_role_privilege
 * @author 
 */
public class AuthRolePrivilege extends AuthRolePrivilegeKey implements Serializable {
    /**
     * 权限类型，1功能权限，2数据权限
     */
    private Short privilegeType;

    /**
     * 状态，1enable，0disable，-1deleted
     */
    private Short status;

    /**
     * 创建人uid
     */
    private Long createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新人uid
     */
    private Long updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Short getPrivilegeType() {
        return privilegeType;
    }

    public void setPrivilegeType(Short privilegeType) {
        this.privilegeType = privilegeType;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}