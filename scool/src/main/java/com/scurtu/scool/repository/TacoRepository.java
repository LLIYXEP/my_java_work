package com.scurtu.scool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scurtu.scool.domain.Taco;

@Repository
public interface TacoRepository extends JpaRepository<Taco, Long> {

}
