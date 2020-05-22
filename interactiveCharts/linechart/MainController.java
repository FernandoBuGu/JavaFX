package application;

import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;


public class MainController {
	@FXML LineChart<String,Number> linechart;
	@FXML Label lbl;
	
	public void btn(ActionEvent event) {
		linechart.getData().clear();
		XYChart.Series<String,Number> series = new XYChart.Series<String,Number>();
		series.getData().add(new XYChart.Data<String, Number>("1",2.6));
		series.getData().add(new XYChart.Data<String, Number>("2",3.4));
		series.getData().add(new XYChart.Data<String, Number>("3",3.2));
		series.getData().add(new XYChart.Data<String, Number>("4",4.1));
		series.setName("52 patients with treatment A");		
		
		XYChart.Series<String,Number> series1 = new XYChart.Series<String,Number>();
		series1.getData().add(new XYChart.Data<String, Number>("1",2.8));
		series1.getData().add(new XYChart.Data<String, Number>("2",3.3));
		series1.getData().add(new XYChart.Data<String, Number>("3",3.6));
		series1.getData().add(new XYChart.Data<String, Number>("4",3.7));
		series1.setName("36 patients with treatment B");
		
		linechart.getData().addAll(series,series1);
		
		for(final XYChart.Data<String, Number> data: series.getData()) {
			data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
				
				@Override
				public void handle(MouseEvent arg0) {
					// TODO Auto-generated method stub
					lbl.setText("X:" + data.getXValue() + "\n Y:" + String.valueOf(data.getYValue()));
					Tooltip.install(data.getNode(), new Tooltip("X:" + data.getXValue() + "\n Y:" + String.valueOf(data.getYValue())));
				}
		});
	}
	}
}
