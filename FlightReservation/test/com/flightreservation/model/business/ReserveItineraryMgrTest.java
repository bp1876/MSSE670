/**
 * 
 */
package com.flightreservation.model.business;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.flightreservation.model.business.exception.ServiceLoadingException;
import com.flightreservation.model.domain.ReserveItinerary;
import com.flightreservation.model.service.exception.InvalidReserveFlightException;

import junit.framework.TestCase;

/**
 * @author Brenda Palmer
 *
 */
public class ReserveItineraryMgrTest extends TestCase{
	
	@SuppressWarnings("unused")
	private ReserveItinerary ri;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();
		
		ri = new ReserveItinerary("true");

}
	
	

	

	@Test
	public void testgetReserveFlightInformation() throws ServiceLoadingException, InvalidReserveFlightException {

		assertTrue(Manager.class.isAssignableFrom(ReserveItineraryManager.class));
		System.out.println(ReserveItineraryManager.reserveFlight);
		System.out.println("testgetReserveFlightInformation Passed");
	}

	
}