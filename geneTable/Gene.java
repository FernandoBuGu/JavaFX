package application;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Gene {
	private final SimpleIntegerProperty exons;
	private final SimpleStringProperty hgnc;
	private final SimpleStringProperty ensembl;
	public Gene(Integer exons, String hgnc, String ensembl) {
		super();
		this.exons = new SimpleIntegerProperty(exons);
		this.hgnc = new SimpleStringProperty(hgnc);
		this.ensembl = new SimpleStringProperty(ensembl);
	}
	public Integer getExons() {
		return exons.get();
	}
	public String getHgnc() {
		return hgnc.get();
	}
	public String getEnsembl() {
		return ensembl.get();
	}
	
	


	

	
}
