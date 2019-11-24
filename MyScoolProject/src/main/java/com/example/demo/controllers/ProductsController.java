package com.example.demo.controllers;


import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.models.Product;
import com.example.demo.models.User;
import com.example.demo.repositorys.CategoryRepository;
import com.example.demo.repositorys.ProductsRepository;
import com.example.demo.services.ProductService;

@Controller
@RequestMapping("/products")
public class ProductsController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductsRepository productsRepository;
	
	@Value("${upload.path}")
	private String uploadPath;

	@GetMapping("/add")
	public String addProductPage(@ModelAttribute Product product, Model model) {
		model.addAttribute("categories", categoryRepository.findAll());
		return "products/add-product";
	}
	
	@PostMapping("/add")
	public String addProduct(@AuthenticationPrincipal User user, 
			@Valid @ModelAttribute Product product, 
			BindingResult bindingResult, 
			Model model,
			@RequestParam("imageName") MultipartFile image) throws IllegalStateException, IOException {
		
		if (image != null && !image.getOriginalFilename().isEmpty()) {
			File uploadDir = new File(uploadPath);
			if (!uploadDir.exists()) {
				uploadDir.mkdir();
			}
			
			String uuidFile = UUID.randomUUID().toString();
			String resultFilename = uuidFile + "." + image.getOriginalFilename();
			
			image.transferTo(new File(uploadPath + "/" + resultFilename));
			product.setImageName(resultFilename);
		}
		
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
	public String editProduct(@RequestParam("image") MultipartFile image, @PathVariable Integer id, @ModelAttribute Product product) throws IllegalStateException, IOException {
		if (image.getSize() < 1) {
			Product productDB = productsRepository.getById(id);
			product.setImageName(productDB.getImageName());
		}
		if (image != null && !image.getOriginalFilename().isEmpty()) {
			
			Product productDB = productsRepository.getById(id);
			File file = new File(uploadPath + "/" + productDB.getImageName());
			file.delete();
			
			File uploadDir = new File(uploadPath);
			if (!uploadDir.exists()) {
				uploadDir.mkdir();
			}
			
			String uuidFile = UUID.randomUUID().toString();
			String resultFilename = uuidFile + "." + image.getOriginalFilename();
			
			image.transferTo(new File(uploadPath + "/" + resultFilename));
			product.setImageName(resultFilename);
			
			
		} 
		
		productsRepository.save(product);
		
		return "redirect:/products/list";
	}
		
	
	@GetMapping("/delete/{id}")
	public String deleteProduct(@PathVariable Integer id) {
		Product product = productsRepository.getById(id);
		File file = new File(uploadPath + "/" + product.getImageName());
		file.delete();
		productsRepository.delete(product);
		return "redirect:/products/list";
	}
	
	@GetMapping("/product/{id}/details")
	public String productDetails(@PathVariable Integer id, Model model) {
		Product product = productsRepository.getById(id);
		model.addAttribute("product", product);
		return "products/product-details";
	}
}
