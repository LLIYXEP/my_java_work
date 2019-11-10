package com.example.demo.controllers;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Product;
import com.example.demo.models.User;
import com.example.demo.repositorys.CategoryRepository;
import com.example.demo.repositorys.ProductsRepository;

@Controller
@RequestMapping("/products")
public class ProductsController {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductsRepository productsRepository;

	@GetMapping("/add")
	public String addProductPage(@ModelAttribute Product product, Model model) {
		model.addAttribute("categories", categoryRepository.findAll());
		return "products/add-product";
	}
	
	@PostMapping("/add")
	public String addProduct(@AuthenticationPrincipal User user, @Valid @ModelAttribute Product product, BindingResult bindingResult, Model model) {
		product.setAuthor(user);
		productsRepository.save(product);
		return "redirect:/products/list";
	}
	
	@GetMapping("/list")
	public String listProductsPage(Model model) {
		model.addAttribute("products", productsRepository.findAll() );
		return "products/all-products";
	}
	
	
	@GetMapping("/edit/{id}")
	public String editProductPage(@PathVariable Integer id, Model model) {
		Product product = productsRepository.getById(id);
		model.addAttribute(product);
		model.addAttribute("categories", categoryRepository.findAll());
		return "products/edit-product";
	}
	
	@PostMapping("/edit/{id}")
	public String editProduct(@PathVariable Integer id, @ModelAttribute Product product) {
		productsRepository.save(product);
		return "redirect:/products/list";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteProduct(@PathVariable Integer id) {
		Product product = productsRepository.getById(id);
		productsRepository.delete(product);
		return "redirect:/products/list";
	}
}
