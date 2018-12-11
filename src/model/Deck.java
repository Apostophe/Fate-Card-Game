
package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Deck implements Iterable{
	
	private ArrayList<Card> deck;
	
	public Deck () {
		this.deck=new ArrayList<Card>();
	}
	
	public void ajouterAtk(int ajout) {
		//this.deck.stream().reduce((x,y),x+=ajout);
	}

	@Override
	public Iterator iterator() {
		return this.deck.iterator();
	}
	

}
