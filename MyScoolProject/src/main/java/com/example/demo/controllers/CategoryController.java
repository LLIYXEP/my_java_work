package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.Category;
import com.example.demo.repositorys.CategoryRepository;

@Controller
public class CategoryController {
	
	@Autowired
	private CategoryRepository categoryRepository;

	@GetMapping("/categories")
	public String categories(@ModelAttribute Category category, Model model) {
		model.addAttribute("categories", categoryRepository.findAll());
		return "categories/all-categories";
	}
	
	@GetMapping("/add-category")
	public String addCategoryPage(@ModelAttribute Category category) {
		return "categories/add-category";
	}
	
	@PostMapping("/add-category")
	public String addCategory(@ModelAttribute Category category, BindingResult bindingResult, Model model) {
		categoryRepository.save(category);
		return "redirect:/categories";
	}
	
	@PostMapping("/edit-category/{id}")
	public String editCategory(@ModelAttribute Category category) {
		categoryRepository.save(category);
		return "redirect:/categories";
	}
	
	@PostMapping("/delete-category/{id}")
	public String deleteCategory(@ModelAttribute Category category) {
		categoryRepository.delete(category);
		return "redirect:/categories";
	}
	
}
