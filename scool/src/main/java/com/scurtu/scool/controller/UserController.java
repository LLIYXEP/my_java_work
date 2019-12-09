package com.scurtu.scool.controller;

import java.util.Collections;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.scurtu.scool.domain.Role;
import com.scurtu.scool.domain.User;
import com.scurtu.scool.repository.UserRepository;


@Controller
public class UserController {
	
	@Autowired
    private PasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepository userReository;

	
	@GetMapping("/registration")
	public String registrationPage(@ModelAttribute User user) {
		
		return "register";
	}
	
	@PostMapping("/registration")
	public String registration(@Valid @ModelAttribute User user, @RequestParam String password, Errors errors) {
		if (errors.hasErrors()) {
			return "register";
		}
		user.setRoles(Collections.singleton(Role.USER));
		user.setPassword(passwordEncoder.encode(password));
		userReository.save(user);
		return "login";
	}
}
