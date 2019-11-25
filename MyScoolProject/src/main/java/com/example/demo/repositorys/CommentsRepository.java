package com.example.demo.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Category;
import com.example.demo.models.Comment;
import com.example.demo.models.Product;
import com.example.demo.models.User;

public interface CommentsRepository extends JpaRepository<Comment, Integer> {

	Category getById(int id);
	
	Category getByUser(User User);
	
	Category getByProduct(Product product);
	

}
