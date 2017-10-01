package javaFiles;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ReportScreen1Controller implements Initializable {

	@FXML
	private TextField tfStudentName;
	static String studName;
	

	@FXML
	private TextField tfStudentId;
	static int studId;
	
	@FXML
	private TextField tfStudentGPA;
	static String StudGPA;
	
	@FXML
	private TextField tfStudentCredits;
	static String StudCredtis;
	
	@FXML
	private TextField tfStudentDegreeTitle;
	static String StudDegreeTitle;
	


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		if (!StudentClass.studentsArray.isEmpty()) {
			tfStudentName.setText("" + StudentClass.studentsArray.get(0).getStudentName());
			
			tfStudentId.setText("" + StudentClass.studentsArray.get(0).getStudentId());
			
			tfStudentGPA.setText(""+StudentClass.studentsArray.get(0).getGPA1());
			
			tfStudentDegreeTitle.setText(""+StudentClass.studentsArray.get(0).getDegreeTitle());
			
			tfStudentCredits.setText(""+StudentClass.studentsArray.get(0).getCredits());
			
			
		} else {
			System.out.println("No student Records Found !");
		}

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
	@FXML
	private void goToStudentDetails(ActionEvent event) throws IOException {

		Parent root = FXMLLoader.load(getClass().getResource("/fxmlFiles/StudentDetails.fxml"));
		Scene scene = new Scene(root);
		Stage NewStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		NewStage.setScene(scene);
		NewStage.show();

	}

}
