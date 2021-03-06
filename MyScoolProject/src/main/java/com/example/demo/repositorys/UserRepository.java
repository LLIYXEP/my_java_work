package com.example.demo.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUsername(String username);
	
	User getById(int id);
	
	User findByEmail(String email);

	User findByActivationCode(String activationCode);

	User getByUsername(String userName);

}
