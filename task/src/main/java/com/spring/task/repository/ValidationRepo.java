package com.spring.task.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.task.entity.Validation;

@Repository
public interface ValidationRepo extends JpaRepository<Validation, UUID>{

	//boolean existsByEmail(Object email);

	Validation findByPhoneAndEmail(String phone, String email);

	
	
}