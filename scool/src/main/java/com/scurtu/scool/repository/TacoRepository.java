package com.scurtu.scool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scurtu.scool.domain.Taco;

public interface TacoRepository extends JpaRepository<Taco, Long> {

}
