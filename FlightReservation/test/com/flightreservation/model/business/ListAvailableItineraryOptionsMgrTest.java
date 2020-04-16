/**
 * 
 */
package com.flightreservation.model.business;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.flightreservation.model.business.exception.ServiceLoadingException;
import com.flightreservation.model.domain.ListAvailableItineraryOptions;
import com.flightreservation.model.service.exception.InvalidOptionsListException;

import junit.framework.TestCase;

/**
 * @author Brenda Palmer
 *
 */
public class ListAvailableItineraryOptionsMgrTest extends TestCase{
	
	@SuppressWarnings("unused")
	private ListAvailableItineraryOptions laio;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();
	
	
		laio = new ListAvailableItineraryOptions("500.99", "1", "1");
	}
	
	
	public void assertTrue(int ca2) {
		// TODO Auto-generated method stub

	}

	@Test
	public void testgetOptionsListInfo() throws ServiceLoadingException, InvalidOptionsListException {

		assertTrue(Manager.class.isAssignableFrom(ListAvailableItineraryOptionsManager.class));
		System.out.println(ListAvailableItineraryOptionsManager.avaliableOptions);
		System.out.println("testgetOptionsListInfo Passed");
	}


}
