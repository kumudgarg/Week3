package com.bridgelab.Oops.ClinicManagement.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Doctor 
{
	@JsonProperty
	private String name;
	@JsonProperty
	private int id;
	@JsonProperty
	private String specilization;
	@JsonProperty
	private String Availibility;
	@JsonIgnoreProperties
	private int noofpatient;
	@JsonIgnoreProperties
	private int count;
	@JsonIgnoreProperties
	private ArrayList<Patient>  q1 = new ArrayList<Patient>();
	public ArrayList<Patient> getQ1() {
		return q1;
	}
	public void setQ1(ArrayList<Patient> q1) {
		this.q1 = q1;
	}
	public Doctor()
	{
		
	}
	public Doctor(String n, int i, String s, String a) 
	
	{
		this.name = n;
		this.id = i;
		this.specilization = s;
		this.Availibility = a;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Doctor [name=" + name + ", id=" + id + ", specilization=" + specilization + ", Availibility="
				+ Availibility + ", noofpatient=" + noofpatient + "]";
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
	public String getSpecilization() {
		return specilization;
	}
	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}
	public String getAvailibility() {
		return Availibility;
	}
	public void setAvailibility(String avaibility) {
		Availibility = avaibility;
	}
	public int getNoofpatient() {
		return noofpatient;
	}
	public void setNoofpatient(int noofpatient) {
		this.noofpatient = noofpatient;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	

}
