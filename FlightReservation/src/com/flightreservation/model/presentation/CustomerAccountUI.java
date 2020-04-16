package com.flightreservation.model.presentation;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.flightreservation.model.business.CustomerAccountManager;
import com.flightreservation.model.domain.CustomerAccount;

import javax.swing.JButton;


@SuppressWarnings("serial")
public class CustomerAccountUI extends JFrame {

	private JFrame frmCustomeraccount;
	private JTextField nameField;
	private JTextField addressField;
	private JTextField userNameField;
	private JTextField passwordField;
	private JTextField cc16NumField;
	private JTextField ccExpireDateField;
	private JTextField emailField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerAccountUI window = new CustomerAccountUI();
					window.frmCustomeraccount.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CustomerAccountUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCustomeraccount = new JFrame();
		frmCustomeraccount.setTitle("CustomerAccount");
		frmCustomeraccount.setBounds(100, 100, 550, 350);
		frmCustomeraccount.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCustomeraccount.getContentPane().setLayout(null);

		JLabel nameLabel = new JLabel("Name");
		nameLabel.setBounds(10, 11, 46, 14);
		frmCustomeraccount.getContentPane().add(nameLabel);

		nameField = new JTextField();
		nameField.setBounds(72, 8, 124, 20);
		frmCustomeraccount.getContentPane().add(nameField);
		nameField.setColumns(10);

		JLabel addressLabel = new JLabel("Address");
		addressLabel.setHorizontalAlignment(SwingConstants.LEFT);
		addressLabel.setBounds(10, 47, 56, 14);
		frmCustomeraccount.getContentPane().add(addressLabel);

		addressField = new JTextField();
		addressField.setBounds(81, 44, 115, 20);
		frmCustomeraccount.getContentPane().add(addressField);
		addressField.setColumns(10);

		JLabel userNameLabel = new JLabel("User name");
		userNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		userNameLabel.setBounds(229, 11, 104, 14);
		frmCustomeraccount.getContentPane().add(userNameLabel);

		userNameField = new JTextField();
		userNameField.setBounds(343, 8, 124, 20);
		frmCustomeraccount.getContentPane().add(userNameField);
		userNameField.setColumns(10);

		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setHorizontalAlignment(SwingConstants.LEFT);
		passwordLabel.setBounds(229, 50, 86, 14);
		frmCustomeraccount.getContentPane().add(passwordLabel);

		passwordField = new JTextField();
		passwordField.setBounds(343, 44, 124, 20);
		frmCustomeraccount.getContentPane().add(passwordField);
		passwordField.setColumns(10);

		JLabel creditCardSixteenNumberLabel = new JLabel("Credit Card Number");
		creditCardSixteenNumberLabel.setHorizontalAlignment(SwingConstants.LEFT);
		creditCardSixteenNumberLabel.setBounds(10, 105, 151, 14);
		frmCustomeraccount.getContentPane().add(creditCardSixteenNumberLabel);

		cc16NumField = new JTextField();
		cc16NumField.setBounds(10, 127, 221, 20);
		frmCustomeraccount.getContentPane().add(cc16NumField);
		cc16NumField.setColumns(10);

		JLabel ccExpireDateLabel = new JLabel("Credit Card Expiration Date");
		ccExpireDateLabel.setHorizontalAlignment(SwingConstants.LEFT);
		ccExpireDateLabel.setBounds(20, 158, 242, 14);
		frmCustomeraccount.getContentPane().add(ccExpireDateLabel);

		ccExpireDateField = new JTextField();
		ccExpireDateField.setBounds(20, 183, 86, 20);
		frmCustomeraccount.getContentPane().add(ccExpireDateField);
		ccExpireDateField.setColumns(10);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				CustomerAccount ca = new CustomerAccount();
				ca.registerCustomer(nameField.getText(), addressField.getText(), emailField.getText(),
						cc16NumField.getText(), ccExpireDateField.getText(), userNameField.getText(),
						passwordField.getText());
				CustomerAccountManager cam = new CustomerAccountManager();
				cam.getCustomerAccount(nameField, addressField, emailField, cc16NumField, ccExpireDateField,
						userNameField, passwordField);

				if ((nameField.getText().equals("")) & (addressField.getText().equals(""))
						& (emailField.getText().equals("")) & (cc16NumField.getText().equals(""))
						& (ccExpireDateField.getText().equals("")) & (userNameField.getText().equals(""))
						& (passwordField.getText().equals(""))) {

					JOptionPane.showMessageDialog(frmCustomeraccount,
							"Customer not added due to possible incorrect information, please try again");
				} else {

					JOptionPane.showMessageDialog(frmCustomeraccount, "Customer Successfully Added");
				}
			}

		});
		
		btnSubmit.setBounds(334, 270, 89, 23);
		frmCustomeraccount.getContentPane().add(btnSubmit);

		JLabel emailLabel = new JLabel("Email");
		emailLabel.setBounds(10, 80, 46, 14);
		frmCustomeraccount.getContentPane().add(emailLabel);

		emailField = new JTextField();
		emailField.setBounds(72, 74, 124, 20);
		frmCustomeraccount.getContentPane().add(emailField);
		emailField.setColumns(10);
	}
}
