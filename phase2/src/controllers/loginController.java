package controllers;

import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;

public class loginController {

	@FXML
	private TextField txtUserName;

	@FXML
	private PasswordField txtUserPassword;
	
	@FXML
	private Button submit;
	
	@FXML
	private Label lblError;
	
public loginController() { 	}

	public void login() {
						
		lblError.setText("");
		String username = this.txtUserName.getText();
		String password = this.txtUserPassword.getText();

		// Validations
		if (username == null || username.trim().equals("")) {
			lblError.setText("Username Cannot be empty or spaces");
			return;
		}
		if (password == null || password.trim().equals("")) {
			lblError.setText("Password Cannot be empty or spaces");
			return;
		}
		if (username == null || username.trim().equals("") && 
(password == null || password.trim().equals(""))) {
			lblError.setText("User name / Password Cannot be empty or spaces");
			return;
		}
		if (username.equals("jpapa") && password.equals("1234")) {
			lblError.setText("Login succeeded!");
			return;
		} 
		else { lblError.setText("Login incorrect!"); }
	

	submit.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			login();
			
		}
				
		
		
		
		

	}	 


	
}




	
	
	

