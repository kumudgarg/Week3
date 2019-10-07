package com.bridgelab.Oops.Stock.Service;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelab.Oops.InventoryManagement.model.Inventory;
import com.bridgelab.Oops.Stock.model.Stock;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class StockServiceimp implements StockService
{
	List<Stock> stocks = new ArrayList<>();
	JSONParser parser = new JSONParser();
	JSONObject obj = new JSONObject();
	@Override
	public void read() 
	{
		JSONArray arr;
		{
			try {
				 arr = (JSONArray)parser.parse(new FileReader("/home/admin123/Desktop/data sturcture/bridge/src/com/bridgelab/Oops/Stock/json/stock.josn"));
				 for (Object  jak : arr)
				 {
					 Stock inc = new Stock();
					 JSONObject or = (JSONObject) jak;
					 String name = (String)or.get("name");
					 inc.setName(name);
					 long sharenum = (Long)or.get("sharenum");
					 inc.setSharenum(sharenum);
					 double price = (double)or.get("price");
					 inc.setPrice(price);
					 stocks.add(inc);
					 System.out.println(inc.toString());
				 }
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	@Override
	public void write() 
	{
		Gson gs = new GsonBuilder().setPrettyPrinting().create();
		String json = gs.toJson(stocks);
		try (
			FileWriter pw = new FileWriter("/home/admin123/Desktop/data sturcture/bridge/src/com/bridgelab/Oops/Stock/json/stock.josn")){
			pw.write(json);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("file content are : " + json);
		
		
	}
	@Override
	public void calculate() 
	{
		
		stocks.forEach(stock -> {
			 
			System.out.println(
					"Total price of " + stock.getName() + " is " + (stock.getPrice() * stock.getSharenum()));
			});
		

}
}
