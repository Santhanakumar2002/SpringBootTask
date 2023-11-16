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
@Table(name ="tb_sk_userupdate")
public class EmpUser {

	@Id
	@GeneratedValue(generator  ="UUID")
	@GenericGenerator(name ="UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Type(type="uuid-char")
	@Column(name = "id", updatable = false, nullable =false)
	 private UUID id;
	
	@Column(name="emp_id")
	@Type(type="uuid-char")
	private UUID empId;
	
	public UUID getEmpId() {
		return empId;
	}
	public void setEmpId(UUID empId) {
		this.empId = empId;
	}
	@Column(name ="salary")
	private String salary;
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	
	
	
}
