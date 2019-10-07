package com.bridgelab.Oops.AddressBookManagement.Service;

import java.util.Comparator;

import com.bridgelab.Oops.AddressBookManagement.model.Addressbook;
@SuppressWarnings("rawtypes")
public class NameComparator implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) 
	{
		Addressbook addbook1 = (Addressbook)o1;
		Addressbook addbook2 = (Addressbook)o2;
		return addbook1.getLastName().compareTo(addbook2.getLastName());
	}}
