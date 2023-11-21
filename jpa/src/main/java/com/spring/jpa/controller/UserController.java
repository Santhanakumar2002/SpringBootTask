package com.spring.jpa.controller;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jpa.entity.User;
import com.spring.jpa.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping(value = "/create")
	public User createUser(@RequestBody User user) {
		user.setCreateDate(LocalDateTime.now());
		userService.saveUser(user);
		return user;		
	}
	@GetMapping (value = "/get-all")
	public  List<User>getallUser() {
		return userService.getAll();		
	}
	@GetMapping (value = "/search/{name}")
	public  List<User> searchUsersByName(@PathVariable("name") String name) {
		return userService.searchAllUsersByName(name);		
	}
	@GetMapping (value = "/get/{id}")
	public  User getById(@PathVariable("id") UUID id) {
		Optional<User> userOptional = userService.getById(id);	
		return 	userOptional.get();
	}
	//_______ Method 1 ________
	
	/*@GetMapping(value = "/get/{id}")
	public Optional<User> getById(@PathVariable("id") UUID id) {
	
		return userService.getById(id)
;
	}*/
	
//
//	@GetMapping (value = "/get-all")
//	public  ResponseEntity<List<User>>getallUser() {
//		return   ResponseEntity.ok(userService.getAll());		
//	}
//	 
}
