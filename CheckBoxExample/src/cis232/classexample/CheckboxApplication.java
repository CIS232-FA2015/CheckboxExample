package cis232.classexample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CheckboxApplication extends Application {

	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent p = FXMLLoader.load(getClass().getResource("CheckboxExample.fxml"));
		Scene s = new Scene(p);
		stage.setScene(s);
		stage.setTitle("Checkbox Example");
		stage.show();
	}
}
