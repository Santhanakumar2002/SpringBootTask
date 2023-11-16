package com.spring.task.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
@Entity
@Table(name ="tb_sk_useremp")
public class EmpPass {
	@Id
	@GeneratedValue(generator  ="UUID")
	@GenericGenerator(name ="UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Type(type="uuid-char")
	@Column(name = "id", updatable = false, nullable =false)
	 private UUID id;
	
	@Column(name="emp_id")
	@Type(type="uuid-char")
	private UUID empId;
	
	@Column(name ="emp_name")
	private String empName;
	
	@Column(name ="password")
	private String passWord;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public UUID getEmpId() {
		return empId;
	}

	public void setEmpId(UUID empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	
	
}
