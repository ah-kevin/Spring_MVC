package org.hf520.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2014/12/25.
 */
@Controller
@RequestMapping
public class HelloController {
    @RequestMapping("/hello")
    public String execute(){
        //return  new ModelAndView("hello");
        System.out.println("执行helloController");
        return "hello";
    }
}
