package com.example.demo.exception;

import com.example.demo.constant.CommonErrorCodeEnum;
import lombok.Data;

import java.io.Serializable;
import java.text.SimpleDateFormat;

/**
 * @description:
 * @author: huangyixin
 * @create: 2020/9/24 18:15
 **/
@Data
public class BusinessException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = -2024000693362688479L;
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
     * 具体错误的详细说明
     */
    private String detail;

    /**
     * 发生错误的方法名
     */
    private String instance;

    public BusinessException(int code, String message, String detail, String domain) {
        super(message);
        this.code = code;
        this.detail = detail;
        this.domain = domain;
        this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(System.currentTimeMillis());
    }

    public BusinessException(CommonErrorCodeEnum codeEnum, String domain){
        super(codeEnum.getMessage());
        this.code = codeEnum.getCode();
        this.domain = domain;
    }

    public BusinessException(CommonErrorCodeEnum codeEnum, String domain, String detail){
        super(String.format("%s: %s", codeEnum.getMessage(), detail));
        this.code = codeEnum.getCode();
        this.domain = domain;
        this.detail = detail;
    }
}
