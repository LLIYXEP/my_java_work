package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.models.Product;
import com.example.demo.repositorys.ProductsRepository;

import antlr.collections.List;

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
    
    
    

}
