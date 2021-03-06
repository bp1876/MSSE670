package com.flightreservation.model.presentation;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

@SuppressWarnings("serial")
public class MainUI extends JFrame {

	private JFrame frmMainui;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUI window = new MainUI();
					window.frmMainui.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainUI() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frmMainui = new JFrame();
		frmMainui.setTitle("MainUI");
		frmMainui.setBounds(100, 100, 450, 300);
		frmMainui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMainui.getContentPane().setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("Open Menu to choose Use Cases");
		menuBar.setBounds(10, 0, 97, 21);
		frmMainui.getContentPane().add(menuBar);

		JMenu mnNewMenu = new JMenu("Menu");
		menuBar.add(mnNewMenu);

		//The following JMenuItems have been written to add the 6 use cases to the Menu and then to call their methods
		//to launch each internal frame when they are selected from the menu.  Also added an exit to the menu
		
		JMenuItem loginui = new JMenuItem("Login");
		loginui.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				LoginUI login = new LoginUI();
				//Call the method to launch the GUI
				login.main(null);
				login.setVisible(true);

			}

		});

		mnNewMenu.add(loginui);
		
		JMenuItem customerAccount = new JMenuItem("CustomerAccount");
		customerAccount.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				CustomerAccountUI ca = new CustomerAccountUI();
				//Call the method to launch the GUI
				ca.main(null);
				ca.setVisible(true);

			}

		});

		mnNewMenu.add(customerAccount);
		
		JMenuItem searchFlightInfo = new JMenuItem("SearchFlightInformation");
		searchFlightInfo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				SearchFlightInfoUI sfi = new SearchFlightInfoUI();
				//Call the method to launch the GUI
				sfi.main(null);
				sfi.setVisible(true);

			}

		});

		mnNewMenu.add(searchFlightInfo);
		
		JMenuItem laio = new JMenuItem("ListAvailableItineraryOptions");
		laio.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				ListAvailableItineraryOptionsUI listOptions = new ListAvailableItineraryOptionsUI();
				//Call the method to launch the GUI
				listOptions.main(null);
				listOptions.setVisible(true);

			}

		});

		mnNewMenu.add(laio);
		
		JMenuItem reserveItinerary = new JMenuItem("ReserveItinerary");
		reserveItinerary.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				ReserveItineraryUI ri = new ReserveItineraryUI();
				//Call the method to launch the GUI
				ri.main(null);
				ri.setVisible(true);

			}

		});

		mnNewMenu.add(reserveItinerary);
		
		JMenuItem bookui = new JMenuItem("BookItinerary");
		bookui.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				BookItineraryUI book = new BookItineraryUI();
				//Call the method to launch the GUI
				book.main(null);
				book.setVisible(true);

			}

		});

		mnNewMenu.add(bookui);
		
		JMenuItem exit = new JMenuItem("Exit");
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);

			}

		});

		mnNewMenu.add(exit);
		

	}//end of Constructor block
}
