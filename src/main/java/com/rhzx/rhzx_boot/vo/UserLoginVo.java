package com.rhzx.rhzx_boot.vo;

public class UserLoginVo {
    private String userId;
    private String role;
    private String password;
    private String createUser;
    private String createRole;
    private String lastLoginDate;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getCreateRole() {
        return createRole;
    }

    public void setCreateRole(String createRole) {
        this.createRole = createRole;
    }

    public String getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(String lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    @Override
    public String toString() {
        return "UserLoginVo{" +
                "userId='" + userId + '\'' +
                ", role='" + role + '\'' +
                ", createUser='" + createUser + '\'' +
                ", createRole='" + createRole + '\'' +
                ", lastLoginDate='" + lastLoginDate + '\'' +
                '}';
    }
}
