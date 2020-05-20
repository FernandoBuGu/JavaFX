package application;

import javafx.beans.property.*;


public class TopGenes {//java bean
	private DoubleProperty gene;

	public final double getGene() {
		if(gene != null)
		return gene.get();
		return 0;
	}
	
	public final void setGene(double gene) {
		this.geneProperty().set(gene);
	}

	public final DoubleProperty geneProperty() {
		if(gene == null) {
			gene = new SimpleDoubleProperty(0);
		}
		return gene;
	}

}
