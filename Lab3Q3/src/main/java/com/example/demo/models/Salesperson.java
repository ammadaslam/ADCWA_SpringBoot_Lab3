package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "salesperson_table")
public class Salesperson {


	@Id
	private String sid;
	private String fname;
	private String surname;
	private String dob;
	private String city;
	private Float commission;
	
	
	public Salesperson() {
		super();
	}
	
	public Salesperson(String sid, String fname, String surname, String dob, String city, Float commission) {
		super();
		this.sid = sid;
		this.fname = fname;
		this.surname = surname;
		this.dob = dob;
		this.city = city;
		this.commission = commission;
	}
	
	
	
	
	public String getSid() {
		return sid;
	}


	public void setSid(String sid) {
		this.sid = sid;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public Float getCommission() {
		return commission;
	}


	public void setCommission(Float commission) {
		this.commission = commission;
	}



	

}
