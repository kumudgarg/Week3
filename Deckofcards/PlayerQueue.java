package com.bridgelab.Oops.Deckofcards;
import java.util.Arrays;

import com.bridgelab.Utility.*;
import com.bridgelab.algorithm.*;
public class PlayerQueue extends DeckOfCards
{
	public static void main(String[] args) 
	{
		DeckOfCards d = new DeckOfCards();
		Utility st = new Utility();
		Linkedlist_Queue<String> q1 = new Linkedlist_Queue<String>();
		d.getCards();
		String[] s = d.ShuffleCards();
		s = st.BubbleSortString(s);
		System.out.println(Arrays.toString(sreate));
		for(int i = 0; i < s.length; i++)
		{
			q1.enqueue(s[i]);
		}
		
		q1.read();
		
		
	}

}
