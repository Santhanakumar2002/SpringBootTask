package com.spring.image.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.spring.image.entity.ImageEntity;
import com.spring.image.service.ImageService;



@RestController
@RequestMapping("/api/image")
public class imageController {
	
	@Autowired
	ImageService imageService; 
	
	@PostMapping(value = "/upload")
	 public ResponseEntity<String> uploadImage(@RequestParam("name") String name, @RequestParam("file") MultipartFile file,@RequestParam("status") String status) {
	        try {
	        	ImageEntity imageEntity = new ImageEntity();// i creating a object for entity 
	            imageEntity.setName(name);// i set a name by using entity..
	            imageEntity.setImage(file.getBytes());
	            imageEntity.setStatus(status);
	            LocalDate dateobj = LocalDate.now();
	            imageEntity.setDate(dateobj);
	            imageService. saveImageEntity(imageEntity);
	            return ResponseEntity.ok("Image uploaded successfully");
	        } catch (IOException e) {
	            return ResponseEntity.badRequest().body("Image upload failed");
	        }
	    }
	
	 @GetMapping(value = "/get/{id}")
	    public ResponseEntity<byte[]> downloadImage(@PathVariable UUID id) {
	    	ImageEntity imageObj = imageService.getImageById(id);
	        if (imageObj != null) {
	            return ResponseEntity.ok()
	                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + imageObj.getName())
	                    .contentType(MediaType.ALL)
	                   .body(imageObj.getImage());
	        } else {
	            return ResponseEntity.notFound().build();
	        }
}

}
