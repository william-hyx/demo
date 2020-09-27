package com.example.demo.po;

import java.io.Serializable;
import java.util.Date;

/**
 * staff_info
 * @author 
 */
public class StaffInfo implements Serializable {
    /**
     * 员工ID
     */
    private Long sid;

    /**
     * 账户表中的账号ID
     */
    private Long uid;

    /**
     * 员工姓名
     */
    private String staffName;

    /**
     * 手机号码
     */
    private String staffPhone;

    /**
     * 邮箱
     */
    private String staffEmail;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 别名
     */
    private String aliasName;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 性别，0未知，1男性，2女性
     */
    private Short gender;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone;
    }

    public String getStaffEmail() {
        return staffEmail;
    }

    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Short getGender() {
        return gender;
    }

    public void setGender(Short gender) {
        this.gender = gender;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}