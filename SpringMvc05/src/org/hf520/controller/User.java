package org.hf520.controller;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

/**
 * Created by kevin on 2014/12/27.
 */
public class User {
    @NotEmpty(message = "用户名不能为空")
    private String username;
    @Size(max = 10,min = 6,message = "密码位数必须在{min}-{max}")
    private String password;

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
}
