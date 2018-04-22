package com.dcazalla.simplewebproject.controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dcazalla.simplewebproject.model.Pais;
import com.dcazalla.simplewebproject.service.PaisService;

@Controller
public class HelloController {
	
    @Autowired
    private PaisService paisService;


    @RequestMapping("/pruebasjavascript")
    public ModelAndView hello() {
    	System.out.println("********************** Into the controller");
//    	Pais pais = new Pais();
//    	pais.setDescPais("France");
//    	
//    	this.paisService.insertar(pais);
    	ModelAndView modelAndView = new ModelAndView("hellomyfriend");
    	return modelAndView;
    }
    
	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "welcome";
	}
	
	@RequestMapping("/login")
	public String login(Map<String, Object> model) {
//		model.put("message", this.message);
		System.out.println("--------------------------------------------- login");
		return "login";
	}

	@RequestMapping("/validarlogin")
	public String validarlogin(Map<String, Object> model) {
//		model.put("message", this.message);
		System.out.println("--------------------------------------------- validarlogin");
		return "welcome";
	}
    

}
