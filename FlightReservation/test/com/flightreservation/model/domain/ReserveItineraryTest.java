package com.flightreservation.model.domain;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.Test;

public class ReserveItineraryTest {

	@Test
	public void testValidates() {
		
		ReserveItinerary reserveflight = new ReserveItinerary("522.97", "1", "1", "true");
		
		//Testing that the arguments passed are valid
		assertTrue(reserveflight.validate(), "reserveflight validates");
		
		System.out.println("testValidate Passes");
	}
	
	@Test
	public void testNotValidates() {
		
		ReserveItinerary reserveflight = new ReserveItinerary("522.97", "1", "1", "false");
		
		//Testing that the arguments passed are invalid
		assertFalse(reserveflight.validate(), "reserveflight does not validate");
		
		System.out.println("testNotValidate Passes");
	}
	
	@Test 
	public void testEquals() {
		
		ReserveItinerary reserveflight1 = new ReserveItinerary("522.97", "1", "1", "true");
		ReserveItinerary reserveflight2 = new ReserveItinerary("522.97", "1", "1", "true");
		
		//Testing that the arguments for both objects are a match
		assertTrue(reserveflight1.equals(reserveflight2), "reserveflight1 equals reserveflight2");
		
		System.out.println("testEquals Passes");
	}
	
	@Test 
	public void testNotEquals() {
		
		ReserveItinerary reserveflight1 = new ReserveItinerary("522.97", "1", "1", "true");
		ReserveItinerary reserveflight2 = new ReserveItinerary("522.97", "1", "1", "true");
		
		//Testing that the arguments for both objects are not a match
		assertFalse(reserveflight1.equals(reserveflight2), "reserveflight1 does not equal reserveflight2");
		
		System.out.println("testNotEquals Passes");
	}


}
