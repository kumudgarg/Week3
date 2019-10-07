package com.bridgelab.Oops.InventoryManagement.service;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelab.Oops.InventoryManagement.model.Inventory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;

public  class Inventoryserviceimp implements Inventoryservice
{
	List<Inventory> inventories = new ArrayList<>();
	JSONParser parser = new JSONParser();
	JSONObject obj = new JSONObject();
	

	@Override
	public void read()
	{
		JSONArray arr;
		{
			try {
				 arr = (JSONArray)parser.parse(new FileReader("/home/admin123/Desktop/data sturcture/bridge/src/com/bridgelab/Oops/InventoryManagement/json/Inventory.json"));
				 for (Object  jak : arr)
				 {
					 Inventory inc = new Inventory();
					 JSONObject or = (JSONObject) jak;
					 String name = (String)or.get("name");
					 inc.setName(name);
					 long weight = (Long)or.get("weight");
					 inc.setWeight(weight);
					 long price = (Long)or.get("price");
					 inc.setPrice(price);
					 inventories.add(inc);
					 System.out.println(inc.toString());
				 }
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	@Override
	public void add(String arr, String name, long weight, long price) 
	{
		try {
			
			read();
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		Inventory invent = new Inventory();
		invent.setInventory(arr);
		invent.setName(name);
		invent.setPrice(price);
		invent.setWeight(weight);
		inventories.add(invent);
		write();
	}
	
	@Override
	public void calculate() 
	{
		inventories.forEach(inventory -> {
			System.out.println(
					"Total price of " + inventory.getName() + " is " + (inventory.getPrice() * inventory.getWeight()));
			});	
	}
	
	@Override
	public void remove(String name) 
	{
		inventories.removeIf(inventory1 -> inventory1.getName().equals(name));
		write();
		
	}
	@Override
	public void write() 
	{
		Gson gs = new GsonBuilder().setPrettyPrinting().create();
		String json = gs.toJson(inventories);
		try (
			FileWriter pw = new FileWriter("/home/admin123/Desktop/data sturcture/bridge/src/com/bridgelab/Oops/InventoryManagement/json/Inventory.json")){
			pw.write(json);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("file content are : " + json);
		
	}


}
