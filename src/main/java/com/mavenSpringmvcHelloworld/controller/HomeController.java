package com.mavenSpringmvcHelloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// 注解标注此类为 springmvc 的 controller，url 映射为"/home"
@Controller
@RequestMapping("/home")
public class HomeController {

    //映射一个action
    @RequestMapping("/index")
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mav = new ModelAndView("home");
        mav.addObject("Title", "Spring MVC, Hello");
        mav.addObject("message", "Hello Spring MVC");
        return mav;
    }
}