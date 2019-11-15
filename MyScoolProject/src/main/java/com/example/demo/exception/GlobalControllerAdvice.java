package com.example.demo.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.models.User;
import com.example.demo.repositorys.CategoryRepository;
import com.example.demo.repositorys.UserRepository;

@ControllerAdvice
public class GlobalControllerAdvice {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private UserRepository userRepository;

	@ModelAttribute
	public void addAttributes(Model model) {
	    model.addAttribute("categories", categoryRepository.findAll());
	}
	
	@ModelAttribute
	public void addAttributes(@AuthenticationPrincipal User user, Model model) {
	    if (user != null) {
	    	model.addAttribute("authUser", userRepository.getById(user.getId()));
		}
	}
	
}
