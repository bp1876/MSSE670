package com.flightreservation.model.service.searchflightinformationservice;

import com.flightreservation.model.domain.FlightReservationComposite;
import com.flightreservation.model.service.IService;
import com.flightreservation.model.service.exception.InvalidSearchFlightException;

/**
 * @author Brenda Palmer
 *
 */

//Interface for SearchFlightInformationService
public interface ISearchFlightInformationService extends IService{
	
	public final String NAME = "ISearchFlightInformationService";

	public boolean searchFlights(FlightReservationComposite frc) throws InvalidSearchFlightException;

}
