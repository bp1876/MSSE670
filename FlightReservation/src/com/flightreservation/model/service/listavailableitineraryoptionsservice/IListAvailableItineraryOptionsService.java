package com.flightreservation.model.service.listavailableitineraryoptionsservice;

import com.flightreservation.model.domain.FlightReservationComposite;
import com.flightreservation.model.service.IService;
import com.flightreservation.model.service.exception.InvalidOptionsListException;

/**
 * @author Brenda Palmer
 *
 */
//Interface for ListAvailableItineraryOptionsService
public interface IListAvailableItineraryOptionsService extends IService{
	
	public final String NAME = "IListAvailableItineraryOptionsService";

	public boolean optionsList(FlightReservationComposite frc) throws InvalidOptionsListException;

}
