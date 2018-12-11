package model;

public class Card {
	private int id;
	private String name;
	
	public Card(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return ""+this.id+" : "+this.name;
	}

}