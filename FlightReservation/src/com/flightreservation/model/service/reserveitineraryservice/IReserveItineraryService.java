package com.flightreservation.model.service.reserveitineraryservice;

import com.flightreservation.model.domain.FlightReservationComposite;
import com.flightreservation.model.service.IService;
import com.flightreservation.model.service.exception.InvalidReserveFlightException;

/**
 * @author Brenda Palmer
 *
 */

//Interface for ReserveItineraryService
public interface IReserveItineraryService extends IService{
	
	public final String NAME = "IReserveItineraryService";

	public boolean reserveFlight(FlightReservationComposite frc) throws InvalidReserveFlightException;

}
