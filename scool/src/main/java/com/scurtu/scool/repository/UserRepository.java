package com.scurtu.scool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scurtu.scool.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByName(String name);

	User findByPassword(String password);

}
