package com.bridgelab.Oops.Stock.model;

public class Stock 
{
	private String stock;
	private String name;
	private long sharenum;
	private double price ;
	
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSharenum() {
		return sharenum;
	}
	public void setSharenum(long sharenum) {
		this.sharenum = sharenum;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
