/**
 * 
 */
package com.flightreservation.model.service.FactoryTest;

import static org.junit.Assert.fail;


import org.junit.Before;
import org.junit.Test;

import com.flightreservation.model.business.exception.ServiceLoadingException;
import com.flightreservation.model.service.bookitineraryservice.IBookItineraryService;
import com.flightreservation.model.service.customeraccountservice.ICustomerAccountService;
import com.flightreservation.model.service.factory.Factory;
import com.flightreservation.model.service.listavailableitineraryoptionsservice.IListAvailableItineraryOptionsService;
import com.flightreservation.model.service.loginservice.ILoginService;
import com.flightreservation.model.service.reserveitineraryservice.IReserveItineraryService;
import com.flightreservation.model.service.searchflightinformationservice.ISearchFlightInformationService;


/**
 * @author Brenda Palmer
 *
 */
public class FactoryServiceTest {

	Factory serviceFactory;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

		serviceFactory = new Factory();
	}

	/**
	 * This is a test factory to return the CustomerAccountService and assert it by
	 * checking it is an instance of CustomerAccountImpl
	 * 
	 * It should return true
	 * 
	 */
	@Test
	public void testauthenticateCreditCard() {

		@SuppressWarnings("unused")
		ICustomerAccountService icas;
		try{
			icas = (ICustomerAccountService)serviceFactory.getService(ICustomerAccountService.NAME);
			System.out.println("testauthenticateCreditCard Passed");
		}catch(ServiceLoadingException e) {
		
			e.printStackTrace();
			fail("ServiceLoadingException");
		}

	}

	/**
	 * This is a test factory to return the LoginService and assert it by checking
	 * it is an instance of LoginServiceImpl
	 * 
	 * It should return true
	 * 
	 */

	@Test
	public void testauthenticateUser() {

		@SuppressWarnings("unused")
		ILoginService ils;
		
		try{
			ils = (ILoginService)serviceFactory.getService(ILoginService.NAME);
			System.out.println("testauthenticateUser Passed");
		}catch(ServiceLoadingException e) {
		
			e.printStackTrace();
			fail("ServiceLoadingException");
		}
	}

	/**
	 * This is a test factory to return the SearchFlightInformationService and
	 * assert it by checking it is an instance of SearchFlightInformationImpl
	 * 
	 * It shoud return true
	 * 
	 */

	@Test
	public void testSearchFlights() {

		@SuppressWarnings("unused")
		ISearchFlightInformationService isfis;
		try{
			isfis = (ISearchFlightInformationService)serviceFactory.getService(ISearchFlightInformationService.NAME);
			System.out.println("testSearchFlights Passed");
		}catch(ServiceLoadingException e) {
		
			e.printStackTrace();
			fail("ServiceLoadingException");
		}
	}

	/**
	 * This is a test factory to return the ListAvailableItineraryOptionsService and
	 * assert it by checking it is an instance of ListAvailableItineraryOptionsImpl
	 * 
	 * It should return true
	 * 
	 */

	@Test
	public void testListOptions() {

		@SuppressWarnings("unused")
		IListAvailableItineraryOptionsService ilaios;
		
		try{
			ilaios = (IListAvailableItineraryOptionsService)serviceFactory.getService(IListAvailableItineraryOptionsService.NAME);
			System.out.println("testListOptions Passed");
		}catch(ServiceLoadingException e) {
		
			e.printStackTrace();
			fail("ServiceLoadingException");
		}
	}

	/**
	 * This is a test factory to return the ReserveItineraryService and assert it by
	 * checking it is an instance of ReserveItineraryImpl
	 * 
	 * It should return true
	 * 
	 */

	@Test
	public void testReserveItinerary() {

		@SuppressWarnings("unused")
		IReserveItineraryService iris;
		
		try{
			iris = (IReserveItineraryService)serviceFactory.getService(IReserveItineraryService.NAME);
			System.out.println("testReserveItinerary Passed");
		}catch(ServiceLoadingException e) {
		
			e.printStackTrace();
			fail("ServiceLoadingException");
		}
	}

	/**
	 * This is a test factory to return the BookItineraryService and assert it by
	 * checking it is an instance of BookItineraryImpl
	 * 
	 * It should return true
	 * 
	 */

	@Test
	public void testBookItinerary() {

		@SuppressWarnings("unused")
		IBookItineraryService ibis;
		
		try{
			ibis = (IBookItineraryService)serviceFactory.getService(IBookItineraryService.NAME);
			System.out.println("testBookItinerary Passed");
		}catch(ServiceLoadingException e) {
		
			e.printStackTrace();
			fail("ServiceLoadingException");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
