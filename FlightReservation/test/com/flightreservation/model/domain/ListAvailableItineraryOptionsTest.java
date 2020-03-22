package com.flightreservation.model.domain;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class ListAvailableItineraryOptionsTest {

	@Test
	public void testValidates() {
		
		ListAvailableItineraryOptions optionsList = new ListAvailableItineraryOptions(500.99, 1, 1);
		
		assertTrue(optionsList.validate(), "optionsList Validates");
		
		System.out.println("testValidates Passes");
		
	}
	
	@Test
	public void testNotValidates() {
		
		ListAvailableItineraryOptions optionsList = new ListAvailableItineraryOptions(500.99, 3, 3);
		
		assertFalse(optionsList.validate(), "optionsList does not validate");
		
		System.out.println("testNotValidates Passes");
		
	}
	
	@Test
	public void testEquals() {
		
		ListAvailableItineraryOptions optionsList1 = new ListAvailableItineraryOptions(500.99, 1, 1);
		ListAvailableItineraryOptions optionsList2 = new ListAvailableItineraryOptions(500.99, 1, 1);
		
		assertTrue(optionsList1.equals(optionsList2), "optionsList1 equals optionsList2");
		
		System.out.println("testEquals Passes");
	}
	
	@Test
	public void testNotEquals() {
		
		ListAvailableItineraryOptions optionsList1 = new ListAvailableItineraryOptions(500.99, 1, 1);
		ListAvailableItineraryOptions optionsList2 = new ListAvailableItineraryOptions(99.10, 1, 1);
		
		assertFalse(optionsList1.equals(optionsList2), "optionsList1 does not equal optionsList2");
		
		System.out.println("testNotEquals Passes");
	}


}
