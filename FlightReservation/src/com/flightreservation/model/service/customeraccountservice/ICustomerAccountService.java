package com.flightreservation.model.service.customeraccountservice;


import com.flightreservation.model.domain.FlightReservationComposite;
import com.flightreservation.model.service.IService;
import com.flightreservation.model.service.exception.InvalidCreditCardException;

/**
 * @author Brenda Palmer
 *
 */
// Interface for CustomerAccountService
public interface ICustomerAccountService extends IService{
	
	public final String NAME ="ICustomerAccountService";

	public boolean authenticateCreditCard(FlightReservationComposite frc) throws InvalidCreditCardException;

}
