package com.bridgelab.Oops.Deckofcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

import javax.management.Query;

import com.bridgelab.Utility.Linkedlist_Queue;
import com.bridgelab.algorithm.Utility;

public class Player 
{
	
	
	static Linkedlist_Queue<String> que;
	static Linkedlist_Queue<String> players;
	static String[] b = new String[9];
	public String[] suits = {"Clubs","Diamonds","heart","Spade"};
	public String[] Rank = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
	public static String[] Cards = new String[52];
	static String card = " ";
	int k = 0;
	public String[] getCards()
	{
		for(int i = 0; i < Rank.length;i++)
		{
			card = Rank[i];
			for(int j = 0; j < suits.length; j++)
			{
				Cards[k] = card + " " + suits[j];
				k++;
			}
		}
		System.out.println(Arrays.toString(Cards));
		return Cards;
	}
	public String[] ShuffleCards()
	{
		Random random = new Random();
		for(int i = 0; i < Cards.length; i++)
		{
			int slot = random.nextInt(52);
			String nextcard = Cards[slot];
			Cards[slot] = Cards[i];
			Cards[i] = nextcard;
			
		}
		System.out.println(Arrays.toString(Cards));
		return Cards;
	}
	public static void distribute(int playernumbers, int numbercards)throws Exception
	{
		int count = 0;
		
		//System.out.println(playerCards[0].length);
		for (int i = 0; i < playernumbers; i++) 
		{
			for (int j = 0; j < numbercards; j++) 
			{
				
				b[j] = Cards[count];
				count++;
			}
			
			players = new Linkedlist_Queue<String>();
			Utility.BubbleSortString(b);
			players.enqueue(String.valueOf(b));
			//b = null;
		}
	}
	public static void display(int playernumbers) 
	{
		for (int i = 0; i < playernumbers; i++) 
		{
			players.dequeue();
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) throws Exception 
	{
		Player p1 = new Player();
		p1.getCards();
		p1.ShuffleCards();
		distribute(4,9);
		display(4);
		
		
	}
		
}
