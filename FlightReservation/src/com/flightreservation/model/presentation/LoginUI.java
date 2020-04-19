package com.flightreservation.model.presentation;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.flightreservation.model.business.LoginManager;
import com.flightreservation.model.domain.Login;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class LoginUI extends JInternalFrame {

	private JFrame frmLogin;
	private JTextField userNameField;
	private JTextField passwordField;

	/**
	 * Launch the application.
	 */
	public void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUI window = new LoginUI();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 450, 300);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);

		JLabel userNameLabel = new JLabel("User Name:");
		userNameLabel.setBounds(56, 68, 76, 22);
		frmLogin.getContentPane().add(userNameLabel);

		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(56, 120, 64, 14);
		frmLogin.getContentPane().add(passwordLabel);

		userNameField = new JTextField();
		userNameField.setBounds(132, 69, 137, 20);
		frmLogin.getContentPane().add(userNameField);
		userNameField.setColumns(10);

		passwordField = new JTextField();
		passwordField.setBounds(132, 117, 137, 20);
		frmLogin.getContentPane().add(passwordField);
		passwordField.setColumns(10);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			// Create Inner class
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Login login = new Login();
				login.authenticateUser(userNameField.getText(), passwordField.getText());
				LoginManager loginmgr = new LoginManager();
				loginmgr.getLogin(userNameField, passwordField);

				// show gui messages to user
				if (userNameField.getText().equals("brenda") && passwordField.getText().equals("pass")) {

					JOptionPane.showMessageDialog(frmLogin, "Successfully Logged in");
				} else {

					JOptionPane.showMessageDialog(frmLogin, "Incorrect Username or Password entered, please try again");
				}

			}

		});

		btnLogin.setBounds(180, 177, 89, 23);
		frmLogin.getContentPane().add(btnLogin);

		pack();
		setVisible(true);

	}

}
