package view;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.ServantCard;

public class CardView extends ImageView{
	private ServantCard card;
	
	public CardView(ServantCard card, String png) {
		super(new Image(png));
		this.card=card;
		
	}
}
