/**
 * 
 */
package com.flightreservation.model.service.SearchFlightInformationServiceTest;

import org.junit.jupiter.api.BeforeEach;

import com.flightreservation.model.domain.SearchFlightInformation;


import junit.framework.TestCase;

/**
 * @author Brenda Palmer
 *
 */
public class SearchFlightInformationServiceTest extends TestCase {

	
	private SearchFlightInformation flightinfo1, flightinfo2;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();

		
		flightinfo1 = new SearchFlightInformation("031920", "5am", "DEN", "032020", "1pm", "AAA", 2, true, true);
		flightinfo2 = new SearchFlightInformation("031920", "5am", "DEN", "032020", "1pm", "AAA", 2, true, true);
	}

	/**
	 * Casting Factory output to ISearchFlightInformationService
	 * 
	 */
	public final void testSearchFlights() {

		
		assertTrue("flightinfo1 validates", flightinfo1.validate());
		System.out.println("testSearchFlights Passed");

	}
	
	public final void testEqualsSearchFlights() {

		
		assertTrue("flightinfo1 equals flightinfo2", flightinfo1.equals(flightinfo2));
		System.out.println("testEqualsSearchFlights Passed");

	}

}
