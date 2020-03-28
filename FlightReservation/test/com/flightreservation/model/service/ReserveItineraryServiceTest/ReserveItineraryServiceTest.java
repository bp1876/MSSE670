/**
 * 
 */
package com.flightreservation.model.service.ReserveItineraryServiceTest;

import org.junit.jupiter.api.BeforeEach;

import com.flightreservation.model.domain.ReserveItinerary;
import com.flightreservation.model.service.factory.Factory;
import com.flightreservation.model.service.reserveitineraryservice.IReserveItineraryService;

import junit.framework.TestCase;

/**
 * @author Brenda Palmer
 *
 */
public class ReserveItineraryServiceTest extends TestCase {

	private Factory sf;
	private ReserveItinerary reserveflight;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();

		sf = new Factory();

		reserveflight = new ReserveItinerary(522.97, 1, 1, true);
	}

	/**
	 * Casting Factory output to IReserveItineraryService
	 * 
	 */
	public final void testReserveFlight() {

		IReserveItineraryService iris = sf.getRI();
		assertTrue(iris.reserveFlight(reserveflight));
		System.out.println("testReserveFlight Passed");
	}
	
	public final void testNullReserveFlight() {

		IReserveItineraryService iris = sf.getRI();
		assertTrue(iris.reserveFlight(null));
		System.out.println("testNullReserveFlight Passed");
	}

}
