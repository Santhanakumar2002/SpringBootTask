package com.spring.mail.service;

import org.springframework.stereotype.Service;

import com.spring.mail.entity.EmailEntity;
@Service
public interface EmailServ {
	String sendSimpleMail(EmailEntity emailEntity);
	String sendMailWithAttachment(EmailEntity emailEntity);

}
