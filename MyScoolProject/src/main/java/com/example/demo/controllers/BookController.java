package com.example.demo.controllers;


import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Book;
import com.example.demo.models.User;
import com.example.demo.repositorys.BookRepository;


@Controller
@RequestMapping("/books")
public class BookController {
	
	
	@Autowired
	BookRepository bookRepository;
	
	
	@GetMapping("/add")
    public String addBook(@ModelAttribute Book book) {
        return "books/add-book";
    }
	
	@PostMapping("/add")
	public String update(@AuthenticationPrincipal User user, @Valid @ModelAttribute Book book, BindingResult bindingResult, Model model) {

      if (bindingResult.hasErrors()) {
    	  model.addAttribute("hasErrors", bindingResult);
		return "books/add-book";
	} else {
		
		book.setUser(user);
		bookRepository.save(book);

	      return "redirect:/books/all";
	}
  }

	@GetMapping(value = "/all")
	public String getAll(Model model){
		model.addAttribute("books", bookRepository.findAll());
		return "books/all-books";
	}
	
	@GetMapping("/edit/{id}")
	public String editBookPage(@PathVariable Integer id, Model model) {
		Book book = bookRepository.getById(id);
		model.addAttribute("book" , book);
		return "books/edit-book";
	}
	
	
	@PostMapping("/edit/{id}")
	public String editBook(@PathVariable Integer id, @ModelAttribute Book book) {
		
		bookRepository.save(book);
		return "redirect:/books/all";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteBook(@PathVariable Integer id, Model model) {
		Book book = bookRepository.getById(id);
		bookRepository.delete(book);
		return "redirect:/books/all";
	}
	
}
