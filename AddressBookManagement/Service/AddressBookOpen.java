package com.bridgelab.Oops.AddressBookManagement.Service;

import java.util.ArrayList;
import java.util.Scanner;

import com.bridgelab.Oops.AddressBookManagement.model.Addressbook;

public class AddressBookOpen 
{
	ArrayList<Addressbook> addbook = new ArrayList<Addressbook>();
	Addressbookmanager book;
	String bookName;
	AddressBookOpen(ArrayList<Addressbook> addbook,String bookname)
	{
		this.addbook = addbook;
		this.bookName = bookName;
		book = new Addressbookmanager(addbook);
	}
	public void action()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Press the following numbers to perform actions:- ");
		System.out.println(" 1.Add person \n 2.Edit person \n 3.remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Quit");
		int need=sc.nextInt();
		while(need==1||need==2||need==3||need==4||need==5||need==6)
		{
			
			switch(need)
			{
							case 1:{
										
										book.addPerson();
										book.Print(book.addbook);
										System.out.println(" 1.Add person \n 2.Edit person \n 3.Remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Quit");
										need = sc.nextInt();
										 break;
								   }
							case 2:{
										
										book.Print(	book.addbook);
										System.out.println("Enter the person first name to edit");
										String names= sc.nextLine();
										System.out.println();
										int zip = sc.nextInt();
										System.out.println();
										long phonenumber = sc.nextLong();
										book.edit_Person(names);
										System.out.println(" 1.Add person \n 2.Edit person \n 3.Remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Quit");
										need = sc.nextInt();;
										break;
								   }
							case 3:{
										
										System.out.println("Enter the person first name to delete");
										String names = sc.nextLine() ;
										book.delete_Person(names);
										System.out.println(" 1.Add person \n 2.Edit person \n 3.Remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Quit");
										need = sc.nextInt();
										break;
										
									}
							case 4:{
								
									ArrayList<Addressbook> nameList= book.sort_lastname(book.addbook);
									book.Print(nameList);
									System.out.println(" 1.Add person \n 2.Edit person \n 3.Remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Quit");
									need = sc.nextInt();
									break;
								  }
							
							case 5:{
								
										ArrayList<Addressbook> nameList= book.sort_zip(book.addbook);
										book.Print(nameList);
										System.out.println(" 1.Add person \n 2.Edit person \n 3.Remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Quit");
										need = sc.nextInt();
										break;
							  		}
							case 6:{
										
										book.write(bookName);
										need=7;
										break;
									}
			}
		}
	}
}
		
		
	

