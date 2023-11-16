package com.spring.image.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.image.entity.ImageEntity;
import com.spring.image.repository.ImageRepo;


@Service
public class ImageService {
	
	@Autowired
	public ImageRepo imageRepo;

	public void saveImageEntity(ImageEntity imageEntity) {
		imageRepo.save(imageEntity);	
		
	}

	public ImageEntity getImageById(UUID id) {
		
		return imageRepo.findById(id).orElse(null);
	}

	

	
	
}
