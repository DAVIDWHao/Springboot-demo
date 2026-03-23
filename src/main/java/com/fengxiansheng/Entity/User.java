package com.fengxiansheng.Entity;

public class User {
    private String username;
    private String password;
    private short enabled;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public short getEnabled() {
        return enabled;
    }
    public void setEnabled(short enabled) {
        this.enabled = enabled;
    }
}
