package application;

import java.io.File;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class MainController {
	@FXML
	private Button selectOneFile;
	@FXML
	private Button selectMultipleFiles;
	@FXML
	private ListView mListView;
	
	public void Button1action(ActionEvent event) {
		FileChooser fc = new FileChooser();
		fc.setInitialDirectory(new File ("/home/febueno/Downloads"));
		fc.getExtensionFilters().addAll(new ExtensionFilter("PDF Files","*.pdf"));
		File selectedFiles = fc.showOpenDialog(null);
		
		if(selectedFiles != null) {
			mListView.getItems().add(selectedFiles.getAbsolutePath());
		} else {
			System.out.print("not valid file");
		}
	}
	
	public void Button2action(ActionEvent event) {
		FileChooser fc = new FileChooser();
		fc.setInitialDirectory(new File ("/home/febueno/Downloads"));
		fc.getExtensionFilters().addAll(new ExtensionFilter("PDF Files","*.pdf"));
		List<File> selectedFiles = fc.showOpenMultipleDialog(null);
		
		if(selectedFiles != null) {
			for(int i = 0; i<selectedFiles.size();i++) {
				mListView.getItems().add(selectedFiles.get(i).getAbsolutePath());
			}
		} else {
			System.out.print("not valid file");
		}
	}

}
