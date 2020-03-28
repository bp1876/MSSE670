/**
 * 
 */
package com.flightreservation.model.service.SearchFlightInformationServiceTest;

import org.junit.jupiter.api.BeforeEach;

import com.flightreservation.model.domain.SearchFlightInformation;
import com.flightreservation.model.service.factory.Factory;
import com.flightreservation.model.service.searchflightinformationservice.ISearchFlightInformationService;

import junit.framework.TestCase;

/**
 * @author Brenda Palmer
 *
 */
public class SearchFlightInformationServiceTest extends TestCase {

	private Factory sf;
	private SearchFlightInformation flightinfo;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();

		sf = new Factory();
		flightinfo = new SearchFlightInformation("031920", "5am", "DEN", "032020", "1pm", "AAA", 2, false, true);
	}

	/**
	 * Casting Factory output to ISearchFlightInformationService
	 * 
	 */
	public final void testSearchFlights() {

		ISearchFlightInformationService isfis = sf.getSFI();
		assertTrue(isfis.searchFlights(flightinfo));
		System.out.println("testSearchFlights Passed");

	}
	
	public final void testNullSearchFlights() {

		ISearchFlightInformationService isfis = sf.getSFI();
		assertTrue(isfis.searchFlights(null));
		System.out.println("testNullSearchFlights Passed");

	}

}
