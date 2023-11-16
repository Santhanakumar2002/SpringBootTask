package com.spring.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.task.entity.EmpDetails;
import com.spring.task.entity.EmpUser;
import com.spring.task.repository.EmpRepository;
import com.spring.task.repository.EmpUserRepo;

@Service
public class EmpUserService {
	@Autowired
	private EmpRepository empRepository;
	@Autowired
	private EmpUserRepo empUserRepo;
	
	public EmpUser createDetails(EmpDetails empDetails) {
		
	
EmpDetails empdetailsObj= empRepository.save(empDetails);




EmpUser empUserObj= new EmpUser();
empUserObj.setEmpId(empdetailsObj.getId());
empUserObj.setSalary(empdetailsObj.getPhone());
empdetailsObj.getEmailId();
empdetailsObj.getFirstName();
empdetailsObj.getLastName();
empdetailsObj.getUserName();
empdetailsObj.getJoiningDate();
	return empUserRepo.save(empUserObj); 
	}
	
}


