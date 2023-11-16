package com.spring.task.service;

import java.util.DuplicateFormatFlagsException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.spring.task.entity.Validation;
import com.spring.task.repository.ValidationRepo;

@Service
public class ValidationService {
	
	@Autowired
	private ValidationRepo validationRepo;
	
	public void saveUser(Validation validation) {
		Validation existingUser = validationRepo.findByPhoneAndEmail(validation.getPhone(), validation.getEmail());
		if(existingUser != null) {
			throw new DuplicateFormatFlagsException("A user with the name " + validation.getPhone() + " and email " + validation.getEmail() + " already exists.");
		}
		else {
			validationRepo.save(validation);
		}
		
		}
	

}
