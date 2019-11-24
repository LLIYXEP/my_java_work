package com.example.demo.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.repositorys.ProductsRepository;

@Controller
public class MainController {
	
	@Autowired
	ProductsRepository productsRepository;
	
	@GetMapping
    public String index(Model model) {
		model.addAttribute("products",  productsRepository.findAll());
    	return "index";
    }
	
	@GetMapping("/contacts")
    public String contacts() {
    	return "contacts";
    }
    
    
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage(HttpServletRequest request, Model model) {
	    String referrer = request.getHeader("Referer");
	    request.getSession().setAttribute("url_prior_login", referrer);
	    // some other stuff
	    return "login";
	}

}
