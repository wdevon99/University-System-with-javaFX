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

public class PathSelectionController implements Initializable {

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
		
	}
	
	//to go to preveious page
	@FXML public void goBack(ActionEvent event) throws IOException{
		
		
		Parent root = FXMLLoader.load(getClass().getResource("/fxmlFiles/StudentMarksSemester2Optional.fxml"));
		Scene scene= new Scene(root);
		
		Stage NewStage=(Stage)((Node)event.getSource()).getScene().getWindow();
		NewStage.setScene(scene);
		NewStage.show();
	}
	
	@FXML public void goToPathOption1(ActionEvent event) throws IOException{
		
		
		Parent root = FXMLLoader.load(getClass().getResource("/fxmlFiles/PathOption1.fxml"));
		Scene scene= new Scene(root);
		
		Stage NewStage=(Stage)((Node)event.getSource()).getScene().getWindow();
		NewStage.setScene(scene);
		NewStage.show();
	}
	@FXML public void goToPathOption2(ActionEvent event) throws IOException{
		
		
		Parent root = FXMLLoader.load(getClass().getResource("/fxmlFiles/PathOption2.fxml"));
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
