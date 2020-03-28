/**
 * 
 */
package com.flightreservation.model.service.FactoryTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.flightreservation.model.service.bookitineraryservice.BookItineraryImpl;
import com.flightreservation.model.service.bookitineraryservice.IBookItineraryService;
import com.flightreservation.model.service.customeraccountservice.CustomerAccountImpl;
import com.flightreservation.model.service.customeraccountservice.ICustomerAccountService;
import com.flightreservation.model.service.factory.Factory;
import com.flightreservation.model.service.listavailableitineraryoptionsservice.IListAvailableItineraryOptionsService;
import com.flightreservation.model.service.listavailableitineraryoptionsservice.ListAvailableItineraryOptionsImpl;
import com.flightreservation.model.service.loginservice.ILoginService;
import com.flightreservation.model.service.loginservice.LoginServiceImpl;
import com.flightreservation.model.service.reserveitineraryservice.IReserveItineraryService;
import com.flightreservation.model.service.reserveitineraryservice.ReserveItineraryImpl;
import com.flightreservation.model.service.searchflightinformationservice.ISearchFlightInformationService;
import com.flightreservation.model.service.searchflightinformationservice.SearchFlightInformationImpl;

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

		ICustomerAccountService icas = (ICustomerAccountService) serviceFactory.getCustomerAccount();
		assertTrue(icas instanceof CustomerAccountImpl);

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

		ILoginService ils = (ILoginService) serviceFactory.getLogin();
		assertTrue(ils instanceof LoginServiceImpl);
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

		ISearchFlightInformationService isfis = (ISearchFlightInformationService) serviceFactory.getSFI();
		assertTrue(isfis instanceof SearchFlightInformationImpl);
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

		IListAvailableItineraryOptionsService ilaios = (IListAvailableItineraryOptionsService) serviceFactory.getLAIO();
		assertTrue(ilaios instanceof ListAvailableItineraryOptionsImpl);
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

		IReserveItineraryService iris = (IReserveItineraryService) serviceFactory.getRI();
		assertTrue(iris instanceof ReserveItineraryImpl);
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

		IBookItineraryService ibis = (IBookItineraryService) serviceFactory.getBI();
		assertTrue(ibis instanceof BookItineraryImpl);
	}

}
