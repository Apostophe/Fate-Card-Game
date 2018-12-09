package app;

import java.io.File;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader l = new FXMLLoader();
			URL u = new File("src/view/GraphicView.fxml").toURI().toURL();
			l.setLocation(u);
			Pane root = new Pane();
			root=l.load();
			Scene s = new Scene(root);
			primaryStage.setScene(s);
			primaryStage.setTitle("FATE CARD GAME");
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
