package com.bridgelab.Oops.Stock.main;

import com.bridgelab.Oops.Stock.Service.StockService;
import com.bridgelab.Oops.Stock.Service.StockServiceimp;

public class Stock_Details 
{
	public static void main(String[] args) 
	{
		StockService share = new StockServiceimp();
		{
			
			share.read();
			share.calculate();
			share.write();
				
		}
		
	}

}
