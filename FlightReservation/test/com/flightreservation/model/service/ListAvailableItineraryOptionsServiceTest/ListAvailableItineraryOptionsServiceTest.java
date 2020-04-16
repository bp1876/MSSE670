/**
 * 
 */
package com.flightreservation.model.service.ListAvailableItineraryOptionsServiceTest;

import org.junit.jupiter.api.BeforeEach;

import com.flightreservation.model.domain.ListAvailableItineraryOptions;



import junit.framework.TestCase;

/**
 * @author Brenda Palmer
 *
 */
public class ListAvailableItineraryOptionsServiceTest extends TestCase {

	
	private ListAvailableItineraryOptions optionsList1, optionsList2;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();

	

		optionsList1 = new ListAvailableItineraryOptions("500.99", "1", "1");
		optionsList2 = new ListAvailableItineraryOptions("500.99", "1", "1");
	}

	/**
	 * Casting Factory output to IListAvailableItineraryOptionsService
	 * 
	 */
	public final void testListOptions() {

		
		assertTrue("optionsList1 validates", optionsList1.validate());
		System.out.println("testListOptions Passed");
		
		
	}
	public final void testEqualsListOptions() {

		
		assertTrue("optionsList1 equals optionsList1", optionsList1.equals(optionsList2));
		System.out.println("testEqualsListOptions Passed");

	}
}
