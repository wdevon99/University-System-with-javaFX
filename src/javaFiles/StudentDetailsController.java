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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class StudentDetailsController implements Initializable {
	@FXML private TextField tfStudentName;
	static String studName;
	
	@FXML private TextField tfStudentId;
	static int studId;

	@FXML private Label lblNameError;
	@FXML private Label lblIdError;
	@FXML private Label lblAttendaceError;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	@FXML
	public void goNext(ActionEvent event) throws IOException{
		
		if(tfStudentId.getText().isEmpty()){
			
			lblNameError.setText("This field is required");
			lblIdError.setText("This field is required");
			lblAttendaceError.setText("This field is required");
		
		
		}
		
		else{
			studName=tfStudentName.getText();
			
			studId=Integer.parseInt(tfStudentId.getText());
			
			StudentClass.addStudent();
			
		//for testing purposes
			StudentClass.seeStudents();
			
			
			
			Parent root = FXMLLoader.load(getClass().getResource("/fxmlFiles/PreliminaryModuleMarks.fxml"));
			Scene scene= new Scene(root);
			
			Stage NewStage=(Stage)((Node)event.getSource()).getScene().getWindow();
			NewStage.setScene(scene);
			NewStage.show();
		}
	}
	

	
	@FXML public void goBack(ActionEvent event) throws IOException{
		
		
		Parent root = FXMLLoader.load(getClass().getResource("/fxmlFiles/WelcomeScreen.fxml"));
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
