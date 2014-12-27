package org.hf520.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * Created by kevin on 2014/12/27.
 * toAdd.from->UserController.toAddUser
 * add.from->UserController.addUser
 */
@Controller
public class UserController {
    //进入addUser.jsp
    @RequestMapping("/toAdd")
    public String toAddUser(){
        return "addUser";
    }

    //处理注册按钮提交
    @RequestMapping("/add")
    public String addUser(@Valid User user,BindingResult errors,Model model) {
        //检测errors如果有错误,返回addUser.jsp注册
        model.addAttribute("user",user);
        if (errors.hasErrors()) {
            return "addUser";
        }

        //提交表单信息,写入db表
        System.out.println("利用JDBC技术将user写入数据表");
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        return "ok";
    }
}
