package com.rhzx.rhzx_boot.util;

public enum RoleEnum {
    SUPER_USER("00", "超级管理员"),
    MANAGER_USER("01", "管理员"),
    USER("02", "普通用户");
    private String value;

    private String name;

    RoleEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static String getRoleName(String value) {
        for (RoleEnum roleEnum : RoleEnum.values()) {
            if (roleEnum.getValue().equals(value)) {
                return roleEnum.getName();
            }
        }
        return "";
    }

}
