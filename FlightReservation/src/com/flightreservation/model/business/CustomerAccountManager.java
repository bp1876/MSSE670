/**
 * 
 */
package com.flightreservation.model.business;

import com.flightreservation.model.business.exception.ServiceLoadingException;
import com.flightreservation.model.domain.FlightReservationComposite;
import com.flightreservation.model.service.customeraccountservice.ICustomerAccountService;
import com.flightreservation.model.service.exception.InvalidCreditCardException;
import com.flightreservation.model.service.factory.Factory;

/**
 * @author Brenda Palmer
 *
 */
public class CustomerAccountManager extends Manager {

	public CustomerAccountManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static int ca = 16;

	public void createCustomerAccount(FlightReservationComposite frc)
			throws ServiceLoadingException, InvalidCreditCardException {

		Factory factory = Factory.getInstance();

		try {

			ICustomerAccountService caSvc = (ICustomerAccountService) factory.getService(ICustomerAccountService.NAME);
			caSvc.authenticateCreditCard(frc);
		} catch (ServiceLoadingException sle) {
			sle.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void viewCustomerAccount(FlightReservationComposite frc) {

	}

	public void updateCustomerAccount(FlightReservationComposite frc) {

	}

	public void deleteCustomerAccount(FlightReservationComposite frc) {

	}

	public int getCustomerAccount(int creditcardinfo) {

		return ca;
	}

	public void generateStatement(FlightReservationComposite frc) {

	}

}
