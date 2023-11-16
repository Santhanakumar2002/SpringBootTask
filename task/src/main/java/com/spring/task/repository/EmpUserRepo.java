package com.spring.task.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.task.entity.EmpUser;



@Repository

public interface EmpUserRepo extends JpaRepository<EmpUser, UUID>{ 
}
