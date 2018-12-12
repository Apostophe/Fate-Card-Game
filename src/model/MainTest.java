package model;

public class MainTest {

	public static void main(String[] args) {
		Deck d1 = new Deck();
		Hand h1 = new Hand();
		
		Deck d2= new Deck();
		Hand h2 = new Hand();
		
		ServantCard sc1= new ServantCard(1,5,ServantClass.Saber,"Artoria Pendragon",1300,2600);
		ServantCard sc2= new ServantCard(2,5,ServantClass.Archer,"Gilgamesh",2500,2000);
		ServantCard sc3= new ServantCard(3,4,ServantClass.Saber,"Mordred",2800,1200);
		ServantCard sc4= new ServantCard(4,3,ServantClass.Lancer,"Cu Chulainn",1300,1800);
		ServantCard sc5= new ServantCard(5,4,ServantClass.Saber,"Siegfried",2000,2000);
		ServantCard sc6= new ServantCard(6,1,ServantClass.Berserker,"Lancelot",3000,1200);
		ServantCard sc7= new ServantCard(7,2,ServantClass.Caster,"William Shakespeare",1000,1000);
		ServantCard sc8= new ServantCard(8,5,ServantClass.Ruler,"Amakasu Shiro",3000,3000);
		ServantCard sc9= new ServantCard(9,4,ServantClass.Archer,"Emiya",2100,1700);
		ServantCard sc10= new ServantCard(10,2,ServantClass.Berserker,"Heracles",2500,800);
		
		d1.addCard(sc1);
		d1.addCard(sc2);
		d1.addCard(sc3);
		d1.addCard(sc4);
		d1.addCard(sc5);
		
		d2.addCard(sc6);
		d2.addCard(sc7);
		d2.addCard(sc8);
		d2.addCard(sc9);
		d2.addCard(sc10);
		
		d1.shuffle();
		d2.shuffle();
		
		Player p1 = new Player(h1,d1);
		Player p2 = new Player(h2,d2);

		Game g = new Game(p1,p2);
		
		
		g.placeCard(p1, p1.drawCard());
		g.placeCard(p1, p1.drawCard());
		g.placeCard(p2, p2.drawCard());
		g.placeCard(p2,	p2.drawCard());
		for(int i=0;i<5;i++) {
			g.turn();
		}
		
	}

}
