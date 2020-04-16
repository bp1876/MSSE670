package com.flightreservation.model.service.ReserveItineraryServiceTest;

import com.flightreservation.model.business.exception.ServiceLoadingException;
import com.flightreservation.model.domain.FlightReservationComposite;
import com.flightreservation.model.domain.ReserveItinerary;
import com.flightreservation.model.service.exception.InvalidReserveFlightException;
import com.flightreservation.model.service.factory.Factory;
import com.flightreservation.model.service.reserveitineraryservice.IReserveItineraryService;
import com.flightreservation.model.service.reserveitineraryservice.ReserveItineraryImpl;

import junit.framework.TestCase;

public class ReserveItineraryImplTest extends TestCase {

	private Factory serviceFactory;
	private ReserveItinerary reserveflight;
	private FlightReservationComposite frc = new FlightReservationComposite();

	/**
	 * @throws java.lang.Exception
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();

		serviceFactory = Factory.getInstance();

		reserveflight = new ReserveItinerary("522.97", "1", "1", "true");
		frc.setRi(reserveflight);
	}

	public final void testReserveFlight() {

		IReserveItineraryService rf;

		try {
			rf = (IReserveItineraryService) serviceFactory.getService(IReserveItineraryService.NAME);

			assertTrue(rf.reserveFlight(frc));
			System.out.println("testReserveFlight Passed");

		} catch (ServiceLoadingException e) {
			e.printStackTrace();
			fail("ServiceLoadingException");
		} catch (InvalidReserveFlightException icce) {
			icce.printStackTrace();
			fail("InvalidReserveFlightException");
		}

		try {

			ReserveItineraryImpl ri = (ReserveItineraryImpl) serviceFactory.getService(IReserveItineraryService.NAME);

			assertTrue(ri.reserveFlight(frc));
			System.out.println("testReserveFlight Passed");

		} catch (ServiceLoadingException e) {
			e.printStackTrace();
			fail("ServiceLoadException");
		} catch (InvalidReserveFlightException loge) {
			loge.printStackTrace();
			fail("InvalidReserveFlightException");

		}
	}

}
