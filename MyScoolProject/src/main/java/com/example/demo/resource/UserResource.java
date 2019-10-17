package com.example.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.repository.User;
import com.example.demo.repository.UserRepository;

@RequestMapping(value = "/users", method = RequestMethod.GET)
@Controller
public class UserResource {
	
	@GetMapping("/greeting")
    public String greeting() {
        return "greeting";
    }
    
    @GetMapping("/")
    public String index() {
    	return "index";
    }
	
//	@Autowired
//	UserRepository userRepository;
//
//	@GetMapping(value = "/all")
//	public List<User> getAll(){
//		return userRepository.findAll();
//	}
//	
////	@PostMapping(value = "/load")
////	public List<User> persist(@RequestBody final User user){
////		userRepository.save(user);
////		return userRepository.findAll();
////	}
//	
//	@GetMapping(value = "/add")
//	    public String greeting() {
//	        return "addform";
//	    }
//	
//	@PostMapping("/add")
//    public String update(@RequestParam String name, @RequestParam String email) {
//
//
//        User user = new User();
//        user.setName(name);
//        user.setEmail(email);
//        userRepository.save(user);
//
//        return "addform";
//    }
	
}
