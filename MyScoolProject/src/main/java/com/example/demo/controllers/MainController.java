package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
    
	@GetMapping
    public String index() {
    	return "index";
    }
	
	@GetMapping("/contacts")
    public String contacts() {
    	return "contacts";
    }
    
    @GetMapping("/admin")
    public String admin() {
    	return "admin";
    }
    
    @GetMapping("/user")
    public String user() {
    	return "user";
    }
    
    
    

}
