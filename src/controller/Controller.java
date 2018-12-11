package controller;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import model.ServantCard;
import model.ServantClass;
import view.CardView;

public class Controller implements Initializable{

    @FXML
    private Pane hud;

    private CardView carte;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.carte = new CardView(new ServantCard(1,2,ServantClass.Ruler,"Jeanne d'arc",2000,2000),"file:src/assets/JA.png");
		this.carte.setLayoutX(758);
		this.hud.getChildren().add(this.carte);
		CardView Iskandar = new CardView(new ServantCard(2,5,ServantClass.Rider,"Iskandar",3000,3000),"file:src/assets/Iskandar.png");
		this.hud.getChildren().add(Iskandar);
		
	}

}
