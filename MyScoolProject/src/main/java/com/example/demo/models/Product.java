package com.example.demo.models;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@NotEmpty(message = "Product name is required! Can't be empty!")
	private String name;
	
	private String brand;
	
	@ManyToMany
	private Set<Category> categories = new HashSet<Category>();

	private String description;
	
	private double price;
	
	private String size;
	
	@ManyToOne (fetch =  FetchType.EAGER)
	@JoinColumn(name = "user_id")
	private User author;
	
//	@Transient
//	private MultipartFile productImages;
	
	public String contains(Category category) {
		if (categories.contains(category)) {
			return "selected";
		} else {
			return "null";
		}
	}
	
	
	public String getUserName() {
		return author != null ? author.getFirstName() : "unknown";
	}
	
	public Set<Category> getCategories() {
		return categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}

	public Product() {
	super();
}

	public Integer getId() {
		return id;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	

	
	
	
}
