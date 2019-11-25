package com.example.demo.controllers;

import java.io.File;
import java.security.Principal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.models.Cart;
import com.example.demo.models.Product;
import com.example.demo.models.User;
import com.example.demo.repositorys.CartsRepository;
import com.example.demo.repositorys.ProductsRepository;
import com.example.demo.repositorys.UserRepository;

@Controller
public class CartController {
	
	@Value("${upload.path}")
	private String uploadPath;
	
	@Autowired
	ProductsRepository productsRepository;
	
	@Autowired
	CartsRepository cartsRepository;
	
	@Autowired
	UserRepository userRepository;

	@GetMapping("/cart/{id}")
	public String cartPage(@PathVariable int id, Model model) {
		Cart cart = cartsRepository.getByUser(userRepository.getById(id));
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
	
	@GetMapping("/remove-from-cart/{id}")
	public String removeFromCart(@PathVariable int id, @AuthenticationPrincipal User user) {
		Product product = productsRepository.getById(id);
		Cart cart = cartsRepository.getByUser(user);
		cart.getProducts().remove(product);
		cartsRepository.save(cart);
		return "redirect:/cart/"+user.getId();
	}
}
