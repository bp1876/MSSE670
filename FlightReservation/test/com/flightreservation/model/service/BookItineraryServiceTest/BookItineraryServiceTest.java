/**
 * 
 */
package com.flightreservation.model.service.BookItineraryServiceTest;

import org.junit.jupiter.api.BeforeEach;

import com.flightreservation.model.domain.BookItinerary;
import com.flightreservation.model.service.bookitineraryservice.IBookItineraryService;
import com.flightreservation.model.service.factory.Factory;

import junit.framework.TestCase;

/**
 * @author Brenda Palmer
 *
 */
public class BookItineraryServiceTest extends TestCase {

	private Factory sf;
	private BookItinerary book;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();

		sf = new Factory();
	}

	/**
	 * Casting Factory output to IBookItineraryService
	 * 
	 */

	public final void testBookFlight() {

		IBookItineraryService ibis = sf.getBI();
		assertTrue(ibis.bookFlight(book));
		System.out.println("testBookFlight Passed");
	}

	public final void testNullBookFlight() {

		IBookItineraryService ibis = sf.getBI();
		assertTrue(ibis.bookFlight(null));
		System.out.println("testNullBookFlight Passed");
	}
}
