package com.flightreservation.model.service.bookitineraryservice;


import com.flightreservation.model.domain.FlightReservationComposite;
import com.flightreservation.model.service.IService;
import com.flightreservation.model.service.exception.InvalidBookFlightException;

/**
 * @author Brenda Palmer
 *
 */
//Interface for BookItineraryService
public interface IBookItineraryService extends IService{
	
	public final String NAME = "IBookItineraryService";

	public boolean bookFlight(FlightReservationComposite frc) throws InvalidBookFlightException;

}
