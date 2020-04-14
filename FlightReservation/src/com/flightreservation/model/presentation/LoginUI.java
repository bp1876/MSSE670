package com.flightreservation.model.presentation;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.flightreservation.model.business.LoginManager;
import com.flightreservation.model.business.exception.ServiceLoadingException;
import com.flightreservation.model.domain.FlightReservationComposite;
import com.flightreservation.model.domain.Login;
import com.flightreservation.model.service.exception.InvalidLoginException;

import javax.swing.JButton;

public class LoginUI extends JFrame {

	private JFrame frame;
	private JTextField userNameField;
	private JTextField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUI window = new LoginUI();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel userNameLabel = new JLabel("User Name:");
		userNameLabel.setBounds(56, 68, 76, 22);
		frame.getContentPane().add(userNameLabel);

		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(56, 120, 64, 14);
		frame.getContentPane().add(passwordLabel);

		userNameField = new JTextField();
		userNameField.setBounds(132, 69, 137, 20);
		frame.getContentPane().add(userNameField);
		userNameField.setColumns(10);

		passwordField = new JTextField();
		passwordField.setBounds(132, 117, 137, 20);
		frame.getContentPane().add(passwordField);
		passwordField.setColumns(10);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			//Create Inner class
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Login login = new Login();
				login.authenticateUser(userNameField.getText(), passwordField.getText());
				LoginManager loginmgr = new LoginManager();
				loginmgr.getLogin(userNameField, passwordField);

				//show gui messages to user
				if (userNameField.getText().equals("brenda") && passwordField.getText().equals("pass")) {

					JOptionPane.showMessageDialog(frame, "Successfully Logged in");
				} else {

					JOptionPane.showMessageDialog(frame, "Incorrect Username or Password entered, please try again");
				}

			}

		});

		btnLogin.setBounds(100, 185, 89, 23);
		frame.getContentPane().add(btnLogin);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(243, 185, 89, 23);
		frame.getContentPane().add(btnCancel);

	}
}
