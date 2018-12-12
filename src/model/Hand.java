package model;

import java.util.ArrayList;
import java.util.Iterator;

public class Hand implements Iterable<Card>{
	
	private ArrayList<Card> hand;
	
	public Hand () {
		this.hand=new ArrayList<Card>();
	}
	
	public Card addCard(Card c) {
		this.hand.add(c);
		return c;
	}
	
	public Card removeCard(Card c){
		if(this.hand.remove(c))
			return c;
		throw new Error();
	}

	@Override
	public Iterator<Card> iterator() {
		return this.hand.iterator();
	}
	
}
