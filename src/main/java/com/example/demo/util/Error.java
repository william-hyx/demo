package com.example.demo.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.text.SimpleDateFormat;

/**
 * @description:
 * @author: huangyixin
 * @create: 2020/9/24 16:38
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Error implements Serializable {
    private static final long serialVersionUID = -1232150165723332711L;

    private String timestamp;

    /**
     * 业务领域
     */
    private String domain;

    /**
     * 错误码
     */
    private int code;

    /**
     * 错误类型
     */
    private String message;

    /**
     * 具体错误的详细说明
     */
    private String detail;

    /**
     * 发生错误的方法名
     */
    private String instance;

    public Error(String domain, int code, String message, String detail) {
        this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(System.currentTimeMillis());
        this.domain = domain;
        this.code = code;
        this.message = message;
        this.detail = detail;
    }
}
