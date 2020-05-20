package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;

public class MainController implements Initializable{
	final TopGenes BRCA1 = new TopGenes();
	
	
	@FXML
	private Label lblStatus;
	
	@FXML
	private ProgressBar PB;
	
	@FXML
	private ProgressIndicator PI;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		BRCA1.setGene(0);
		BRCA1.geneProperty().addListener(new ChangeListener<Object>(){

			@Override
			public void changed(ObservableValue<? extends Object> arg0, Object arg1, Object arg2) {
				// TODO Auto-generated method stub
				
			}});
			
			PB.progressProperty().bind(BRCA1.geneProperty());
			PI.progressProperty().bind(BRCA1.geneProperty());
	}
	
	public void BtnClick(ActionEvent event) {
		BRCA1.setGene(BRCA1.getGene()+0.1);//increase LFC by 1
	}
	public void Btn2Click(ActionEvent event) {
		BRCA1.setGene(BRCA1.getGene()-0.1);//increase LFC by 1
	}

}
