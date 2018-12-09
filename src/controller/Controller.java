package controller;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import model.Carte;
import model.ServantClass;
import view.CardView;

public class Controller implements Initializable{

    @FXML
    private Pane hud;

    private CardView carte;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.carte = new CardView(new Carte(1,2,ServantClass.Ruler,"Jeanne d'arc",2000,2000));
		this.hud.getChildren().add(this.carte);
		
	}

}
