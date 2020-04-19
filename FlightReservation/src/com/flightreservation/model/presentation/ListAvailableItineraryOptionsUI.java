package com.flightreservation.model.presentation;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import com.flightreservation.model.business.ListAvailableItineraryOptionsManager;
import com.flightreservation.model.domain.ListAvailableItineraryOptions;

import javax.swing.JTextField;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class ListAvailableItineraryOptionsUI extends JInternalFrame {

	private JFrame frmListavailableitineraryoptions;
	private JTextField costField;
	private JTextField departureTimeOffsettField;
	private JTextField legsField;

	/**
	 * Launch the application.
	 */
	public void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListAvailableItineraryOptionsUI window = new ListAvailableItineraryOptionsUI();
					window.frmListavailableitineraryoptions.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ListAvailableItineraryOptionsUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmListavailableitineraryoptions = new JFrame();
		frmListavailableitineraryoptions.setTitle("ListAvailableItineraryOptions");
		frmListavailableitineraryoptions.setBounds(100, 100, 450, 300);
		frmListavailableitineraryoptions.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmListavailableitineraryoptions.getContentPane().setLayout(null);

		JLabel costLabel = new JLabel("Cost");
		costLabel.setHorizontalAlignment(SwingConstants.LEFT);
		costLabel.setBounds(30, 33, 108, 14);
		frmListavailableitineraryoptions.getContentPane().add(costLabel);

		costField = new JTextField();
		costField.setHorizontalAlignment(SwingConstants.LEFT);
		costField.setBounds(212, 30, 86, 20);
		frmListavailableitineraryoptions.getContentPane().add(costField);
		costField.setColumns(10);

		JLabel departureTimeOffsetLabel = new JLabel("Departure Time Offset");
		departureTimeOffsetLabel.setHorizontalAlignment(SwingConstants.LEFT);
		departureTimeOffsetLabel.setBounds(30, 84, 179, 14);
		frmListavailableitineraryoptions.getContentPane().add(departureTimeOffsetLabel);

		departureTimeOffsettField = new JTextField();
		departureTimeOffsettField.setHorizontalAlignment(SwingConstants.LEFT);
		departureTimeOffsettField.setBounds(212, 81, 86, 20);
		frmListavailableitineraryoptions.getContentPane().add(departureTimeOffsettField);
		departureTimeOffsettField.setColumns(10);

		JLabel legsLabel = new JLabel("Legs");
		legsLabel.setHorizontalAlignment(SwingConstants.LEFT);
		legsLabel.setBounds(30, 127, 165, 14);
		frmListavailableitineraryoptions.getContentPane().add(legsLabel);

		legsField = new JTextField();
		legsField.setHorizontalAlignment(SwingConstants.LEFT);
		legsField.setBounds(212, 124, 86, 20);
		frmListavailableitineraryoptions.getContentPane().add(legsField);
		legsField.setColumns(10);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			// Create Inner class
			@Override
			public void actionPerformed(ActionEvent arg0) {

				ListAvailableItineraryOptions laio = new ListAvailableItineraryOptions();
				laio.listOptions(costField.getText(), departureTimeOffsettField.getText(), legsField.getText());
				ListAvailableItineraryOptionsManager laiom = new ListAvailableItineraryOptionsManager();
				laiom.getListOptions(laio);

				// Show GUI message to user, just using one field for validation
				if (costField.getText().equals("")) {

					JOptionPane.showMessageDialog(frmListavailableitineraryoptions,
							"List of Available Itineraries not returned due to possible incorrect input, please try again");
				} else {

					JOptionPane.showMessageDialog(frmListavailableitineraryoptions,
							"List of Available Itineraries Results Successfully returned");
				}

			}

		});

		btnSubmit.setBounds(209, 197, 89, 23);
		frmListavailableitineraryoptions.getContentPane().add(btnSubmit);

		pack();
		setVisible(true);
	}
}
