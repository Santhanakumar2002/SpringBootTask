package com.spring.pdf.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lowagie.text.DocumentException;
import com.spring.pdf.entity.PdfEntity;

import com.spring.pdf.service.PdfService;

@Controller
@RequestMapping(value="/pdf")
public class PdfController {
	@Autowired
	private PdfService pdfService;

	@GetMapping("/generate")
	public ResponseEntity<byte[]> generatePdf(@RequestParam("templates") String templatePath) {
	    try {
	        // You can add more context variables as needed
	        Map<String, Object> contextVariables = new HashMap<>();
	        byte[] pdfBytes = pdfService.generatePdf(templatePath, contextVariables);

	        HttpHeaders headers = new HttpHeaders();
	        //headers.setContentType(MediaType.APPLICATION_PDF);
	        headers.setContentDispositionFormData("attachment", "generated.pdf");

	        return new ResponseEntity<>(pdfBytes, headers, HttpStatus.OK);
	    } catch (DocumentException | IOException e) {
	        // Handle exceptions appropriately (e.g., log them)
	        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}
	
//	@GetMapping("/download")
//	  public void downloadPdf(HttpServletResponse response,@RequestParam("template") String templatepath) {
//		 try {
//	            // Prepare context variables
//			 
//	            Map<String, Object> contextVariables = new HashMap<>();
//	            
//	           
//	          
//	            byte[] pdfBytes = pdfService.generatePdf(templatepath, contextVariables); 
//	           // response.setContentType("application/pdf");
//	            response.setHeader( "attachment", "generated.pdf");
//		 
//	            response.getOutputStream().write(pdfBytes);
//	            response.getOutputStream().flush();
//	        } catch (Exception e) {
//	            // Handle exceptions appropriately (e.g., log, show an error page)
//	            e.printStackTrace();
//	        }
//		 }
}
	
		 
