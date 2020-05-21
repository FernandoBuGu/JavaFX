package application;
	
/**
 * JavaFX, displaying menu window and its actions
 * ....
 * 
 * @author feBueno - May 2020
 * 
 * REQUIRED:
 * JavaFX - SceneBuilder setup
 * REQUIRED IN SAME PACKAGE:
 * TopGene.java
 * Modal.java
 * MainController.java
 * Main.fxml
 * applications.css
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
