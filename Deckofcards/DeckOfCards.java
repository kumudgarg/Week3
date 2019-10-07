package com.bridgelab.Oops.Deckofcards;

import java.util.Arrays;
import java.util.Random;

public class DeckOfCards 
{
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
	public static String[][] distribute(int playernumbers, int numbercards)
	{
		String[][] playerCards = new String[numbercards][playernumbers];
		int count = 0;
		//System.out.println(playerCards[0].length);
		for (int i = 0; i < numbercards; i++) 
		{
			for (int j = 0; j < playerCards[i].length; j++) 
			{
				
				playerCards[i][j] = Cards[count];
				//System.out.println(playerCards[i][j]);
				count++;
			}
			
			
		}
		//System.out.println(Arrays.toString(playerCards));
		
		return playerCards;
	}
	public static void dipslay(String[][] playerCards,int playersnum,int numbercards)
	{
		System.out.println(playerCards.length);
		System.out.println();
		for(int i = 0; i < numbercards; i++)
		{
			for (int j = 0; j < playersnum; j++) 
			{
				if(playerCards[i][j] == null)
				{
					return;
				}
				System.out.print(playerCards[i][j] + "," + " ");
				
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) 
	{
		DeckOfCards cd = new DeckOfCards();
		cd.getCards();
		cd.ShuffleCards();
		String[][] playerCards = cd.distribute(4,9);
		cd.dipslay(playerCards,4,9);
	}
	

}
