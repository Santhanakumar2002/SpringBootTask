package com.spring.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.task.entity.ClassPassword;
import com.spring.task.entity.EmpDetails;
import com.spring.task.entity.EmpPass;
import com.spring.task.repository.EmpPassRepo;
import com.spring.task.repository.EmpRepository;

@Service
public class EmpPassService {

	@Autowired
	private EmpRepository empRepository;
	
	@Autowired
	private EmpPassRepo empPassRepo;
	
	public EmpPass passwordDetails(EmpDetails empDetails) {
		
		EmpDetails empdetailsObj= empRepository.save(empDetails);
		
		String phoneObj= ClassPassword.getPassword(empDetails.getPhone());
	
		EmpPass empPassObj= new EmpPass();
		
		empPassObj.setPassWord(phoneObj);
		
		empPassObj.setEmpId(empdetailsObj.getId());
		//ClassPassword.getPassword(empdetailsObj.getPhone());
		empPassObj.setEmpName(empdetailsObj.getUserName());
		empdetailsObj.getEmailId();
		empdetailsObj.getFirstName();
		empdetailsObj.getLastName();
		empdetailsObj.getJoiningDate();
		return empPassRepo.save(empPassObj);
		
	}
}
