/**
 * 
 */
package com.flightreservation.model.business;

import com.flightreservation.model.business.exception.ServiceLoadingException;
import com.flightreservation.model.domain.BookItinerary;
import com.flightreservation.model.domain.FlightReservationComposite;
import com.flightreservation.model.service.bookitineraryservice.IBookItineraryService;
import com.flightreservation.model.service.exception.InvalidBookFlightException;
import com.flightreservation.model.service.factory.Factory;

/**
 * @author Brenda Palmer
 *
 */
public class BookItineraryManager extends Manager{

	
	public BookItineraryManager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static boolean flightBooked = false;

	public void createBookItinerary(FlightReservationComposite frc)
			throws ServiceLoadingException, InvalidBookFlightException {

		Factory factory = Factory.getInstance();

		try {

			IBookItineraryService b = (IBookItineraryService) factory.getService(IBookItineraryService.NAME);
			b.bookFlight(frc);
		} catch (ServiceLoadingException sle) {
			sle.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void viewBookItinerary(FlightReservationComposite frc) {

	}

	public void updateBookItinerary(FlightReservationComposite frc) {

	}

	public void deleteBookItinerary(FlightReservationComposite frc) {

	}

	public boolean getBookItinerary(BookItinerary book) {

		return true;
	}

	public void generateStatement(FlightReservationComposite frc) {

	}
	
	

}
