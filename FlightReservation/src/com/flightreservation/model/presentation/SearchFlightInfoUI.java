package com.flightreservation.model.presentation;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import com.flightreservation.model.business.SearchFlightInfoManager;
import com.flightreservation.model.domain.SearchFlightInformation;

import javax.swing.JTextField;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class SearchFlightInfoUI extends JFrame{

	private JFrame frmSearchflightinformation;
	private JTextField departureDateField;
	private JTextField departureTimeField;
	private JTextField departureLocationField;
	private JTextField arrivalDateField;
	private JTextField arrivalTimeField;
	private JTextField arrivalLocationField;
	private JTextField numOfPassengersField;
	private JTextField oneWayField;
	private JTextField roundtripField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchFlightInfoUI window = new SearchFlightInfoUI();
					window.frmSearchflightinformation.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SearchFlightInfoUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSearchflightinformation = new JFrame();
		frmSearchflightinformation.setTitle("SearchFlightInformation");
		frmSearchflightinformation.setBounds(100, 100, 350, 500);
		frmSearchflightinformation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSearchflightinformation.getContentPane().setLayout(null);
		
		JLabel departureDateLabel = new JLabel("Departure Date");
		departureDateLabel.setBounds(20, 11, 151, 14);
		departureDateLabel.setHorizontalAlignment(SwingConstants.LEFT);
		frmSearchflightinformation.getContentPane().add(departureDateLabel);
		
		departureDateField = new JTextField();
		departureDateField.setBounds(228, 8, 86, 20);
		departureDateField.setHorizontalAlignment(SwingConstants.LEFT);
		frmSearchflightinformation.getContentPane().add(departureDateField);
		departureDateField.setColumns(10);
		
		JLabel departureTimeLabel = new JLabel("Departure Time");
		departureTimeLabel.setBounds(20, 42, 151, 14);
		departureTimeLabel.setHorizontalAlignment(SwingConstants.LEFT);
		frmSearchflightinformation.getContentPane().add(departureTimeLabel);
		
		departureTimeField = new JTextField();
		departureTimeField.setBounds(228, 39, 86, 20);
		departureTimeField.setHorizontalAlignment(SwingConstants.LEFT);
		frmSearchflightinformation.getContentPane().add(departureTimeField);
		departureTimeField.setColumns(10);
		
		JLabel departureLocationLabel = new JLabel("Departure Location");
		departureLocationLabel.setBounds(20, 73, 151, 14);
		departureLocationLabel.setHorizontalAlignment(SwingConstants.LEFT);
		frmSearchflightinformation.getContentPane().add(departureLocationLabel);
		
		departureLocationField = new JTextField();
		departureLocationField.setBounds(228, 70, 86, 20);
		departureLocationField.setHorizontalAlignment(SwingConstants.LEFT);
		frmSearchflightinformation.getContentPane().add(departureLocationField);
		departureLocationField.setColumns(10);
		
		JLabel arrivalDateLabel = new JLabel("Arrival Date");
		arrivalDateLabel.setBounds(20, 111, 151, 14);
		arrivalDateLabel.setHorizontalAlignment(SwingConstants.LEFT);
		frmSearchflightinformation.getContentPane().add(arrivalDateLabel);
		
		arrivalDateField = new JTextField();
		arrivalDateField.setBounds(228, 108, 86, 20);
		arrivalDateField.setHorizontalAlignment(SwingConstants.LEFT);
		frmSearchflightinformation.getContentPane().add(arrivalDateField);
		arrivalDateField.setColumns(10);
		
		JLabel arrivalTimeLabel = new JLabel("Arrival Time");
		arrivalTimeLabel.setBounds(20, 145, 151, 14);
		arrivalTimeLabel.setHorizontalAlignment(SwingConstants.LEFT);
		frmSearchflightinformation.getContentPane().add(arrivalTimeLabel);
		
		arrivalTimeField = new JTextField();
		arrivalTimeField.setBounds(228, 139, 86, 20);
		arrivalTimeField.setHorizontalAlignment(SwingConstants.LEFT);
		frmSearchflightinformation.getContentPane().add(arrivalTimeField);
		arrivalTimeField.setColumns(10);
		
		JLabel arrivalLocationLabel = new JLabel("Arrival Location");
		arrivalLocationLabel.setBounds(20, 179, 151, 14);
		arrivalLocationLabel.setHorizontalAlignment(SwingConstants.LEFT);
		frmSearchflightinformation.getContentPane().add(arrivalLocationLabel);
		
		arrivalLocationField = new JTextField();
		arrivalLocationField.setBounds(228, 176, 86, 20);
		arrivalLocationField.setHorizontalAlignment(SwingConstants.LEFT);
		frmSearchflightinformation.getContentPane().add(arrivalLocationField);
		arrivalLocationField.setColumns(10);
		
		JLabel numOfPassengersLabel = new JLabel("Number of Passengers");
		numOfPassengersLabel.setBounds(20, 215, 171, 14);
		numOfPassengersLabel.setHorizontalAlignment(SwingConstants.LEFT);
		frmSearchflightinformation.getContentPane().add(numOfPassengersLabel);
		
		numOfPassengersField = new JTextField();
		numOfPassengersField.setBounds(228, 212, 86, 20);
		numOfPassengersField.setHorizontalAlignment(SwingConstants.LEFT);
		frmSearchflightinformation.getContentPane().add(numOfPassengersField);
		numOfPassengersField.setColumns(10);
		
		JLabel oneWayLabel = new JLabel("One Way");
		oneWayLabel.setBounds(20, 240, 151, 14);
		frmSearchflightinformation.getContentPane().add(oneWayLabel);
		
		oneWayField = new JTextField();
		oneWayField.setHorizontalAlignment(SwingConstants.LEFT);
		oneWayField.setBounds(228, 237, 86, 20);
		frmSearchflightinformation.getContentPane().add(oneWayField);
		oneWayField.setColumns(10);
		
		JLabel roundtripLabel = new JLabel("Roundtrip");
		roundtripLabel.setHorizontalAlignment(SwingConstants.LEFT);
		roundtripLabel.setBounds(20, 264, 151, 14);
		frmSearchflightinformation.getContentPane().add(roundtripLabel);
		
		roundtripField = new JTextField();
		roundtripField.setHorizontalAlignment(SwingConstants.LEFT);
		roundtripField.setBounds(228, 261, 86, 20);
		frmSearchflightinformation.getContentPane().add(roundtripField);
		roundtripField.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			//Create Inner class
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				SearchFlightInformation sfi = new SearchFlightInformation();
				sfi.searchFlights(departureDateField.getText(), departureTimeField.getText(), departureLocationField.getText(), 
						arrivalDateField.getText(), arrivalTimeField.getText(), arrivalLocationField.getText(), 
						numOfPassengersField.getText(), oneWayField.getText(), 
						roundtripField.getText());
				SearchFlightInfoManager sfim = new SearchFlightInfoManager();
				sfim.getSearchFlightInfo(sfi);
				
				//Show GUI message to user
				//Only checking if Departure Date Field is missing input
				if(departureDateField.getText().equals("")) {
					JOptionPane.showMessageDialog(frmSearchflightinformation,
							"Search Flight Inforamtion not returned due to possible incorrect input, please try again");
				} else {

					JOptionPane.showMessageDialog(frmSearchflightinformation, "Flight Search Results Successfully Inputted");
				}
			

				
				
			}
			
		});
		
		btnSubmit.setBounds(228, 326, 89, 23);
		frmSearchflightinformation.getContentPane().add(btnSubmit);
	}
}
