package com.spring.task.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.task.entity.EmpDetails;

@Repository
public interface EmpRepository extends JpaRepository<EmpDetails, UUID> {
	

}
