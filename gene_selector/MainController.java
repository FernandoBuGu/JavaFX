package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

import java.net.URL;
import java.util.*;

public class MainController implements Initializable{
		
	@FXML
	private Label selectedGene;
	
	@FXML
	private ListView<String> geneDescription;
	
	@FXML
	private ComboBox<String> combobox;
	
	ObservableList<String> geneslist = FXCollections.observableArrayList("BRCA1","BRCA2","TP53");

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//combobox.setItems(geneslist);
		//geneDescription.setItems(geneslist);
		geneDescription.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

	}
	
	
	public void generateRandom(ActionEvent event){
		Random rand = new Random();
		int myint = rand.nextInt(6);
		
		//System.out.print(Integer.toString(myint));
	}
	
	public void comboChanged(ActionEvent event) {
		//selectedGene.setText(combobox.getValue());
		combobox.getItems().addAll("LuminalA","Basal","Her2");
	}
	
	public void buttenAction(ActionEvent event) {
		geneDescription.getItems().addAll("LuminalB","Basal","Her2");
		ObservableList<String> genesGO;
		genesGO= geneDescription.getSelectionModel().getSelectedItems();
		for(String name : genesGO) {
			System.out.println(name);
		}
	}
}
