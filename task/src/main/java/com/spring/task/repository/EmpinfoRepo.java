package com.spring.task.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.spring.task.entity.EmpInfo;

@Repository
public interface EmpinfoRepo extends JpaRepository<EmpInfo, UUID>{
	

}
