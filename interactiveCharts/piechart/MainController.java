package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.collections.*;

public class MainController {

	@FXML PieChart piechart;
	
	@FXML Label status;
	
	public void btn(ActionEvent event) {
		ObservableList<Data> list = FXCollections.observableArrayList(
				new PieChart.Data("BRCA1",50),
				new PieChart.Data("BRCA2",15),
				new PieChart.Data("TP53",23),
				new PieChart.Data("PTEN",12)
				);
		piechart.setData(list);
		
		for(final PieChart.Data data: piechart.getData()) {
			data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					// TODO Auto-generated method stub
					status.setText(String.valueOf(data.getPieValue()) + "%");
				}
		});
	}
	
}
}
