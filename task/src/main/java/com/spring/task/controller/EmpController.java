package com.spring.task.controller;

import java.util.UUID;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.task.entity.EmpDetails;
import com.spring.task.entity.EmpPass;
import com.spring.task.entity.Validation;
import com.spring.task.repository.ValidationRepo;
import com.spring.task.service.EmpPassService;
import com.spring.task.service.EmpService;
import com.spring.task.service.EmpUserService;
import com.spring.task.service.ValidationService;


@RestController
@RequestMapping("/emp")
public class EmpController {
	@Autowired
	private  ValidationService validationService;
	
	@PostMapping(value="/validation")
	public ResponseEntity<Validation> createval(@RequestBody Validation validation) {
		validationService.saveUser(validation);
		
		return ResponseEntity.ok(validation);
		
	}
	
}

//	@Autowired
//parent table controller 
//@RequestMapping("/emp")
//public class EmpController {
//	@Autowired
//	private EmpService empService;
//	//using mapping
//	@PostMapping (value = "/create")
//	public EmpDetails createEmp(@RequestBody EmpDetails empDetails) {
//		empService.saveUser(empDetails);
//	return empDetails;
//	}
//}

/*
without using mapping annotation
	@Autowired 
	private EmpUserService empUserService;
	@Autowired
	private EmpPassService empPassService;
	@PostMapping (value = "/create")
	public EmpDetails createEmp(@RequestBody EmpDetails empDetails) {
		empPassService.passwordDetails(empDetails);
		return empDetails;
	}
}
	private EmpService empService;

	@PostMapping (value = "/create")
	public EmpDetails createEmp(@RequestBody EmpDetails empDetails) {
	empService.saveUser(empDetails);
	return empDetails;
}
	@DeleteMapping(value = "/delete/{id}")
	public String  delete(@PathVariable ("id") UUID id) {
		empService.deleteinfo(id);
		return "Deleted";
		}	
	@DeleteMapping(value = "/deletechild/{id}")
	public String  deleteChildById(@PathVariable ("id") UUID id) {
		try {
			 empService.deleteChildId(id);
			 System.out.println(" ok------------------");
				System.out.println(id+"==================");
		}catch(Exception e) {
			
		}
		return "Deleted "+id;
}

*/

