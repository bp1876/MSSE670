/**
 * 
 */
package com.flightreservation.model.service.BookItineraryServiceTest;

import org.junit.jupiter.api.BeforeEach;

import com.flightreservation.model.domain.BookItinerary;

import junit.framework.TestCase;

/**
 * @author Brenda Palmer
 *
 */
public class BookItineraryServiceTest extends TestCase {

	
	private BookItinerary book1, book2;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();

		
		
		book1 = new BookItinerary("588.10", "1", "1", "true", "true");
		book2 = new BookItinerary("588.10", "1", "1", "true", "true");
	}

	/**
	 * Casting Factory output to IBookItineraryService
	 * 
	 */

	public final void testBookFlight() {

		
		assertTrue("book1 validates", book1.validate());
		System.out.println("testBookFlight Passed");
	}

	public final void testEqualsBookFlight() {

		
		assertTrue("book1 equals book2", book1.equals(book2));
		System.out.println("testEqualsBookFlight Passed");
	}
}
