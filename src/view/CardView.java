package view;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Carte;

public class CardView extends ImageView{
	private Carte card;
	
	public CardView(Carte card) {
		super(new Image("file:src/assets/JA.png"));
		this.card=card;
		
	}
}
