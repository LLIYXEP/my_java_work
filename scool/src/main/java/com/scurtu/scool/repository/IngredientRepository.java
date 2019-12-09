package com.scurtu.scool.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.scurtu.scool.domain.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, String> {

	
	
}
