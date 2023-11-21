package com.excel.controller;


import java.io.IOException;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.excel.entity.ExcelDetail;
import com.excel.entity.ExcelUtil;
import com.excel.service.ExcelService;


@RestController
@RequestMapping(value="/create")
public class ExcelController {
	
	@Autowired
	public ExcelService excelService;
	
	@PostMapping("/details")
	public ExcelDetail createDetails(@RequestBody ExcelDetail excelDetail) {
		 excelService.saveDetails(excelDetail);
		return excelDetail;
		
		
//	public ResponseEntity<ExcelDetail>  createDetails(ExcelDetail excelDetail) {
//		excelService.saveDetails(excelDetail);
//		return  e;
		
	}
	@GetMapping("/download-excel")
	public ResponseEntity<ByteArrayResource> downloadDetails(){
		List<ExcelDetail> excelDetail= excelService.getAllDetails();
		
		ByteArrayResource resource = ExcelUtil.generateExcel(excelDetail);
		
		return ResponseEntity.ok()
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=Detailsheet.xlsx")
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .contentLength(resource.contentLength())
                .body(resource);
	}
		
	
}
