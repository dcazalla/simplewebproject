package com.dcazalla.simplewebproject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/")
    public ModelAndView hello() {
    	System.out.println("********************** Into the controller");
    	ModelAndView modelAndView = new ModelAndView("hellomyfriend");
    	return modelAndView;
    }

}
