package com.dcazalla.simplewebproject.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dcazalla.simplewebproject.model.Pais;
import com.dcazalla.simplewebproject.service.PaisService;

@Controller
public class HelloController {
	
    @Autowired
    private PaisService paisService;


    @RequestMapping("/")
    public ModelAndView hello() {
    	System.out.println("********************** Into the controller");
    	Pais pais = new Pais();
    	pais.setDescPais("France");
    	
    	this.paisService.insertar(pais);
    	ModelAndView modelAndView = new ModelAndView("hellomyfriend");
    	return modelAndView;
    }

}
