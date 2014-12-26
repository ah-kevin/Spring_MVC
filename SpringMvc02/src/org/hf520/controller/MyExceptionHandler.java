package org.hf520.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2014/12/26.
 */
@Controller
public class MyExceptionHandler implements HandlerExceptionResolver {

    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        System.out.println(o);
    //    Map<String,Object> data=new HashMap<String, Object>();
    //    data.put("ex".ex);
    //    if (ex instanceof IOException){
    //        return  new ModelAndView("err1",data);
    //    }else if(ex instanceof SQLException){
    //        return  new ModelAndView("err2",data);
    //    }else{
    //    return new ModelAndView("err");
    //}
        return new ModelAndView("err");
    }
}
