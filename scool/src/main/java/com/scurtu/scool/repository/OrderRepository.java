package com.scurtu.scool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scurtu.scool.domain.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
