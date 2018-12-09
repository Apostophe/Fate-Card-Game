package view;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Carte;

public class CardView extends ImageView{
	private Carte card;
	
	public CardView(Carte card, String png) {
		super(new Image(png));
		this.card=card;
		
	}
}
