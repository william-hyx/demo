package com.example.demo.po;

import java.io.Serializable;

/**
 * auth_operation_type
 * @author 
 */
public class AuthOperationType implements Serializable {
    /**
     * 操作类型
     */
    private String operationType;

    /**
     * 操作类型名称
     */
    private String operationTypeName;

    /**
     * 操作类型描述
     */
    private String operationTypeDesc;

    private static final long serialVersionUID = 1L;

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getOperationTypeName() {
        return operationTypeName;
    }

    public void setOperationTypeName(String operationTypeName) {
        this.operationTypeName = operationTypeName;
    }

    public String getOperationTypeDesc() {
        return operationTypeDesc;
    }

    public void setOperationTypeDesc(String operationTypeDesc) {
        this.operationTypeDesc = operationTypeDesc;
    }
}