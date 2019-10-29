package com.example.demo.resources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.Role;
import com.example.demo.models.User;
import com.example.demo.repositorys.UserRepository;
import com.example.demo.services.UserService;

@Controller
public class UserResource {
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	UserService userService;

	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/registration")
	public String getRegPage() {
		return "registration";
	}
	
	@PostMapping("/registration")
	public String registerPage(@RequestParam String password,@Valid @ModelAttribute User user, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("hasErrors", bindingResult);
			return "registration";
		} else {
			user.setRoles(Collections.singleton(Role.USER));
			user.setPassword(passwordEncoder.encode(password));
			userRepository.save(user);
			return "login";
		}
	}
	
	@GetMapping("/users")
	public String getUsersPage(Model model) {
		model.addAttribute("users", userRepository.findAll());
		model.addAttribute("roles", Role.values());
		return "users";
	}
	
	@GetMapping("/delete-user/{id}")
	public String delUser(@PathVariable Integer id, Model model) {
		User user = userRepository.getById(id);
		userRepository.delete(user);
		return "redirect:/users";
	}
	
	@GetMapping("/edit-user/{id}")
	public String getEditUserPage(@PathVariable Integer id, Model model) {
		model.addAttribute("user", userRepository.getById(id));
		model.addAttribute("roles", Role.values());
		return "edit-user";
	}
	
	@PostMapping("/edit-user/{id}")
	public String editUser(@RequestParam Integer age ,@RequestParam(value = "ADMIN", required = false) String roleAdmin ,@RequestParam(value = "USER", required = false) String roleUser, @PathVariable Integer id,  @RequestParam Map<String,String> allParams) {
		
		ArrayList<String> role = new ArrayList<String>();
		if (roleUser != null) {
			role.add(roleUser);
		}
		if (roleAdmin != null) {
			role.add(roleAdmin);
		}
		
		userService.saveRole(role, age, id, allParams);
		return "redirect:/users";
	}
}
