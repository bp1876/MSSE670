package com.flightreservation.model.service.loginservice;

import com.flightreservation.model.domain.FlightReservationComposite;
import com.flightreservation.model.service.IService;
import com.flightreservation.model.service.exception.InvalidLoginException;

/**
 * @author Brenda Palmer
 *
 */

//Interface for LoginService
public interface ILoginService extends IService{
	
	public final String NAME = "ILoginService";

	public boolean authenticateUser(FlightReservationComposite frc) throws InvalidLoginException;

}
