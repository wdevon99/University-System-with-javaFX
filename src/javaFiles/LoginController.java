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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
		
	}
	static String username;
	
	@FXML
	private Label status;
	
	@FXML
	private TextField txtUsername;
	
	@FXML
	private PasswordField txtPassword;
	
	@FXML
	public void login(ActionEvent event) throws IOException{
		username=txtUsername.getText();
		if(username.equals("d") && txtPassword.getText().equals("d")){
			
		status.setText("Logging In Susessful");
		Parent root = FXMLLoader.load(getClass().getResource("/fxmlFiles/WelcomeScreen.fxml"));
		Scene scene= new Scene(root);
		scene.getStylesheets().add("/cssFiles/MainStyle.css");
		
		Stage NewStage=(Stage)((Node)event.getSource()).getScene().getWindow();
		NewStage.setScene(scene);
		NewStage.show();
		}
		else{
			Alert mssg=new Alert(AlertType.ERROR);
			mssg.setContentText("LogIn Failed, Try Again!");
			mssg.showAndWait();
			status.setText("LogIn Failed, Try Again!");
		}
	}

}