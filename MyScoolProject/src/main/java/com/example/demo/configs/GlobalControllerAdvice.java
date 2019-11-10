package com.example.demo.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.repositorys.CategoryRepository;

@ControllerAdvice
public class GlobalControllerAdvice {
	
	@Autowired
	private CategoryRepository categoryRepository;

	@ModelAttribute
	public void addAttributes(Model model) {
	    model.addAttribute("categories", categoryRepository.findAll());
	}
	
}
