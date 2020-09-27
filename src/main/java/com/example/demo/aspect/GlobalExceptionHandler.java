package com.example.demo.aspect;

import com.example.demo.constant.CommonErrorCodeEnum;
import com.example.demo.exception.BusinessException;
import com.example.demo.util.ApiResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.multipart.support.MissingServletRequestPartException;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.util.stream.Collectors;

/**
 * @description:
 * @author: huangyixin
 * @create: 2020/9/24 18:15
 **/
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * NoHandlerFoundException 404 异常处理
     */
    @ExceptionHandler(value = NoHandlerFoundException.class)
    public ApiResult handlerNoHandlerFoundException(NoHandlerFoundException exception) {
        printError(NoHandlerFoundException.class, CommonErrorCodeEnum.NOT_FOUND, exception);
        return ApiResult.failure(CommonErrorCodeEnum.NOT_FOUND, "请检查URL路径是否正确");
    }

    /**
     * HttpRequestMethodNotSupportedException 405 异常处理
     */
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ApiResult handlerHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException exception) {
        printError(HttpRequestMethodNotSupportedException.class, CommonErrorCodeEnum.METHOD_NOT_ALLOWED, exception);
        return ApiResult.failure(CommonErrorCodeEnum.METHOD_NOT_ALLOWED, "当前请求方法不支持");
    }

    /**
     * HttpMediaTypeNotSupportedException 415 异常处理
     */
    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    public ApiResult handlerHttpMediaTypeNotSupportedException(HttpMediaTypeNotSupportedException exception) {
        printError(HttpMediaTypeNotSupportedException.class, CommonErrorCodeEnum.UNSUPPORTED_MEDIA_TYPE, exception);
        return ApiResult.failure(CommonErrorCodeEnum.UNSUPPORTED_MEDIA_TYPE, "不支持的媒体文件格式");
    }

    @ExceptionHandler(MissingServletRequestPartException.class)
    public ApiResult handleMissingServletRequestPartException(MissingServletRequestPartException exception){
        printError(MissingServletRequestPartException.class, CommonErrorCodeEnum.PARAM_MISSING, exception);
        return ApiResult.failure(CommonErrorCodeEnum.PARAM_MISSING, "缺少上传文件");
    }

    /**
     * HttpMessageNotReadableException 参数解析异常 602
     */
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ApiResult handleHttpMessageNotReadableException(HttpMessageNotReadableException exception) {
        printError(HttpMessageNotReadableException.class, CommonErrorCodeEnum.PARAM_NOT_READABLE, exception);
        return ApiResult.failure(CommonErrorCodeEnum.PARAM_NOT_READABLE, "参数格式错误");
    }

    /**
     * MissingServletRequestParameterException 缺少请求参数 603
     */
    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ApiResult handleMissingServletRequestParameterException(MissingServletRequestParameterException exception) {
        printError(MissingServletRequestParameterException.class, CommonErrorCodeEnum.PARAM_MISSING, exception);
        return ApiResult.failure(CommonErrorCodeEnum.PARAM_MISSING, "未指定必需的请求参数");
    }

    /**
     * 参数绑定异常
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ApiResult handleMethodArgumentNotValidException(MethodArgumentNotValidException exception) {
        String message = exception.getBindingResult().getFieldErrors().stream().map(
                item -> String.format("%s[%s]", item.getDefaultMessage(), item.getField())).collect(Collectors.joining("; "));
        log.error("{}[{}]:{}", CommonErrorCodeEnum.PARAM_INVALID.getMessage(),
                CommonErrorCodeEnum.PARAM_INVALID.getCode(), message);
        return ApiResult.failure(CommonErrorCodeEnum.PARAM_INVALID, message);
    }


    /**
     * Exception 通用异常
     */
    @ExceptionHandler(Exception.class)
    public ApiResult exceptionHandler(Exception e) {
        /**
         * Exception的getMessage可能没有值，打印堆栈信息辅助排查问题
         */
        e.printStackTrace();
        printError(Exception.class, CommonErrorCodeEnum.INTERNAL_ERROR, e);
        return ApiResult.failure(CommonErrorCodeEnum.INTERNAL_ERROR, "服务器内部错误");
    }

    @ExceptionHandler(BusinessException.class)
    public ApiResult businessExceptionHandler(BusinessException e) {
        printBusinessException(e);
        return ApiResult.failure(e.getDomain(), e.getCode(), e.getMessage(), e.getDetail());
    }

    private void printBusinessException(BusinessException e) {
        log.error("{}[{}]: {}", e.getDomain(), e.getCode(), e.getDetail());
    }

    private void printError(Class errorType, CommonErrorCodeEnum errorCodeEnum, Throwable throwable) {
        log.error("{}[{}]:{}", errorType.getSimpleName(), errorCodeEnum.getCode(), throwable.getMessage());
    }
}
