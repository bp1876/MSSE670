/**
 * 
 */
package com.flightreservation.model.service.ListAvailableItineraryOptionsServiceTest;

import org.junit.jupiter.api.BeforeEach;

import com.flightreservation.model.domain.ListAvailableItineraryOptions;
import com.flightreservation.model.service.factory.Factory;
import com.flightreservation.model.service.listavailableitineraryoptionsservice.IListAvailableItineraryOptionsService;

import junit.framework.TestCase;

/**
 * @author Brenda Palmer
 *
 */
public class ListAvailableItineraryOptionsServiceTest extends TestCase {

	private Factory sf;
	private ListAvailableItineraryOptions optionsList;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();

		sf = new Factory();

		optionsList = new ListAvailableItineraryOptions(500.99, 1, 1);
	}

	/**
	 * Casting Factory output to IListAvailableItineraryOptionsService
	 * 
	 */
	public final void testListOptions() {

		IListAvailableItineraryOptionsService ilaios = sf.getLAIO();
		assertTrue(ilaios.optionsList(optionsList));
		System.out.println("testListOptions Passed");
		
		assertTrue(ilaios.optionsList(null));
		System.out.println("testListOptions with NULL Passed");

	}
	public final void testNullListOptions() {

		IListAvailableItineraryOptionsService ilaios = sf.getLAIO();
		assertTrue(ilaios.optionsList(null));
		System.out.println("testListOptions with NULL Passed");

	}
}
