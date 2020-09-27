package com.example.demo.constant;

public enum CommonErrorCodeEnum {
    /**
     * 404 URL路径有误
     */
    NOT_FOUND(-404, "请求资源不存在"),
    /**
     * 405 请求方法有误
     */
    METHOD_NOT_ALLOWED(-405, "请求方法错误"),
    /**
     * 415 不支持的媒体格式
     */
    UNSUPPORTED_MEDIA_TYPE(-415,"不支持的媒体格式"),
    /**
     * 601 参数不合法
     */
    PARAM_INVALID(-601, "非法请求参数"),

    /**
     * 602 参数格式错误
     */
    PARAM_NOT_READABLE(-602, "无法解析的参数格式"),

    /**
     * 603 缺少参数错误
     */
    PARAM_MISSING(-603, "缺少请求参数"),
    /**
     * -1 内部服务异常
     */
    INTERNAL_ERROR(-1, "服务异常");


    private final Integer code;
    private final String message;

    CommonErrorCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
