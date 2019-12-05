package com.scurtu.scool.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scurtu.scool.domain.Ingredient;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, String> {

	
	
}
