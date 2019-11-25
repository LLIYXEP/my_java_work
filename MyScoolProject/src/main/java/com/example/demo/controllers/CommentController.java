package com.example.demo.controllers;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.models.Comment;
import com.example.demo.models.Product;
import com.example.demo.models.User;
import com.example.demo.repositorys.CommentsRepository;
import com.example.demo.repositorys.ProductsRepository;

@Controller
public class CommentController {
	
	@Autowired
	private CommentsRepository commentsRepository;
	
	@Autowired
	private ProductsRepository productsRepository;

	@PostMapping("/comment/{id}/add")
	public String addComment(@AuthenticationPrincipal User user, @PathVariable int id, @ModelAttribute Comment comment, Model model) {
		Product product = productsRepository.getById(id);
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		
		comment.setProduct(product);
		comment.setUser(user);
		comment.setActive(true);
		comment.setDate(date);
		comment.setTime(time);
		commentsRepository.save(comment);
		return "redirect:/products/product/" + id + "/details";
	}
}
