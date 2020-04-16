/**
 * 
 */
package com.flightreservation.model.business;

import com.flightreservation.model.business.exception.ServiceLoadingException;
import com.flightreservation.model.domain.FlightReservationComposite;
import com.flightreservation.model.domain.ReserveItinerary;
import com.flightreservation.model.service.exception.InvalidReserveFlightException;
import com.flightreservation.model.service.factory.Factory;
import com.flightreservation.model.service.reserveitineraryservice.IReserveItineraryService;

/**
 * @author Brenda Palmer
 *
 */
public class ReserveItineraryManager extends Manager {

	public ReserveItineraryManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static boolean reserveFlight = false;

	public void createReserveFlight(FlightReservationComposite frc)
			throws ServiceLoadingException, InvalidReserveFlightException {

		Factory factory = Factory.getInstance();

		try {

			IReserveItineraryService ri = (IReserveItineraryService) factory.getService(IReserveItineraryService.NAME);
			ri.reserveFlight(frc);
		} catch (ServiceLoadingException sle) {
			sle.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void viewReserveFlight(FlightReservationComposite frc) {

	}

	public void updateReserveFlight(FlightReservationComposite frc) {

	}

	public void deleteReserveFlight(FlightReservationComposite frc) {

	}

	public boolean getReserveFlight(ReserveItinerary ri) {

		return true;
	}

	public void generateStatement(FlightReservationComposite frc) {

	}

}
