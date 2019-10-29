package com.example.demo.resources;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.models.Book;
import com.example.demo.repositorys.BookRepository;


@Controller
public class BookResource {
	
	
	@Autowired
	BookRepository bookRepository;
	
	
	@GetMapping("/add-book")
    public String addBook(@ModelAttribute Book book) {
        return "add-book";
    }
	
	@PostMapping("/add-book")
	public String update(@Valid @ModelAttribute Book book, BindingResult bindingResult, Model model) {

      if (bindingResult.hasErrors()) {
    	  model.addAttribute("hasErrors", bindingResult);
		return "add-book";
	} else {
		bookRepository.save(book);

	      return "redirect:/all-books";
	}
  }

	@GetMapping(value = "/all-books")
	public String getAll(Model model){
		model.addAttribute("books", bookRepository.findAll());
		return "all-books";
	}
	
	@GetMapping("/edit-book/{id}")
	public String editBookPage(@PathVariable Integer id, Model model) {
		Book book = bookRepository.getById(id);
		model.addAttribute("book" , book);
		return "edit-book";
	}
	
	
	@PostMapping("/edit-book/{id}")
	public String editBook(@PathVariable Integer id, @ModelAttribute Book book) {
		
		bookRepository.save(book);
		return "redirect:/all-books";
	}
	
	@GetMapping("/delete-book/{id}")
	public String deleteBook(@PathVariable Integer id, Model model) {
		Book book = bookRepository.getById(id);
		bookRepository.delete(book);
		return "redirect:/all-books";
	}
	
}
