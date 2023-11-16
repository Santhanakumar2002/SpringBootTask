package com.spring.task.entity;

import java.util.UUID;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "tb_sk_userinfo")
public class EmpInfo {
	@Id
	@GeneratedValue(generator  ="UUID")
	@GenericGenerator(name ="UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Type(type="uuid-char")
	@Column(name = "id", updatable = false, nullable =false)
	 private UUID id;
	
//	@Column(name ="user_id")
//	@Type(type="uuid-char")
//	private UUID userid;
	
	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public int getPostcode() {
		return postcode;
	}


	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}



	@Column(name ="age")
	private int age;
	
	
	@Column(name =" gender")
	private String gender;
	
	@Column(name =" address")
	private String address;
	
	@Column(name =" state")
	private String state;
	
	@Column(name ="postal_code ")
	private int postcode;
	
	@Column(name =" country")
	private String country;


	@JsonBackReference
	@ManyToOne
    @JoinColumn(name = "user_id",nullable = false,insertable = false,updatable = false ) 
	private EmpDetails empDetails;
	}
	
	
	


