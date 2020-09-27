package com.example.demo.po;

import java.io.Serializable;
import java.util.Date;

/**
 * account_user
 * @author 
 */
public class AccountUser extends AccountUserKey implements Serializable {
    /**
     * 邮箱
     */
    private String userEmail;

    /**
     * 密码
     */
    private String userPwd;

    /**
     * 密码盐
     */
    private String pwdSalt;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建IP
     */
    private String createIp;

    /**
     * 最后一次登录时间
     */
    private Date lastLoginTime;

    private String lastLoginIp;

    /**
     * 登录次数
     */
    private Long loginTimes;

    /**
     * 状态 1:enable, 0:disable, -1:deleted
     */
    private Short status;

    private static final long serialVersionUID = 1L;

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getPwdSalt() {
        return pwdSalt;
    }

    public void setPwdSalt(String pwdSalt) {
        this.pwdSalt = pwdSalt;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateIp() {
        return createIp;
    }

    public void setCreateIp(String createIp) {
        this.createIp = createIp;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public Long getLoginTimes() {
        return loginTimes;
    }

    public void setLoginTimes(Long loginTimes) {
        this.loginTimes = loginTimes;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}