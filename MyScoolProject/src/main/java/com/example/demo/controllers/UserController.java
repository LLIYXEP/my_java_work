package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
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
public class UserController {
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	UserService userService;

	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/registration")
	public String getRegPage(@ModelAttribute User user) {
		return "registration";
	}
	
	@PostMapping("/registration")
	public String registerPage(@RequestParam String password,@Valid @ModelAttribute User user, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
//			Map<String, String> errorsMap = ControllerUtils.getErrors(bindingResult);
//			model.mergeAttributes(errorsMap);
			model.addAttribute("hasErrors", bindingResult);
			return "/registration";
		} else {
			user.setRoles(Collections.singleton(Role.USER));
			user.setPassword(passwordEncoder.encode(password));
			user.setActivationCode(UUID.randomUUID().toString());
			
			String encEmail = "******" + user.getEmail().substring(6);
			
			model.addAttribute("messageType" , "alert-success");
			model.addAttribute("message" , "User is successfuly registered, please visit your email - " + encEmail + " to continue the Authentication!");
			
			userRepository.save(user);
			userService.sendMessage(user);
			return "login";
		}
	}

	
	@GetMapping("/activate/{code}")
	public String activate(@ModelAttribute User user, @PathVariable String code, Model model) {
		
		boolean isActivated = userService.activateUser(code);
		
		if (isActivated) {
			model.addAttribute("messageType", "alert-success");
			model.addAttribute("message", "User succssesfully activated");
		} else {
			model.addAttribute("messageType", "alert-danger");
			model.addAttribute("message", "Aktivation code is not found");
		}
		
		return "login";
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
	
	@GetMapping("/my-profile")
	public String myProfilePage(@AuthenticationPrincipal User user, Model model) {
		
		model.addAttribute("user", user);
		model.addAttribute("roles", user.getRoles());
		return "my-profile";
	}
	
	@PostMapping("/my-profile")
	public String myProfile(@ModelAttribute User user, @RequestParam String password, @RequestParam String password2, Model model) {
		if (password.isEmpty() && password2.isEmpty()) {
			user.setPassword(user.getPassword());
			model.addAttribute("messageType", "alert-success");
			model.addAttribute("message", "Profile saved successfully");
		} 
		
		if (password.equals(password2)) {
			user.setPassword(passwordEncoder.encode(password));
			model.addAttribute("messageType", "alert-success");
			model.addAttribute("message", "Profile saved successfully. Your new password " + password);
		}
		
		if (!password.equals(password2) && (password.isEmpty() || password2.isEmpty())) {
			user.setPassword(user.getPassword());
			model.addAttribute("messageType", "alert-danger");
			model.addAttribute("message", "Different New and Confirmation Passwords");
			return "my-profile";
		}
		
		userRepository.save(user);
		
		return "my-profile";
	}
}
