package model;

public class Player {
	private Hand hand;
	private Deck deck;
	
	public Player(Hand hand,Deck deck) {
		this.hand=hand;
		this.deck=deck;
	}
	
	public Player() {
		this.hand=new Hand();
		this.deck = new Deck();
	}
	
	public void drawCard() {
		this.hand.addCard(this.deck.drawCard());
	}
	
	public void attack(ServantCard c1, ServantCard c2) {
		c2.loseDef(c1.getAtk());
	}
	public String toString() {
		String tmp = "Main : \n";
		for(Card c:hand)
			tmp+="\t"+c.toString()+"\n";
		tmp+="Deck : \n";
		for(Card c:deck)
			tmp+="\t"+c.toString()+"\n";
		return tmp;
	}
	
	public Card playCard(Card c) {
		return this.hand.removeCard(c);
	}
}
