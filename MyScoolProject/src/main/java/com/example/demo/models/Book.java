package com.example.demo.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.example.demo.services.annotation.UniqueBookName;


@Entity // This tells Hibernate to make a table out of this class
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @NotEmpty (message = "Book name is required! Can't be empty!")
    @UniqueBookName ( message = "This Book already exist!")
    private String name;
    
    @NotEmpty (message = "Book author is required! Can't be empty!")
    private String author;

    @NotEmpty (message = "Number of pages is required! Can't be empty!")
    private String pages;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}



	public Book() {
		super();
	}

	public String getUserName() {
		return user != null ? (String) user.getFirstName() : "unknown";
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPages() {
		return pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return name;
	}

	

}