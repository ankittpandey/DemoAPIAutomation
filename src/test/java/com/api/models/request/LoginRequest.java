package com.api.models.request;

public class LoginRequest {
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

    @Override
    public String toString() {
        return "LoginRequest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    private String username;
    private String password;

}
