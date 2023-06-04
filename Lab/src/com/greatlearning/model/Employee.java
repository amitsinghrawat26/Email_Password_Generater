package com.greatlearning.model;

public class Employee {
	private String fname;
	private String lname;
	
	public Employee(String fname,String lname){
		this.fname=fname;
		this.lname=lname;
	}
	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

}
