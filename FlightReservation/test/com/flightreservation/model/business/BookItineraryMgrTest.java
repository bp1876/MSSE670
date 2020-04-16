/**
 * 
 */
package com.flightreservation.model.business;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.flightreservation.model.business.exception.ServiceLoadingException;
import com.flightreservation.model.domain.BookItinerary;
import com.flightreservation.model.service.exception.InvalidBookFlightException;

import junit.framework.TestCase;

/**
 * @author Brenda Palmer
 *
 */
public class BookItineraryMgrTest extends TestCase{
	
	@SuppressWarnings("unused")
	private BookItinerary book;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();
	
	book = new BookItinerary("588.10", "1", "1", "true", "true");

}
	

	

	@Test
	public void testgetBookItineraryInformation() throws ServiceLoadingException, InvalidBookFlightException {

		assertTrue(Manager.class.isAssignableFrom(BookItineraryManager.class));
		System.out.println(BookItineraryManager.flightBooked);
		System.out.println("testgetBookItineraryInformation Passed");
	}
	
}
