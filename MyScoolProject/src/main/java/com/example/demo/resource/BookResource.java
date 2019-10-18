package com.example.demo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.repository.Book;
import com.example.demo.repository.BookRepository;



@Controller
public class BookResource {
	
	@GetMapping("/greeting")
    public String greeting() {
        return "greeting";
    }
    
    @GetMapping("/")
    public String index() {
    	return "index";
    }
	
	@Autowired
	BookRepository bookRepository;
	
	@GetMapping(value = "/add-book")
    public String addBook() {
        return "add-book";
    }
	
	@PostMapping("/add-book")
	public String update(@RequestParam String name, @RequestParam String author, @RequestParam int pages) {


      Book book = new Book();
      book.setName(name);
      book.setAuthor(author);
      book.setPages(pages);
      bookRepository.save(book);

      return "index";
  }

	@GetMapping(value = "/all-books")
	public String getAll(Model model){
		Iterable<Book> books = bookRepository.findAll();
		model.addAttribute("books", books);
		return "all-books";
	}
	
////	@PostMapping(value = "/load")
////	public List<User> persist(@RequestBody final User user){
////		userRepository.save(user);
////		return userRepository.findAll();
////	}
//	

	
}
