package com.bridgelab.Oops.AddressBookManagement.main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bridgelab.Oops.AddressBookManagement.Service.AddressBook;
import com.bridgelab.Oops.AddressBookManagement.Service.Addressbookmanager;

public class Addressapp
{
	public static void main(String[] args) throws IOException 
	{

		Addressbookmanager create = new Addressbookmanager();
		System.out.println("Press the following numbers to perform actions:- ");
		System.out.println(" 1.Create new address book \n 2.Open existing address book \n 3.Quit");
		int i = 0;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		while (i == 0) 
		{

			switch (choice) 
			{

				case 1: 
				{
	
					System.out.println("Enter the Adress book name ");
					name = sc.nextLine();
					name = sc.nextLine();
					if (create.CreateFile(name) == true) 
					{
	
						choice = 1;
						System.out.println("file already exist");
							break;
					}
					System.out.println("Press the following numbers to perform actions:- ");
					System.out.println(
							" 1.Add person \n 2.Edit person \n 3.remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Save&Quit");
					int need = sc.nextInt();
	
					while (need < 7) 
					{
	
						switch (need) 
						{
							case 1: 
							{
		
								create.addPerson();
								create.Print(create.addbook);
								System.out.println(
										" 1.Add person \n 2.Edit person \n 3.Remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Save&Quit");
								need = sc.nextInt();
								break;
							}
							case 2: 
							{
		
								create.Print(create.addbook);
								System.out.println("Enter the person first name to edit");
								String names = sc.nextLine();
								names = sc.nextLine();
								create.edit_Person(names);
								System.out.println(
										" 1.Add person \n 2.Edit person \n 3.Remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Save&Quit");
								need = sc.nextInt();
								break;
							}
							case 3: 
							{
		
								System.out.println("Enter the person first name to delete");
								
								String firstname= sc.nextLine();
							    
								firstname = sc.nextLine();
								create.delete_Person(firstname);
								System.out.println();
								System.out.println(
										" 1.Add person \n 2.Edit person \n 3.Remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Quit");
								need = sc.nextInt();
								break;
		
							}
							case 4: 
							{
		
								ArrayList<com.bridgelab.Oops.AddressBookManagement.model.Addressbook> nameList= create.sort_lastname(create.addbook);
								create.Print(nameList);
								System.out.println(
										" 1.Add person \n 2.Edit person \n 3.Remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Save&Quit");
								need = sc.nextInt();
								break;
							}
							case 5: 
							{
		
								ArrayList<com.bridgelab.Oops.AddressBookManagement.model.Addressbook> zipList= create.sort_zip(create.addbook);
								create.Print(zipList);
								System.out.println(
										" 1.Add person \n 2.Edit person \n 3.Remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Save&Quit");
								need = sc.nextInt();;
								break;
							}
							case 6: 
							{
		
								System.out.println(name);
		
								create.write(name);
								need=7;
								break;
							}
	
						}
					}
					break;
				}
				case 2: 
				{
	
					//create.fileread();
					File files = new File("/home/admin123/Desktop/data sturcture/bridge/src/com/bridgelab/Oops/AddressBookManagement");
					String[] a1 = files.list();
					int index=1;
					for (String string : a1) 
					{
						System.out.println(index+"."+string);
						index++;
					}
					System.out.println("select a file number");
					int res = sc.nextInt();
					
					name = a1[res - 1];
					//name = sc.nextLine();
					create.CreateFile(name);
					System.out.println("Press the following numbers to perform actions:- ");
					System.out.println(
							" 1.Add person \n 2.Edit person \n 3.remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Save&Quit");
					
					int need = sc.nextInt();
	
					while (need < 7) 
					{
	
						switch (need) 
						{
							case 1: 
							{
		
								create.addPerson();
								create.Print(create.addbook);
								System.out.println(
										" 1.Add person \n 2.Edit person \n 3.Remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Save&Quit");
								need = sc.nextInt();
								break;
							}
							case 2: 
							{
		
								create.Print(create.addbook);
								System.out.println("Enter the person first name to edit");
								String names = sc.nextLine();
								names = sc.nextLine();
								create.edit_Person(names);
								System.out.println(
										" 1.Add person \n 2.Edit person \n 3.Remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Save&Quit");
								need = sc.nextInt();
								break;
							}
							case 3: 
							{
		
								System.out.println("Enter the person first name to delete");
								String firstname= sc.next();
								create.delete_Person(firstname);
								System.out.println(
										" 1.Add person \n 2.Edit person \n 3.Remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Quit");
								need = sc.nextInt();
								break;
		
							}
							case 4: 
							{
		
								ArrayList<com.bridgelab.Oops.AddressBookManagement.model.Addressbook> nameList= create.sort_lastname(create.addbook);
								create.Print(nameList);
								System.out.println(
										" 1.Add person \n 2.Edit person \n 3.Remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Save&Quit");
								need = sc.nextInt();
								break;
							}
							case 5: 
							{
		
								ArrayList<com.bridgelab.Oops.AddressBookManagement.model.Addressbook> zipList= create.sort_zip(create.addbook);
								create.Print(zipList);
								System.out.println(
										" 1.Add person \n 2.Edit person \n 3.Remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Save&Quit");
								need = sc.nextInt();;
								break;
							}
							case 6: 
							{
		
								System.out.println(name);
		
								create.write(name);
								need=7;
								break;
							}
						}
					}
	
					System.out.println(" 1.Create new address book \n 2.Open existing address book \n 3.Quit");
					choice = sc.nextInt();
					

					break;
	
				}
				case 3: 
				{
	
					System.exit(0);
					break;
	
				}

			}
		}
	}
}


		

	