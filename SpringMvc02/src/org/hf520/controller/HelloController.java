package org.hf520.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2014/12/25.
 */
@Controller
@RequestMapping("/day04")
public class HelloController {
    @RequestMapping("/hello")
    public String execute(){
        //return  new ModelAndView("hello");
        return "hello";
    }
}
