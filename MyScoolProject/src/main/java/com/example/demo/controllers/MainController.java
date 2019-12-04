package com.example.demo.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.repositorys.ProductsRepository;

@Controller
public class MainController {
	
	@Value("${spring.mail.username}")
	private String username;
	
	@Autowired
	private JavaMailSender mailSender;
	
	@Autowired
	ProductsRepository productsRepository;
	
	@GetMapping
    public String index(Model model) {
		model.addAttribute("products",  productsRepository.findAll());
		model.addAttribute("pageTitle", "Home page");
    	return "index";
    }
	
	@GetMapping("/capabilities")
	public String capabilities(Model model) {
		model.addAttribute("pageTitle", "Capabilities and Roles");
		return "capabilities";
	}
    
    
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage(HttpServletRequest request, Model model) {
	    String referrer = request.getHeader("Referer");
	    request.getSession().setAttribute("url_prior_login", referrer);
	    model.addAttribute("pageTitle", "Login page");
	    // some other stuff
	    return "login";
	}
	
	@GetMapping("/contacts")
    public String contacts(Model model) {
		model.addAttribute("pageTitle", "Contacts");
    	return "contacts";
    }
	
	@PostMapping("/contact-message")
	public String capabilities(@RequestParam String email, @RequestParam String name, @RequestParam String msg, RedirectAttributes redirectAttributes) {

		SimpleMailMessage mailMessage = new SimpleMailMessage();
		
		mailMessage.setFrom(username);
		mailMessage.setTo(username);
		mailMessage.setSubject("New message from site from " + name + " " + email);
		mailMessage.setText(msg);
		
		mailSender.send(mailMessage);
		
		redirectAttributes.addFlashAttribute("messageType", "alert-success");
		redirectAttributes.addFlashAttribute("message", "Thank you " + name + " for your message. We will contact you shortly.");
		
		return "redirect:/contacts";
	}
	
}
