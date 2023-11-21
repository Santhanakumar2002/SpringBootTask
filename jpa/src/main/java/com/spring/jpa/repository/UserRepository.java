package com.spring.jpa.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.jpa.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, UUID> {

	// if u have more records use(findAll), if u have limited records u will use find.

	public List<User> findAllByUserName(String name);
	public List<User> findAllByUserNameAndemailId(String name, String emailId);
	
	public Optional<User> findById(UUID id);// here showing the single data from table,
	
}
