package com.example.demo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
	@GetMapping("/users")
	public String getUsersPage(Model model) {
		model.addAttribute("users", userRepository.findAll());
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
		return "edit-user";
	}
	
	@PostMapping("/edit-user/{id}")
	public String editUser(@PathVariable Integer id, @ModelAttribute User user) {
		userRepository.save(user);
		return "redirect:/users";
	}
}
