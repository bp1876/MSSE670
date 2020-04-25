/**
 * 
 */
package com.flightreservation.model.service.ReserveItineraryServiceTest;

import org.junit.jupiter.api.BeforeEach;

import com.flightreservation.model.domain.ReserveItinerary;



import junit.framework.TestCase;

/**
 * @author Brenda Palmer
 *
 */
public class ReserveItineraryServiceTest extends TestCase {

	
	private ReserveItinerary reserveflight1, reserveflight2;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();

		

		reserveflight1 = new ReserveItinerary("true");
		reserveflight2 = new ReserveItinerary("true");
	}

	/**
	 * Casting Factory output to IReserveItineraryService
	 * 
	 */
	public final void testReserveFlight() {

		
		assertTrue("reserveflight1 validates", reserveflight1.validate());
		System.out.println("testReserveFlight Passed");
	}
	
	public final void testEqualsReserveFlight() {

		
		assertTrue("reserveflight1 equals reserveflight2", reserveflight1.equals(reserveflight2));
		System.out.println("testEqualsReserveFlight Passed");
	}

}
