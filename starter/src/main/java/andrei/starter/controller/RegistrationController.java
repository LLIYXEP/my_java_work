package andrei.starter.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import andrei.starter.domain.Role;
import andrei.starter.domain.User;
import andrei.starter.repos.UserRepo;
import andrei.starter.service.UserSevice;

import java.util.Collections;
import java.util.Map;

@Controller
public class RegistrationController {
    @Autowired
    private UserSevice userService;

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(User user, Map<String, Object> model) {

        if (!userService.addUser(user)) {
            model.put("message", "User exists!");
            return "registration";
        }

        return "redirect:/login";
    }
    
    @GetMapping("/activate/{code}")
    public String activate(Model model, @PathVariable String code) {
    	
    	boolean isActivated = userService.activateUser(code);
    	
    	if (isActivated) {
			model.addAttribute("message", "User succssesfully activated");
		} else {
			model.addAttribute("message", "Aktivation code is not found");
		}
    	
    	return "login";
    }
}
