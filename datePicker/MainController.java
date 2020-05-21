package application;

import java.time.LocalDate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class MainController {
	@FXML private Label label;
	@FXML private DatePicker dp;
	
	public void ShowDate(ActionEvent event) {
		LocalDate ld = dp.getValue();
		label.setText(ld.toString());
	}
}
