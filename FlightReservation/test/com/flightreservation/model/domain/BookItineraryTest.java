package com.flightreservation.model.domain;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class BookItineraryTest {

	@Test
	public void testValidates() {

		BookItinerary book = new BookItinerary(588.10, 1, 1, true, true);

		assertTrue(book.validate(), "book validates");

		System.out.println("testValidates Passes");

	}

	@Test
	public void testNotValidates() {

		BookItinerary book = new BookItinerary(588.10, 1, 1, true, false);

		assertFalse(book.validate(), "book does not validate");

		System.out.println("testNotValidates Passes");

	}
	
	@Test
	public void testEquals() {
		
		BookItinerary book1 = new BookItinerary(588.10, 1, 1, true, true);
		BookItinerary book2 = new BookItinerary(588.10, 1, 1, true, true);
		
		assertTrue(book1.equals(book2), "book1 equals book2");
		
		System.out.println("testEquals Passes");
	}
	
	@Test
	public void testNotEquals() {
		
		BookItinerary book1 = new BookItinerary(588.10, 1, 1, true, true);
		BookItinerary book2 = new BookItinerary(1.99, 1, 1, true, true);
		
		assertFalse(book1.equals(book2), "book1 does not equal book2");
		
		System.out.println("testNotEquals Passes");
	}
	
	

}
