package com.example.demo.po;

import java.io.Serializable;

/**
 * auth_resource_type
 * @author 
 */
public class AuthResourceType implements Serializable {
    /**
     * 数据资源类型
     */
    private String resourceType;

    /**
     * 类型名称
     */
    private String resourceTypeName;

    /**
     * 类型描述
     */
    private String resourceTypeDesc;

    private static final long serialVersionUID = 1L;

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getResourceTypeName() {
        return resourceTypeName;
    }

    public void setResourceTypeName(String resourceTypeName) {
        this.resourceTypeName = resourceTypeName;
    }

    public String getResourceTypeDesc() {
        return resourceTypeDesc;
    }

    public void setResourceTypeDesc(String resourceTypeDesc) {
        this.resourceTypeDesc = resourceTypeDesc;
    }
}