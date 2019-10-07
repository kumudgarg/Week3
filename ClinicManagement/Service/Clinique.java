package com.bridgelab.Oops.ClinicManagement.Service;

import java.util.ArrayList;

import com.bridgelab.Oops.ClinicManagement.model.Doctor;
import com.bridgelab.Oops.ClinicManagement.model.Patient;

public interface Clinique 
{
	public ArrayList<Doctor> adddoctor();
	public ArrayList<Patient> addpatient();
	public Doctor Searchdoctorbyname(String name);
	//public Doctor Searchdoctorbyid(int id);
	public Doctor Searchdoctorbyspecilization(String specilization);
	public Doctor SearchdoctorbyAvability(String Availibility);
	public Patient SearchPatientbyname(String name);
	public Patient SearchPatientbyid(int id);
	public Patient SearchPatientbyphonenumber(long PhoneNumber);
	public void printdoctor(ArrayList<Doctor> doctor);
	public void printpatient(ArrayList<Patient> patients);
	public void Appointment();
	//public int noofdoctors();
	
	
}
