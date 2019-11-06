package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Product;

@Controller
@RequestMapping("/products")
public class ProductController {

	@GetMapping("/add")
	public String addProductPage(@ModelAttribute Product product) {
		return "add-product";
	}
	
	@PostMapping("/add")
	public String addProduct(@ModelAttribute Product product) {
		return "all-products";
	}
	
	@GetMapping("/list")
	public String listProductsPage(@ModelAttribute Product product) {
		return "all-products";
	}
	
	
	@GetMapping("/edit/{id}")
	public String editProductPage(@ModelAttribute Product product) {
		return "edit-products";
	}
	
	@PostMapping("/edit/{id}")
	public String editProduct(@ModelAttribute Product product) {
		return "redirect:all-products";
	}
	
	@PostMapping("/delete/{id}")
	public String deleteProduct(@ModelAttribute Product product) {
		return "all-products";
	}
}
