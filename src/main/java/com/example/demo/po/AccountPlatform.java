package com.example.demo.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * account_platform
 * @author 
 */
@Data
public class AccountPlatform implements Serializable {
    /**
     * 第三方账号ID
     */
    private Long pid;

    /**
     * 账户表中的账号ID
     */
    private Long uid;

    private String platformToken;

    /**
     * 平台类型，0：未知
     */
    private Short platformType;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}