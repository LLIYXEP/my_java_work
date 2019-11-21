package com.example.demo.controllers;

import java.security.Principal;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.models.Cart;
import com.example.demo.models.Product;
import com.example.demo.models.User;
import com.example.demo.repositorys.CartsRepository;
import com.example.demo.repositorys.ProductsRepository;
import com.example.demo.repositorys.UserRepository;

@Controller
public class CartController {
	
	@Autowired
	ProductsRepository productsRepository;
	
	@Autowired
	CartsRepository cartsRepository;
	
	@Autowired
	UserRepository userRepository;

	@GetMapping("/cart/{name}")
	public String cartPage(@PathVariable String name, Model model) {
		Cart cart = cartsRepository.getByUser(userRepository.getByUsername(name));
		model.addAttribute("orderProducts", cart.getProducts());
		return "cart";
	}
	
	@GetMapping("/add-to-card/{id}/{userId}")
	public String addToCard(Principal principal, @PathVariable Integer userId , @PathVariable Integer id , Model model) {
		Product product = productsRepository.getById(id);
		
	
		
		User user = userRepository.getById(userId);
		Cart cart = cartsRepository.getByUser(user);
		
		Set<Product> products = cart.getProducts();
		products.add(product);
		
		cart.setProducts(products);
		cartsRepository.save(cart);
		return "redirect:/";
	}
}
