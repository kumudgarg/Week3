package com.bridgelab.Oops.ClinicManagement.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Patient 
{
	@JsonProperty
	private String name;
	@JsonProperty
	private int id;
	@JsonProperty
	private long PhoneNumber;
	@JsonProperty
	private int Age;
	public Patient(String n, int i, long p)
	{
		this.name = n;
		this.id = i;
		this.PhoneNumber = p;
	}
	public Patient() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Patient [name=" + name + ", id=" + id + ", PhoneNumber=" + PhoneNumber + ", Age=" + Age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int Age) {
		this.Age = Age;
	}
	

}
