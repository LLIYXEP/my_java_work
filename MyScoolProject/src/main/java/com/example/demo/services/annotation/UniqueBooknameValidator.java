package com.example.demo.services.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.repositorys.BookRepository;

public class UniqueBooknameValidator implements ConstraintValidator<UniqueBookName, String> {

	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public boolean isValid(String name, ConstraintValidatorContext context) {
		
		if (bookRepository == null) {
			return true;
		}
		
		return bookRepository.findByName(name) == null;
	}

}
