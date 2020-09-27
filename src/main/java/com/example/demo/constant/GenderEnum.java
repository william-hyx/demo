package com.example.demo.constant;

/**
 * 性别
 */
public enum GenderEnum {

    UNKNOWN((short)0, "未知"),
    MALE((short)1, "男性"),
    FEMALE((short)2, "女性");

    private short gender;

    private String desc;

    GenderEnum(short gender, String desc) {
        this.gender = gender;
        this.desc = desc;
    }

    public short getGender() {
        return gender;
    }
}
