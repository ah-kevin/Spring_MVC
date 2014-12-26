package org.hf520.controller;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

/**
 * Created by Administrator on 2014/12/25.
 */
public class User {
    @NotEmpty(message ="用户名不能为空")
    private String name;
    @NotEmpty(message = "密码不能为空")
    @Size(min = 6,max = 10,message ="密码位数必须在{min}-{max}" )
    private String ps;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPs() {
        return ps;
    }

    public void setPs(String ps) {
        this.ps = ps;
    }
}
