package com.spring.task.service;

import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.task.entity.EmpDetails;

import com.spring.task.repository.EmpRepository;
import com.spring.task.repository.EmpinfoRepo;

@Service

public class EmpService {
	
	@Autowired
	private EmpRepository empRepository;// table 1
	@Autowired
	 private EmpinfoRepo empinfo;//table 2
	
	
	public void saveUser(EmpDetails empDetails) {
		empRepository.save(empDetails);
	}

	public void deleteinfo(UUID id) {
		empinfo.deleteById(id);
	}
	

	public void deleteChildId(UUID id) {
		System.out.println(id+"==================");
		empinfo.deleteById(id);
	}
	
}
