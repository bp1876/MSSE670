/**
 * 
 */
package com.flightreservation.model.business;

import javax.swing.JTextField;

import com.flightreservation.model.business.exception.ServiceLoadingException;
import com.flightreservation.model.domain.FlightReservationComposite;
import com.flightreservation.model.service.exception.InvalidLoginException;
import com.flightreservation.model.service.factory.Factory;
import com.flightreservation.model.service.loginservice.ILoginService;

/**
 * @author Brenda Palmer
 *
 */
public class LoginManager extends Manager {

	public LoginManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static String userName = "brenda";
	public static String password = "pass";

	public void createLogin(FlightReservationComposite frc) throws ServiceLoadingException, InvalidLoginException {

		Factory factory = Factory.getInstance();

		try {
			ILoginService ls = (ILoginService) factory.getService(ILoginService.NAME);
			ls.authenticateUser(frc);
		} catch (ServiceLoadingException sle) {
			sle.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void viewLogin(FlightReservationComposite frc) {

	}

	public void updateLogin(FlightReservationComposite frc) {

	}

	public void deleteLogin(FlightReservationComposite frc) {

	}

	public String getLogin(String userName, String password) {

		return userName + password;
	}

	public void generateStatement(FlightReservationComposite frc) {

	}

	public void getLogin(JTextField userNameField, JTextField passwordField) {
		// TODO Auto-generated method stub
		
	}

}
