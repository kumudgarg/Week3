package com.bridgelab.Oops.InventoryManagement.main;

import com.bridgelab.Oops.InventoryManagement.service.Inventoryservice;
import com.bridgelab.Oops.InventoryManagement.service.Inventoryserviceimp;

public class Inventory_Details 
{
	public static void main(String[] args) 
	{
		
		Inventoryservice serv = new Inventoryserviceimp();
		{
			
			serv.read();
			serv.calculate();
			serv.write();
				
		}
	}
}
