package com.bridgelab.Oops.ClinicManagement.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

import com.bridgelab.Oops.ClinicManagement.model.Doctor;
import com.bridgelab.Oops.ClinicManagement.model.Patient;

public class Cliniqueimp implements Clinique
{
	static ArrayList<Doctor> doctor;
	static ArrayList<Patient> patient;
	//inkedList[] list = new LinkedList[noofdoctors()];
	static CliniqueData q1 = new CliniqueData();
	HashMap<Integer, ArrayList<Patient>> w1 = new HashMap<Integer, ArrayList<Patient>>();

	@Override
	public ArrayList<Doctor> adddoctor() 
	{
		//doctor = new ArrayList<Doctor>(); 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  new doctor name");
		String n = sc.next();
		System.out.println("Enter  new doctor id");
		int i = sc.nextInt();
		System.out.println("Enter  new doctor Specilization");
		String s = sc.next();
		System.out.println("Enter  new doctor Availibility");
		String a = sc.next();
		Doctor doctor1 = new Doctor(n,i,s,a);
		
		CliniqueData.doctor.add(doctor1);
		doctor=CliniqueData.doctor;
		printdoctor(doctor);
		// TODO Auto-generated method stub
		return doctor;
	}

	@Override
	public ArrayList<Patient> addpatient() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  new patient name");
		String n = sc.next();
		System.out.println("Enter  new patient id");
		int i = sc.nextInt();
		System.out.println("Enter  new patient Phonenumber");
		long p = sc.nextLong();
		
		Patient patient1 = new Patient(n,i,p);
		CliniqueData.patients.add(patient1);
		patient = CliniqueData.patients;
		printpatient(patient);
		// TODO Auto-generated method stub
		return patient;
		// TODO Auto-generated method stub
	}

	@Override
	public Doctor Searchdoctorbyname(String name) 
	{
		
		for(Doctor doc : q1.readdoc())
		{
			if(doc.getName().equals(name))
			{
				System.out.println(doc);
				return doc;
			}
		}
		System.out.println("Sorry,this name doctor is not available in Clinic");
		// TODO Auto-generated method stub
		return null;
	}

	public static Doctor Searchdoctorbyid(int id) 
	{
		for(Doctor doc : q1.readdoc())
		{
			if(doc.getId() == id)
			{
				System.out.println(doc);
				return doc;
			}
		}
		System.out.println("Sorry,this id of doctor is not available in Clinic");
		return null;
		// TODO Auto-generated method stub
	}

	@Override
	public Doctor Searchdoctorbyspecilization(String specilization) 
	{
		for(Doctor doc : q1.readdoc())
		{
			if(doc.getSpecilization().equals(specilization))
			{
				System.out.println(doc);
				return doc;
			}
		}
		System.out.println("Sorry,this doctor Specilist is not available in Clinic");
		return null;
	}

	@Override
	public Doctor SearchdoctorbyAvability(String Avability) 
	{
		CliniqueData q1 = new CliniqueData();
		for(Doctor doc : q1.readdoc())
		{
			if(doc.getAvailibility().equals(Avability))
			{
				System.out.println(doc);
				return doc;
			}
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Patient SearchPatientbyname(String name) 
	{
		for(Patient pat : q1.readpat())
		{
			if(pat.getName().equals(name))
			{
				System.out.println(pat);
				return pat;
			}
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Patient SearchPatientbyid(int id) 
	{
		for(Patient pat : q1.readpat())
		{
			if(pat.getId() == id)
			{
				System.out.println(pat);
				return pat;
			}
		}
		// TODO Auto-generated method stub
		return null;
		
	}

	
	@Override
	public void printdoctor(ArrayList<Doctor> doctor) 
	{
		for (Doctor doctor2 : doctor) 
		{
			System.out.println(doctor2);
			
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printpatient(ArrayList<Patient> patients) 
	{
		for (Patient patient2 : patients) 
		{
			System.out.println(patient2);
			
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public Patient SearchPatientbyphonenumber(long PhoneNumber) 
	{
		for(Patient pat : q1.readpat())
		{
			if(pat.getPhoneNumber() == PhoneNumber)
			{
				System.out.println(pat);
				return pat;
			}
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Appointment() 
	{
		Scanner sc = new Scanner(System.in);
		//ArrayList[] d = new ArrayList[5];
		//Doctor doc = new Doctor();
		//Patient p = new Patient();
		

		
		System.out.println("Enter  desire doctor id");
		
		int Id = sc.nextInt();
		System.out.println("Enter patient id");
		int i = sc.nextInt();
		Patient p = SearchPatientbyid(i);
		Doctor doc = Searchdoctorbyid(Id);
		if(doc.getCount() < 5)
		{
			doc.getQ1().add(p);
			w1.put(doc.getId(), doc.getQ1());
			doc.setCount(doc.getCount()+1);
		}
	}
	public void Appointment_Details()
	{
		Set s = w1.keySet();
		for (Object object : s) 
		{
			System.out.println("patient appointed under : " + Searchdoctorbyid((int)object).getName());
			System.out.println(w1.get(object));
			
		}
			
		
	}

	}
	


