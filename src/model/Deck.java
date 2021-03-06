
package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Deck implements Iterable<Card>{
	
	private List<Card> deck;
	
	public Deck () {
		this.deck=new ArrayList<Card>();
	}
	
	public void addCard(Card c) {
		this.deck.add(c);
	}
	
	public Card drawCard() {
		if (this.deck.size()==0)
			throw new Error();
		return this.deck.remove(0);
	}
	
	public void shuffle() {
		Collections.shuffle(this.deck);
	}

	@Override
	public Iterator<Card> iterator() {
		return this.deck.iterator();
	}
	

}
