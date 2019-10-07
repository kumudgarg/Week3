package com.bridgelab.Oops.InventoryManagement.service;

public interface Inventoryservice 
{
	public void add(String arr, String name, long weight, long price);
	public void read();
	public void write();
	public void calculate();
	public void remove(String name);
	
}
