package com.flightreservation.model.domain;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.Test;

public class ReserveItineraryTest {

	@Test
	public void testValidates() {
		
		ReserveItinerary reserveflight = new ReserveItinerary(522.97, 1, 1, true);
		
		assertTrue(reserveflight.validate(), "reserveflight validates");
		
		System.out.println("testValidate Passes");
	}
	
	@Test
	public void testNotValidates() {
		
		ReserveItinerary reserveflight = new ReserveItinerary(522.97, 1, 1, false);
		
		assertFalse(reserveflight.validate(), "reserveflight does not validate");
		
		System.out.println("testNotValidate Passes");
	}
	
	@Test 
	public void testEquals() {
		
		ReserveItinerary reserveflight1 = new ReserveItinerary(522.97, 1, 1, true);
		ReserveItinerary reserveflight2 = new ReserveItinerary(522.97, 1, 1, true);
		
		assertTrue(reserveflight1.equals(reserveflight2), "reserveflight1 equals reserveflight2");
		
		System.out.println("testEquals Passes");
	}
	
	@Test 
	public void testNotEquals() {
		
		ReserveItinerary reserveflight1 = new ReserveItinerary(522.97, 1, 1, true);
		ReserveItinerary reserveflight2 = new ReserveItinerary(1.99, 1, 1, true);
		
		assertFalse(reserveflight1.equals(reserveflight2), "reserveflight1 does not equal reserveflight2");
		
		System.out.println("testNotEquals Passes");
	}


}
