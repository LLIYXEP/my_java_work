package com.example.demo.resource;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.repository.Book;
import com.example.demo.repository.BookRepository;


@Controller
public class BookResource {
	
	@Autowired
	BookRepository bookRepository;

    
    @GetMapping
    public String index(@RequestParam(name = "name", required = false, defaultValue = "World" )String name, Model model) {
    	model.addAttribute("name", name);
    	return "index";
    }
	
	
	@GetMapping("/add-book")
    public String addBook() {
        return "add-book";
    }
	
	@PostMapping("/add-book")
	public String update(@ModelAttribute Book book) {

      bookRepository.save(book);

      return "redirect:/all-books";
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
		return "edit-book";
	}
	
	@GetMapping("/delete-book/{id}")
	public String deleteBook(@PathVariable Integer id, Model model) {
		Book book = bookRepository.getById(id);
		bookRepository.delete(book);
		return "all-books";
	}
	
}
