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
		model.addAttribute("pageTitle", "Home page");
    	return "index";
    }
	
	@GetMapping("/contacts")
    public String contacts(Model model) {
		model.addAttribute("pageTitle", "Contacts");
    	return "contacts";
    }
	
	@GetMapping("/capabilities")
	public String capabilities(Model model) {
		model.addAttribute("pageTitle", "Capabilities and Roles");
		return "capabilities";
	}
    
    
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage(HttpServletRequest request, Model model) {
	    String referrer = request.getHeader("Referer");
	    request.getSession().setAttribute("url_prior_login", referrer);
	    model.addAttribute("pageTitle", "Login page");
	    // some other stuff
	    return "login";
	}

}
