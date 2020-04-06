package com.flightreservation.model.service.BookItineraryServiceTest;

import com.flightreservation.model.business.exception.ServiceLoadingException;
import com.flightreservation.model.domain.BookItinerary;
import com.flightreservation.model.domain.FlightReservationComposite;
import com.flightreservation.model.service.bookitineraryservice.BookItineraryImpl;
import com.flightreservation.model.service.bookitineraryservice.IBookItineraryService;
import com.flightreservation.model.service.exception.InvalidBookFlightException;
import com.flightreservation.model.service.factory.Factory;

import junit.framework.TestCase;

public class BookItineraryImplTest extends TestCase {

	private Factory serviceFactory;
	private BookItinerary book;
	private FlightReservationComposite frc = new FlightReservationComposite();

	/**
	 * @throws java.lang.Exception
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();

		serviceFactory = Factory.getInstance();

		book = new BookItinerary(588.10, 1, 1, true, true);
		frc.setBook(book);
	}

	public final void testBookFlight() {

		IBookItineraryService bis;

		try {
			bis = (IBookItineraryService) serviceFactory.getService(IBookItineraryService.NAME);

			assertTrue(bis.bookFlight(frc));
			System.out.println("testBookFlight Passed");

		} catch (ServiceLoadingException e) {
			e.printStackTrace();
			fail("ServiceLoadingException");
		} catch (InvalidBookFlightException b) {
			b.printStackTrace();
			fail("InvalidBookFlightException");
		}

		try {

			BookItineraryImpl bii = (BookItineraryImpl) serviceFactory.getService(IBookItineraryService.NAME);

			assertTrue(bii.bookFlight(frc));
			System.out.println("testBookFlight Passed");

		} catch (ServiceLoadingException e) {
			e.printStackTrace();
			fail("ServiceLoadException");
		} catch (InvalidBookFlightException b) {
			b.printStackTrace();
			fail("InvalidBookFlightException");

		}
	}
}
