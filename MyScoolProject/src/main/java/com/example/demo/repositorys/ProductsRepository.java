package com.example.demo.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Category;
import com.example.demo.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer> {
	Product getById(int id);


}
