package application;

/**
 * JavaFX login application
 * @author feBueno - May 2020
 * 
 * REQUIRED:
 * JavaFX - SceneBuilder setup
 * REQUIRED IN SAME PACKAGE:
 * MainController.java
 * Main.fxml
 * Login.fxml
 * applications.css
 * mlogo2.png
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
			Parent root = FXMLLoader.load(getClass().getResource("/application/Login.fxml"));
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
