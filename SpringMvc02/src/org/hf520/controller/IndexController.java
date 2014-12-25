package org.hf520.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2014/12/25.
 */
@Controller
@SessionAttributes("name")
public class IndexController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/login1")
    public String checklogin(HttpServletRequest reg){
        //检查用户名和密码
        System.out.println("执行login1");
    String name =reg.getParameter("name");
    String pwd =reg.getParameter("ps");
        if (name.equals("scott")&&pwd.equals("123456")){
            //正确
            return "ok";
        }
        return "index";
    }

    @RequestMapping("/login2")
    public String checklogin(@RequestParam(value = "name",required = false) String name,@RequestParam(value = "ps",required = false) String
            pwd){
        System.out.println("执行login2");
        //检查用户名和密码
        if (name.equals("scott")&&pwd.equals("123456")){
            //正确
            return "ok";
        }
        return "index";
    }

    //@RequestMapping("/login3")
    //public ModelAndView checklogin(User user){
    //    System.out.println("执行login3");
    //    //检查用户名和密码
    //    if (user.getName().equals("scott")&&user.getPs().equals("123456")){
    //        //正确
    //        Map<String,Object> datamap =new HashMap<String, Object>();
    //        datamap.put("name",user.getName());
    //        return new ModelAndView("ok",datamap);
    //    }
    //    return new ModelAndView("index");
    //}

    @RequestMapping("/login3")
    public String checklogin(User user,Model model){
        System.out.println("执行login3");
        //检查用户名和密码
        if (user.getName().equals("scott")&&user.getPs().equals("123456")){
            //正确
            model.addAttribute("name",user.getName());
           return "ok";
        }
        return "index";
    }
    //
    //@RequestMapping("/login3")
    //public String checklogin(@ModelAttribute("name") User user){
    //    System.out.println("执行login3");
    //    //检查用户名和密码
    //    if (user.getName().equals("scott")&&user.getPs().equals("123456")){
    //        //正确
    //        return "ok";
    //    }
    //    return "index";
    //}
}
