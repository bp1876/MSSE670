package com.flightreservation.model.presentation;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import com.flightreservation.model.business.BookItineraryManager;
import com.flightreservation.model.domain.BookItinerary;

import javax.swing.JTextField;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class BookItineraryUI extends JInternalFrame {

	private JFrame frmBookitinerary;
	private JTextField flightBookedField;

	/**
	 * Launch the application.
	 */
	public void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookItineraryUI window = new BookItineraryUI();
					window.frmBookitinerary.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BookItineraryUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBookitinerary = new JFrame();
		frmBookitinerary.setTitle("BookItinerary");
		frmBookitinerary.setBounds(100, 100, 450, 300);
		frmBookitinerary.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBookitinerary.getContentPane().setLayout(null);

		JLabel flightBookedLabel = new JLabel("Enter Yes to Book Flight");
		flightBookedLabel.setHorizontalAlignment(SwingConstants.LEFT);
		flightBookedLabel.setBounds(28, 62, 195, 14);
		frmBookitinerary.getContentPane().add(flightBookedLabel);

		flightBookedField = new JTextField();
		flightBookedField.setHorizontalAlignment(SwingConstants.LEFT);
		flightBookedField.setBounds(247, 59, 86, 20);
		frmBookitinerary.getContentPane().add(flightBookedField);
		flightBookedField.setColumns(10);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			// Create Inner class
			@Override
			public void actionPerformed(ActionEvent e) {

				BookItinerary book = new BookItinerary();
				book.bookFlight(flightBookedField.getText());
				BookItineraryManager bim = new BookItineraryManager();
				bim.getBookItinerary(book);

				// Show GUI message to user
				if (flightBookedField.getText().equals("")) {

					JOptionPane.showMessageDialog(frmBookitinerary, "Itineary not Booked, please try again");
				} else {

					JOptionPane.showMessageDialog(frmBookitinerary, "Itinerary successfully booked, enjoy your flight");
				}

			}

		});

		btnSubmit.setBounds(244, 178, 89, 23);
		frmBookitinerary.getContentPane().add(btnSubmit);

		pack();
		setVisible(true);
	}

}
