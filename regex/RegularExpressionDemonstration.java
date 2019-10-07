package com.bridgelab.Oops.regex;
import java.util.regex.*;
import java.util.Scanner;
import java.util.*;

public class RegularExpressionDemonstration 
{
	public static void main(String[] args) 
	{
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		String s = "Hello kumu , We have your full name as kumudgarg in our system. your contact number is 91-9468679750 Please, let us know in case of any clarification Thank you BridgeLabz 01/01/2016";
		String[] reg = s.split(" ");
		String str;
		flag = Pattern.matches("[a-zA-z]{5,8}",reg[1]);
		if(flag)
		{
			System.out.println(flag + " inserting is right");
		}
		else
		{
			System.out.println("enter first name");
			str = sc.nextLine();
			s = s.replace(reg[1],str);
		}
		flag = Pattern.matches("[a-zA-z]{8,14}",reg[9]);
		if(flag)
		{
			System.out.println(flag + " inserting is right");
		}
		else
		{
			System.out.println("enter full name");
			 str = sc.nextLine();
			s = s.replace(reg[9],str);
		}
		flag = Pattern.matches("(91-)[789]{1}[0-9]{9}",reg[17]);
		if(flag)
		{
			System.out.println(flag + "inserting is right");
		}
		else
		{
			System.out.println("enter mobile number");
			str = sc.nextLine();
			s = s.replace(reg[17],str);
		}
		flag = Pattern.matches("(0?[1-9]|[12][0-9]|[3][0-1])[/](0?[1-9]|[1][0-2])[/]([0-9]{4})",reg[30]);
		if(flag)
		{
			System.out.println(flag + "inserting is right");
		}
		else
		{
			System.out.println("enter date");
			str = sc.nextLine();
			s = s.replace(reg[30],str);
		}
		System.out.println("final message " + s);
		
	}

}
