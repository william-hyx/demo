package com.example.demo.po;

import java.io.Serializable;

/**
 * account_user
 * @author 
 */
public class AccountUserKey implements Serializable {
    /**
     * 账号ID
     */
    private Long uid;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 手机号
     */
    private String userPhone;

    private static final long serialVersionUID = 1L;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
}