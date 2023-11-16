package com.spring.mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mail.entity.EmailEntity;
import com.spring.mail.service.EmailServImpl;

@RestController
@RequestMapping("/user")
public class EmailController {
	
	@Autowired
	private EmailServImpl emailServImpl; 
	
	@PostMapping(value ="/email")
	public String sendSimpleMail(@RequestBody EmailEntity emailEntity) {
		String status = emailServImpl.StringsaveCus(emailEntity);
		return status;
		
	}

	
}
