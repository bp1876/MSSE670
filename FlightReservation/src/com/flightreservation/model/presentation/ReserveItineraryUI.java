package com.flightreservation.model.presentation;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import com.flightreservation.model.business.ReserveItineraryManager;
import com.flightreservation.model.domain.ReserveItinerary;

import javax.swing.JTextField;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class ReserveItineraryUI extends JFrame{

	private JFrame frmReserveitinerary;
	private JTextField selectListField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReserveItineraryUI window = new ReserveItineraryUI();
					window.frmReserveitinerary.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ReserveItineraryUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmReserveitinerary = new JFrame();
		frmReserveitinerary.setTitle("ReserveItinerary");
		frmReserveitinerary.setBounds(100, 100, 450, 300);
		frmReserveitinerary.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmReserveitinerary.getContentPane().setLayout(null);
		
		JLabel selectListLabel = new JLabel("Enter Yes to select the list");
		selectListLabel.setHorizontalAlignment(SwingConstants.LEFT);
		selectListLabel.setBounds(10, 56, 208, 14);
		frmReserveitinerary.getContentPane().add(selectListLabel);
		
		selectListField = new JTextField();
		selectListField.setHorizontalAlignment(SwingConstants.LEFT);
		selectListField.setBounds(228, 53, 86, 20);
		frmReserveitinerary.getContentPane().add(selectListField);
		selectListField.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			//Create Inner class
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ReserveItinerary ri = new ReserveItinerary();
				ri.reserveFlight(selectListField.getText());
				ReserveItineraryManager rim = new ReserveItineraryManager();
				rim.getReserveFlight(ri);
				
				//Show GUI message to user for validation
				if(selectListField.getText().equals("")) {
					
					JOptionPane.showMessageDialog(frmReserveitinerary,
							"Itineary not Rerserved, please try again");
				} else {

					JOptionPane.showMessageDialog(frmReserveitinerary, "Itinerary successfully reservered, proceed to book the itinerary");
				}
			
			}
			
		});
		
		
		btnSubmit.setBounds(225, 187, 89, 23);
		frmReserveitinerary.getContentPane().add(btnSubmit);
	}

}
