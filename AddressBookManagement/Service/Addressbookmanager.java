package com.bridgelab.Oops.AddressBookManagement.Service;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelab.Oops.AddressBookManagement.model.Addressbook;
import com.bridgelab.Oops.InventoryManagement.model.Inventory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Addressbookmanager implements AddressBook
{
	public ArrayList<Addressbook> addbook = new ArrayList<Addressbook>();
	JSONParser parser = new JSONParser();
	JSONObject obj = new JSONObject();

	public Addressbookmanager(ArrayList<Addressbook> addbook) 
	{
		this.addbook = addbook;
	}

	public Addressbookmanager() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fileread(String name) 
	{
		JSONArray arr;
		{
			try {
				 arr = (JSONArray)parser.parse(new FileReader("/home/admin123/Desktop/data sturcture/bridge/src/com/bridgelab/Oops/AddressBookManagement/" + name));
				 for (Object  jak : arr)
				 {
					 Addressbook inc = new Addressbook();
					 JSONObject or = (JSONObject) jak;
					 String FirstName = (String)or.get("FirstName");
					 inc.setFirstName(FirstName);
					 String LastName = (String)or.get("LastName");
					 inc.setLastName(LastName);
					 String Address = (String)or.get("Address");
					 inc.setAddress(Address);
					 String City = (String)or.get("City");
					 inc.setCity(City);
					 String State = (String)or.get("State");
					 inc.setState(State);
					 long Zip =  (long) or.get("Zip");
					 inc.setZip(Zip);
					 long PhoneNumber = (long)or.get("PhoneNumber");
					 inc.setPhoneNumber(PhoneNumber);
					 addbook.add(inc);
					 System.out.println(inc.toString());
				 }
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		// TODO Auto-generated method stub
	}
	}

	@Override
	public void addPerson() {
		
			Scanner sc = new Scanner(System.in);
		
	
		try {
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		Addressbook invent = new Addressbook();
		System.out.println("enter a string");
		String arr = sc.nextLine();
		invent.setAd(arr);
		System.out.println("enter first name");
		String FirstName = sc.nextLine();
		invent.setFirstName(FirstName);
		System.out.println("enter last name");
		String LastName = sc.nextLine();
		invent.setLastName(LastName);
		System.out.println("enter Address");
		String Address = sc.nextLine();
		invent.setAddress(Address);
		System.out.println("enter City");
		String City = sc.nextLine();
		invent.setCity(City);
		System.out.println("enter State");
		String State = sc.nextLine();
		invent.setState(State);
		System.out.println("enter Zip");
		long Zip = sc.nextLong();
		invent.setZip(Zip);
		System.out.println("enter Phonenumber");
		long Phonenumber = sc.nextLong();
		invent.setPhoneNumber(Phonenumber);
		addbook.add(invent);
	}

	@Override
	public void edit_Person(String name) 
	{
		Print(addbook);
		Scanner sc = new Scanner(System.in);
		for(Addressbook edit : addbook)
		{
			if(edit.getFirstName().equals(name))
			{
				System.out.println("Enter your Address");
				String p = sc.nextLine();
				edit.setAddress(p);
				System.out.println("Enter your City");
				try
				{
					edit.setCity(sc.nextLine());
				}
				catch (Exception e1) {
					// TODO: handle exception
				}
				System.out.println("Enter your State");
				try {
					edit.setState(sc.nextLine());
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
				System.out.println("Enter zip");
				try {
					edit.setZip(sc.nextLong());
					
				} catch (Exception e3) {
					// TODO: handle exception
				}
				System.out.println("Enter phonenumber");
				try {
					edit.setPhoneNumber(sc.nextLong());
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				Print(addbook);
			}
		}
		
	}

	@Override
	public void delete_Person(String name) 
	{
		for(Addressbook edit : addbook)
		{
			if(edit.getFirstName().equals(name))
			{
				addbook.remove(edit);
				break;
			}
		}
		//Print(addbook);
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Addressbook> sort_lastname(ArrayList<Addressbook> addbook) 
	{
		Collections.sort(addbook,new NameComparator());
		
		return addbook;
		
	}
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Addressbook> sort_zip(ArrayList<Addressbook> addbook) 
	{
		Collections.sort(addbook,new NameComparator());
		
		return addbook;
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Print(ArrayList<Addressbook> addbook) 
	{
		for(Addressbook adbook : addbook)
		{
			System.out.println("First Name:- "+adbook.getFirstName()+" Last Name:- "+adbook.getFirstName());
			System.out.println("Address:- "+adbook.getAddress());
			System.out.println("City:- "+adbook.getCity()+" State:- "+adbook.getState());
			System.out.println("Zip code:- "+adbook.getZip());
			System.out.println("PhoneNumber code:- "+adbook.getPhoneNumber());
			System.out.println();
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean CreateFile(String file) 
	{
		File files = new File("/home/admin123/Desktop/data sturcture/bridge/src/com/bridgelab/Oops/AddressBookManagement/json/" + file);
		fileread(file);
		boolean existence = files.exists();
		if(existence)
		{
			return true;
		}
		try {
			files.createNewFile();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public void write(String file) 
	{
		Gson gs = new GsonBuilder().setPrettyPrinting().create();
		String json = gs.toJson(addbook);
		try (
			FileWriter pw = new FileWriter("/home/admin123/Desktop/data sturcture/bridge/src/com/bridgelab/Oops/AddressBookManagement/json" + file + ".json"))
		{
			pw.write(json);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("file content are : " + json);
		
	}
	

}
