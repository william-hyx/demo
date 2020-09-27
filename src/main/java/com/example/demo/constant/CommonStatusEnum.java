package com.example.demo.constant;

/**
 * 状态类型
 */
public enum CommonStatusEnum {

    ENABLE((short)1,"有效"),
    DISABLE((short)0, "无效"),
    DELETED((short)-1, "删除");

    private short status;

    private String name;

    CommonStatusEnum(short status, String name) {
        this.status = status;
        this.name = name;
    }

    public short getStatus() {
        return status;
    }
}
