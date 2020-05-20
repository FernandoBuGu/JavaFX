package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class MainController implements Initializable{

	@FXML
	TreeView<String> mTreeView;
	
	Image icon = new Image(getClass().getResourceAsStream("/img/smallFolderIcon.png"));
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		TreeItem<String> root = new TreeItem("Root");
		root.setExpanded(true);
		
		TreeItem<String> nodeA = new TreeItem("nodeA");
		TreeItem<String> nodeB = new TreeItem("nodeB");
		TreeItem<String> nodeC = new TreeItem("nodeC");
		root.getChildren().addAll(nodeA,nodeB,nodeC);
		
		TreeItem<String> nodeA1 = new TreeItem("nodeA1");
		TreeItem<String> nodeB1 = new TreeItem("nodeB1",new ImageView(icon));
		TreeItem<String> nodeC1 = new TreeItem("nodeC1");
	
		nodeA.getChildren().addAll(nodeA1,nodeB1,nodeC1);
		nodeA.setExpanded(true);

		
		mTreeView.setRoot(root);

		
	}
	
	public void mouseClick(MouseEvent mouseEvent) {
		if(mouseEvent.getClickCount()==2) {
			TreeItem<String> item = mTreeView.getSelectionModel().getSelectedItem();
			System.out.println(item.getValue());
		}
	}

}
