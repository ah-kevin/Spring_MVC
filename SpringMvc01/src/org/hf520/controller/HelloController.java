package org.hf520.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * Created by Administrator on 2014/12/25.
 */
public class HelloController implements Controller {
    //默认执行的处理请求的方法
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        //处理业务逻辑,可以吊用Dao
        //指定view视图组建吗,列如hello.jsp就写hello
        ModelAndView mav =new ModelAndView("hello");
        return mav;
    }
}
