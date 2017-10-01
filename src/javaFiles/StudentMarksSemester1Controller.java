package javaFiles;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class StudentMarksSemester1Controller implements Initializable {

	@FXML
	private  TextField tfS1Marks1;

	 static int  S1Marks1;

	@FXML
	private TextField tfS1Marks2;
	static int S1Marks2;

	

	@FXML
	private TextField tfS1Marks3;
	static int S1Marks3;


	@FXML
	private TextField tfS1Marks4;
	static int S1Marks4;


	@FXML
	private  TextField tfS1Marks5;
	static int S1Marks5;
	
	@FXML
	public void saveMarks(){
	S1Marks1 = Integer.parseInt(tfS1Marks1.getText());
	S1Marks2 = Integer.parseInt(tfS1Marks2.getText());
	S1Marks3 = Integer.parseInt(tfS1Marks3.getText());
	S1Marks4 = Integer.parseInt(tfS1Marks4.getText());
	S1Marks5 = Integer.parseInt(tfS1Marks5.getText());
	}

	// go to next page
	@FXML
	public void goNext(ActionEvent event) throws IOException {

		if(!tfS1Marks1.getText().isEmpty()){
		saveMarks();
		
		StudentClass.addMarksToArray();
		
		StudentClass.addStudent();
		
		//for testing purposes
			StudentClass.seeStudents();
			
			//for testing purposes
				StudentClass.seeMarks();
				
			

		Parent root = FXMLLoader.load(getClass().getResource("/fxmlFiles/StudentMarksSemester1Optional.fxml"));
		Scene scene = new Scene(root);

		Stage NewStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		NewStage.setScene(scene);
		NewStage.show();
		}
		else{
			Alert alrt= new Alert(AlertType.ERROR);
			alrt.setContentText("Please enter all marks to proceed!");
			alrt.showAndWait();
		}
	}

	// to go to preveious page
	@FXML
	public void goBack(ActionEvent event) throws IOException {

		Parent root = FXMLLoader.load(getClass().getResource("/fxmlFiles/PreliminaryModuleMarks.fxml"));
		Scene scene = new Scene(root);

		Stage NewStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
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

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}
}
