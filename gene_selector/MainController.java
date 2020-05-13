package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;


public class MainController implements Initializable{

	@FXML
	public Label mylabel;
	
	@FXML
	public ComboBox<String> combobox;
	
	ObservableList<String> list = FXCollections.observableArrayList("BRCA1", "BRCA2", "TP53");
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		//combobox.setItems(list);
	}
	
	public void comboChanged(ActionEvent event) {
		combobox.getItems().addAll("pathogenic_Luminal","pathogenic_Basal");
		//mylabel.setText(combobox.getValue());
	}
	public void buttonAction(ActionEvent event) {
		combobox.getItems().addAll("pathogenic_Luminal","pathogenic_Basal");
		//mylabel.setText(combobox.getValue());
	}

}
