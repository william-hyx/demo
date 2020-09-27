package com.example.demo.util;

import com.example.demo.constant.CommonErrorCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @description:
 * @author: huangyixin
 * @create: 2020/9/24 16:36
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResult<T> implements Serializable {
    private static final long serialVersionUID = 7369258146659695663L;

    /**
     * 是否成功标记
     */
    private boolean success = false;

    private Integer code;

    /**
     * 错误信息
     */
    private Error error;

    private T data;

    public static<T> ApiResult<T> success() {
        ApiResult<T> apiResult = new ApiResult<>();
        apiResult.setSuccess(true);
        apiResult.setCode(0);
        return apiResult;
    }

    public static<T> ApiResult<T> success(T data) {
        ApiResult<T> apiResult = new ApiResult<>();
        apiResult.setSuccess(true);
        apiResult.setCode(0);
        apiResult.setData(data);
        return apiResult;
    }

    public static<T> ApiResult<T> failure(String domain, Integer code, String message, String detail) {
        ApiResult<T> apiResult = new ApiResult<>();
        apiResult.setSuccess(false);
        Error error = new Error(domain, code, message, detail);
        apiResult.setError(error);
        return apiResult;
    }

    public static<T> ApiResult<T> failure(CommonErrorCodeEnum errorCodeEnum, String detail) {
        ApiResult<T> apiResult = new ApiResult<>();
        apiResult.setSuccess(false);
        int code = errorCodeEnum.getCode();
        String message = errorCodeEnum.getMessage();
        apiResult.setCode(code);
        Error error = new Error(null, code, message, detail);
        apiResult.setError(error);
        return apiResult;
    }
}
