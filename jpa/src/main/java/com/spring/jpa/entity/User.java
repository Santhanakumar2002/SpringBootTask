package com.spring.jpa.entity;


import java.time.LocalDateTime;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "tb_sk_usersb1")
public class User  {
	
	@Id
	@GeneratedValue(generator  ="UUID")
	@GenericGenerator(name ="UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Type(type="uuid-char")
	@Column(name = "id", updatable = false, nullable =false)
	private UUID id;
	
	@Column(name =" user_name")
	private String userName;
	
	@Column(name =" email_id")
	private String  emailId;
	
	@Column(name ="Create_date")
	private LocalDateTime CreateDate;
	
	@Column(name ="modified_date")
	private LocalDateTime modifieDate;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getUser_name() {
		return userName;
	}

		

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public LocalDateTime getCreateDate() {
		return CreateDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		CreateDate = createDate;
	}

	public LocalDateTime getModifieDate() {
		return modifieDate;
	}

	public void setModifieDate(LocalDateTime modifieDate) {
		this.modifieDate = modifieDate;
	}

	
	
	}