package com.spring.mail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.spring.mail.entity.EmailEntity;


@Service
public class EmailServImpl  {

	@Autowired
	private JavaMailSender javaMailSender;
	
	public String StringsaveCus(EmailEntity emailEntity) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(emailEntity.getRecipient());
		message.setText(emailEntity.getMsgBody());
		message.setSubject(emailEntity.getSubject());

		javaMailSender.send(message);
		return "email has send ";

	
//	@Value("${spring.mail.username}") 
//	private String sender;
//	
//	@Override	
//	 public String sendSimpleMail(EmailEntity emailEntity) {
//	try {
//		 SimpleMailMessage mailMessage  = new SimpleMailMessage();
//		// mailMessage.setFrom(sender);
//		 mailMessage.setTo(emailEntity.getRecipient());
//		 mailMessage.setText(emailEntity.getMsgBody());
//		 mailMessage.setSubject(emailEntity.getSubject());
//		 
//		 javaMailSender.send(mailMessage);
//		 
//			return "E-mail successfully Send.............";
//
//	}
//	catch(Exception e){
//		e.printStackTrace();
//		return "Error sending email message.....";
//	}
//	
//	}
//
//	@Override
//	public String sendMailWithAttachment(EmailEntity emailEntity) {
//		// TODO Auto-generated method stub
//		return null;
	}
	
	
	
	

}
