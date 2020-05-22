package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.media.Media;
import javafx.scene.media.MediaView;
import javafx.scene.media.MediaPlayer;


public class MainController implements Initializable{

	@FXML private MediaView mv;
	private MediaPlayer mp;
	private Media  m;
	
	@FXML Slider volumeSlider;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		String path = new File("src/media/DNAreplication.mp4").getAbsolutePath();
		m= new Media(new File(path).toURI().toString());
		mp = new MediaPlayer(m);
		mv.setMediaPlayer(mp);
		mp.setAutoPlay(true);
		
		//resizing
		DoubleProperty width = mv.fitWidthProperty();
		DoubleProperty height = mv.fitHeightProperty();
		width.bind(Bindings.selectDouble(mv.sceneProperty(), "width"));
		height.bind(Bindings.selectDouble(mv.sceneProperty(), "height"));
		volumeSlider.setValue(mp.getVolume() * 100);
		volumeSlider.valueProperty().addListener(new InvalidationListener() {

			@Override
			public void invalidated(Observable arg0) {
				// TODO Auto-generated method stub
				mp.setVolume(volumeSlider.getValue()/100);
			}
			
		});
	}

	public void play(ActionEvent event) {
		mp.play();
		mp.setRate(1);
	}
	public void pause(ActionEvent event) {
		mp.pause();
	}
	public void fast(ActionEvent event) {
		mp.setRate(2);
	}
	public void slow(ActionEvent event) {
		mp.setRate(0.5);
	}
	public void reload(ActionEvent event) {
		mp.seek(mp.getStartTime());
		mp.play();
	}
	public void start(ActionEvent event) {
		mp.seek(mp.getStartTime());
		mp.stop();
	}
	public void end(ActionEvent event) {
		mp.seek(mp.getTotalDuration());
		mp.stop();
	}
}
