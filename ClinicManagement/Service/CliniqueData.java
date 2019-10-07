package com.bridgelab.Oops.ClinicManagement.Service;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bridgelab.Oops.ClinicManagement.model.Doctor;
import com.bridgelab.Oops.ClinicManagement.model.Patient;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CliniqueData 
{
	public CliniqueData()
	{
		
	}
	static ArrayList<Doctor> doctor;
	static ArrayList<Patient> patients;
	public List<Doctor> readdoc()
	{
		//doctor = new ArrayList<Doctor>();
		File file = new File("/home/admin123/Desktop/data sturcture/bridge/src/com/bridgelab/Oops/ClinicManagement/jason/Doctor.json");
		ObjectMapper mapper = new ObjectMapper();
		try {
			 doctor = new ArrayList(Arrays.asList(mapper.readValue(file,Doctor[].class)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		for (Doctor doctor2 : doctor) 
		{
			System.out.println(doctor2);
			
		}
		*/
		return  doctor;
	}
	public List<Patient> readpat()
	{
		//List<Patient> patient = new ArrayList<Patient>();
		File file = new File("/home/admin123/Desktop/data sturcture/bridge/src/com/bridgelab/Oops/ClinicManagement/jason/Patients.json");
		ObjectMapper mapper = new ObjectMapper();
		try {
			patients = new ArrayList(Arrays.asList(mapper.readValue(file,Patient[].class)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		for (Doctor doctor2 : doctor) 
		{
			System.out.println(doctor2);
			
		}
		*/
		return  patients;
	}
	public void write()
	{
		ObjectMapper mapper = new ObjectMapper();
		File file1 = new File("/home/admin123/Desktop/data sturcture/bridge/src/com/bridgelab/Oops/ClinicManagement/jason/Doctor.json");
		try {
			mapper.writeValue(file1, CliniqueData.doctor);
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void writepat()
	{
		ObjectMapper mapper = new ObjectMapper();
		File file1 = new File("/home/admin123/Desktop/data sturcture/bridge/src/com/bridgelab/Oops/ClinicManagement/jason/Patients.json");
		try {
			mapper.writeValue(file1, CliniqueData.patients);
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void print()
	{
		System.out.println("successfull");
	}

}
