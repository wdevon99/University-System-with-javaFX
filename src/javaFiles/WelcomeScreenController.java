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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class WelcomeScreenController implements Initializable {

	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		

	}

	@FXML
	private void sayHi(ActionEvent event) throws IOException {

	}

	@FXML
	private void goToEnterStudentDetailsPage(ActionEvent event) throws IOException {

		Parent root = FXMLLoader.load(getClass().getResource("/fxmlFiles/StudentDetails.fxml"));
		Scene scene = new Scene(root);
		Stage NewStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		NewStage.setScene(scene);
		NewStage.show();

	}

	@FXML
	private void goToReport1Page(ActionEvent event) throws IOException {
		if(!StudentClass.studentsArray.isEmpty()){

		Parent root = FXMLLoader.load(getClass().getResource("/fxmlFiles/FinalStatisticsReport.fxml"));
		Scene scene = new Scene(root);
		Stage NewStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		NewStage.setScene(scene);
		NewStage.show();
		
		}
		else{
			Alert alert=new Alert(AlertType.INFORMATION);
			alert.setContentText("No Student Records found! Please Enter details first to view report");
			alert.showAndWait();
		}
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
