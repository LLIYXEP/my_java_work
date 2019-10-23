package com.example.demo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.models.User;
import com.example.demo.repositorys.UserRepository;

@Controller

public class UserResource {

	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/registration")
	public String getRegPage() {
		return "registration";
	}
	
	@PostMapping("/registration")
	public String registerPage(@ModelAttribute User user) {
		
		userRepository.save(user);
		return "login";
	}
	
}
