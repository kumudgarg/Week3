package com.bridgelab.Oops.AddressBookManagement.Service;

import java.util.ArrayList;
import java.util.List;

import com.bridgelab.Oops.AddressBookManagement.model.Addressbook;

public interface AddressBook 
{
	public void fileread(String name);
	public void addPerson();
	public void edit_Person(String name);
	public void delete_Person(String name);
	public	ArrayList<Addressbook> sort_lastname(ArrayList<Addressbook> addbook);
	public ArrayList<Addressbook> sort_zip(ArrayList<Addressbook> addbook);
	public boolean CreateFile(String file);
	public void write(String file);
	public void Print(ArrayList<Addressbook> addbook);
	
}


