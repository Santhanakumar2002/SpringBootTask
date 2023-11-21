package com.excel.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excel.entity.ExcelDetail;
import com.excel.repository.ExcelRepo;

@Service
public class ExcelService {

	@Autowired
	public ExcelRepo excelRepo;
	
	public void saveDetails(ExcelDetail excelDetail) {
		excelRepo.save(excelDetail);
	}
	
	public List<ExcelDetail> getAllDetails() {
		
		return (List<ExcelDetail>)excelRepo.findAll();
	}
	
}
