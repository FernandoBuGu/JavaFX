package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainController implements Initializable{

	@FXML private TableView<Gene> geneTable;
	@FXML private TableColumn<Gene, Integer> exons;
	@FXML private TableColumn<Gene, String> hgnc;
	@FXML private TableColumn<Gene, String> ensembl;

	public ObservableList<Gene> geneList = FXCollections.observableArrayList(
			
			new Gene(14, "BRCA1", "ENSG00000012048"),
			new Gene(6, "BRCA2", "ENSG00000139618"),
			new Gene(2, "TP53", "ENSG00000141510"),
			new Gene(7, "PTEN", "ENSG00000171862")
			
			);
			
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		exons.setCellValueFactory(new PropertyValueFactory<Gene, Integer>("exons"));
		hgnc.setCellValueFactory(new PropertyValueFactory<Gene, String>("hgnc"));
		ensembl.setCellValueFactory(new PropertyValueFactory<Gene, String>("ensembl"));

		geneTable.setItems(geneList);
	}

}
