package com.example.demo.constant;

/**
 * 权限类型
 */
public enum PrivilegeTypeEnum {

    OPERATION((short)1, "功能权限"),
    RESOURCE((short)2, "数据权限");

    private final short type;

    private final String name;

    PrivilegeTypeEnum(short type, String name) {
        this.type = type;
        this.name = name;
    }

    public short getType() {
        return type;
    }

}
