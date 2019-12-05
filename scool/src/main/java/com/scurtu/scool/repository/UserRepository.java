package com.scurtu.scool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scurtu.scool.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByPassword(String password);

}
