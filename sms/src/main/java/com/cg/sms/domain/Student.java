package com.cg.sms.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/*
 * author- @Ananya
 */
@Entity
public class Student {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	/*
	 * Id of Student
	 */
	private int id;
	/*
	 * First name of Student
	 */
	private String fname;
	/*
	 * last name of Student
	 */
	private String lname;
	/*
	 * Department name of Student
	 */
	private String department;
	/*
	 * age of Student
	 */
	private int age;
	//Implementing getters and setters
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
		
	
	
	

}
