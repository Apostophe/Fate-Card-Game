package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	private Player p1,p2;
	private ArrayList<Card> field1;
	private ArrayList<Card> field2;
	private static int turns = 0;
	
	
	public Game(Player p1, Player p2) {
		this.p1 = p1;
		this.p2 = p2;
		this.field1 = new ArrayList<Card>();
		this.field2 = new ArrayList<Card>();
	}
	
	
	public void turn() {
		Scanner s = new Scanner(System.in);
		int choixAttaque;
		int choixAttaquant;
		if(turns%2==0) {
			System.out.println("Au player 1 : ");
			
			System.out.print("Choississez le servant à attaquer : ");
			for(int i =0;i<field2.size();i++)
				System.out.print("\n\t "+(i+1)+")"+field2.get(i));
			System.out.println("");
			
			choixAttaque = s.nextInt();
			
			System.out.print("Choississez le servant qui va attaquer : ");
			for(int i =0;i<field1.size();i++)
				System.out.print("\n\t "+(i+1)+")"+field1.get(i));
			System.out.println("");
			
			choixAttaquant = s.nextInt();
			
			this.p1.attack(field1.get(choixAttaque-1), field2.get(choixAttaquant-2));
			
		}else{
			System.out.println("Au player 2 : ");
			System.out.print("Choississez le servant à attaquer : ");
			for(int i =0;i<field1.size();i++)
				System.out.print("\n\t "+(i+1)+")"+field1.get(i));
			System.out.println("");
			
			choixAttaque = s.nextInt();
			
			System.out.println("Choississez le servant qui va attaquer : ");
			for(int i =0;i<field2.size();i++)
				System.out.print("\n\t "+(i+1)+")"+field2.get(i));
			System.out.println("");
			
			choixAttaquant = s.nextInt();
			
			this.p1.attack(field2.get(choixAttaque-1), field1.get(choixAttaquant-2));
		}
		turns++;
	}
	
	public void placeCard(Player p,Card c) {
		if(p.equals(p1)) 
			this.field1.add(this.p1.playCard(c));
		else
			this.field2.add(this.p2.playCard(c));
	}
	
}
