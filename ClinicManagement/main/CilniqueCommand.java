package com.bridgelab.Oops.ClinicManagement.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.bridgelab.Oops.ClinicManagement.Service.CliniqueData;
import com.bridgelab.Oops.ClinicManagement.Service.Cliniqueimp;
import com.bridgelab.Oops.ClinicManagement.model.Doctor;
import com.bridgelab.Oops.ClinicManagement.model.Patient;

public class CilniqueCommand 
{
	
	public static void main(String[] args) 
	{
		CliniqueData a1 = new CliniqueData();
		Cliniqueimp h1 = new Cliniqueimp();
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.list of Doctors\n 2.list of patients\n 3.Appointment\n 4.Appointment_Details");
		System.out.println("select your choice");
		choice  = sc.nextInt();
		int i = 1;
		ArrayList<Doctor> doc1 = null;
		ArrayList<Patient> pat1 = null;// = new ArrayList<Doctor>() ;
		
		while(i > 0)
		{
			switch (choice) 
			{
				case 1:
				{
					for (Doctor doc : a1.readdoc()) 
					{
						System.out.println(doc.getName());
						
					}
					System.out.println("1.Add new doctor\n 2.Search doctor by name\n 3.search doctor by id\n 4.search doctor by Specilization\n 5.search by Availabilty\n 6.save&quit");
					int choice1  = sc.nextInt();
					while(i > 0)
					{
						switch (choice1) 
						{
								
							case 1:
							{
								//doc1 = new ArrayList<Doctor>();
								doc1 = h1.adddoctor();
								System.out.println("1.Add new doctor\n 2.Search doctor by name\n 3.search doctor by id\n 4.search doctor by Specilization\n 5.search by Availabilty\n 6.save&quit");
								choice1  = sc.nextInt();
								break;
							}
							case 2:
							{
								System.out.println("Enter doctor name");
								String name = sc.next();
								h1.Searchdoctorbyname(name);
								System.out.println("1.Add new doctor\n 2.Search doctor by name\n 3.search doctor by id\n 4.search doctor by Specilization\n 5.search by Availabilty\n 6.save&quit");
								choice1  = sc.nextInt();
								break;
							}
							case 3:
							{
								System.out.println("Enter doctor id");
								int id = sc.nextInt();
								h1.Searchdoctorbyid(id);
								System.out.println("1.Add new doctor\n 2.Search doctor by name\n 3.search doctor by id\n 4.search doctor by Specilization\n 5.search by Availabilty\n 6.save&quit");
								choice1  = sc.nextInt();
								break;
							}
							case 4:
							{
								System.out.println("Enter doctor Specilization");
								String specilization = sc.next();
								h1.Searchdoctorbyspecilization(specilization);
								System.out.println("1.Add new doctor\n 2.Search doctor by name\n 3.search doctor by id\n 4.search doctor by Specilization\n 5.search by Availabilty\n 6.save&quit");
								choice1  = sc.nextInt();
								break;
							}
							case 5:
							{
								System.out.println("Enter doctor Availability");
								String Avability = sc.next();
								h1.SearchdoctorbyAvability(Avability);
								System.out.println("1.Add new doctor\n 2.Search doctor by name\n 3.search doctor by id\n 4.search doctor by Specilization\n 5.search by Availabilty\n 6.save&quit");
								choice1  = sc.nextInt();
								break;
							}
							case 6:
							{
								a1.write();
								System.exit(0);
								break;
							}
					
						}
					}
					System.out.println("1.list of Doctors\n 2.list of patients\n 3.Appointment\n 4.Appointment_Details");
					System.out.println("select your choice");
					choice  = sc.nextInt();
					break;
				}
					
				case 2:	
				{
					for (Patient pat : a1.readpat()) 
					{
						System.out.println(pat.getName());
						
					}
					System.out.println("1.Add new patient\n 2.Search patient by name\n 3.search patient by id\n 4.search patient by PhoneNumber\n 5.save&quit");
					int choice2  = sc.nextInt();
					while(i > 0)
					{
						switch (choice2) 
						{
								
							case 1:
							{
								//doc1 = new ArrayList<Doctor>();
								pat1 = h1.addpatient();
								System.out.println("1.Add new patient\n 2.Search patient by name\n 3.search patient by id\n 4.search patient by PhoneNumber\n 5.save&quit");
								choice2  = sc.nextInt();
								break;
							}
							case 2:
							{
								System.out.println("Enter patient name");
								String name = sc.next();
								h1.SearchPatientbyname(name);
								System.out.println("1.Add new patient\n 2.Search patient by name\n 3.search patient by id\n 4.search patient by PhoneNumber\n 5.save&quit");
								choice2  = sc.nextInt();
								break;
							}
							case 3:
							{
								System.out.println("Enter doctor id");
								int id = sc.nextInt();
								h1.SearchPatientbyid(id);
								System.out.println("1.Add new patient\\n 2.Search patient by name\\n 3.search patient by id\\n 4.search patient by PhoneNumber\\n 5.save&quit");
								choice2  = sc.nextInt();
								break;
							}
							case 4:
							{
								System.out.println("Enter doctor PhoneNumber");
								long PhoneNumber = sc.nextLong();
								h1.SearchPatientbyphonenumber(PhoneNumber);
								System.out.println("1.Add new patient\\n 2.Search patient by name\\n 3.search patient by id\\n 4.search patient by PhoneNumber\\n 5.save&quit");
								choice2  = sc.nextInt();
								break;
							}
							case 5:
							{
								a1.writepat();
								System.exit(0);
								break;
							}
					
						}
					}
					System.out.println("1.list of Doctors\n 2.list of patients\n 3.Appointment\n 4.Appointment_Details");
					System.out.println("select your choice");
					choice  = sc.nextInt();
					break;
				}
				case 3:
				{
					h1.Appointment();
					System.out.println("1.list of Doctors\n 2.list of patients\n 3.Appointment\n 4.Appointment_Details");
					System.out.println("select your choice");
					choice  = sc.nextInt();
					break;
				}
				case 4:
				{
					h1.Appointment_Details();
					System.out.println("1.list of Doctors\n 2.list of patients\n 3.Appointment\n 4.Appointment_Details");
					System.out.println("select your choice");
					choice  = sc.nextInt();
					break;
				}
	
			}
		}
			
	}
}
