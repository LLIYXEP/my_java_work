package com.example.demo.services.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.repositorys.UserRepository;

public class UniqueUsernameValidator implements ConstraintValidator<UniqueUseremail, String>{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public boolean isValid(String email, ConstraintValidatorContext context) {
		if (userRepository == null) {
			return true;
		}
		return userRepository.findByEmail(email) == null;
	}

	
	
}
