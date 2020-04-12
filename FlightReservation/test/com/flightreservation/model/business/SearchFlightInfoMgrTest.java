/**
 * 
 */
package com.flightreservation.model.business;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.flightreservation.model.business.exception.ServiceLoadingException;
import com.flightreservation.model.domain.SearchFlightInformation;
import com.flightreservation.model.service.exception.InvalidSearchFlightException;

import junit.framework.TestCase;

/**
 * @author Brenda Palmer
 *
 */
public class SearchFlightInfoMgrTest extends TestCase {

	@SuppressWarnings("unused")
	private SearchFlightInformation sfi;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();

		sfi = new SearchFlightInformation("031920", "5am", "DEN", "032020", "1pm", "AAA", 2, false, true);
	}

	@Test
	public void testCreateSearchFlightInformation() throws ServiceLoadingException, InvalidSearchFlightException {
		assertTrue(Manager.class.isAssignableFrom(SearchFlightInfoManager.class));

		System.out.println("testCreateSearchFlightInformation Passed");
	}
	
	

}