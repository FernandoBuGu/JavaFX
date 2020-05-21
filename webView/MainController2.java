package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class MainController2 implements Initializable{

	@FXML private WebView webview;	
	
	private WebEngine engine;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		engine = webview.getEngine();
	}
	
	public void btn1(ActionEvent event) {
		engine.load("https://www.ncbi.nlm.nih.gov/");
	}
	public void btn2(ActionEvent event) {
		engine.executeScript("window.location = \"https://www.breastcancer.org/risk/factors/genetics//\";");
	}
	public void btn3(ActionEvent event) {
		engine.loadContent("<html><body><h1>Breast Cancer Genes</h1><body></html>");
	}
	public void btn4(ActionEvent event) {
		engine.getHistory();
	}
	public void btn5(ActionEvent event) {
		//engine.reload();
		engine.getLocation();
	}
	
	

}
