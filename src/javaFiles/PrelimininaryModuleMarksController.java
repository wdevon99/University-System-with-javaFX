package javaFiles;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PrelimininaryModuleMarksController implements Initializable {

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}
	
	@FXML public void goNext(ActionEvent event) throws IOException{
		
		
		Parent root = FXMLLoader.load(getClass().getResource("/fxmlFiles/StudentMarksSemester1.fxml"));
		Scene scene= new Scene(root);
		
		Stage NewStage=(Stage)((Node)event.getSource()).getScene().getWindow();
		NewStage.setScene(scene);
		NewStage.show();
	}

	@FXML public void goBack(ActionEvent event) throws IOException{
		
		
		Parent root = FXMLLoader.load(getClass().getResource("/fxmlFiles/StudentDetails.fxml"));
		Scene scene= new Scene(root);
		
		Stage NewStage=(Stage)((Node)event.getSource()).getScene().getWindow();
		NewStage.setScene(scene);
		NewStage.show();
	}
	
	@FXML
	private void goHome(ActionEvent event) throws IOException {

		Parent root = FXMLLoader.load(getClass().getResource("/fxmlFiles/WelcomeScreen.fxml"));
		Scene scene = new Scene(root);
		Stage NewStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		NewStage.setScene(scene);
		NewStage.show();

	}
	
	@FXML
	private void logOut(ActionEvent event) throws IOException {

		Parent root = FXMLLoader.load(getClass().getResource("/fxmlFiles/Login.fxml"));
		Scene scene = new Scene(root);
		Stage NewStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		NewStage.setScene(scene);
		NewStage.show();

	}
	
	
	

}
