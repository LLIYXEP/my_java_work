package com.example.demo.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Cart;
import com.example.demo.models.Product;

public interface CartsRepository extends JpaRepository<Cart, Integer> {
	Cart getById(int id);


}
