/**
 * 
 */
package com.flightreservation.model.service.AllTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.flightreservation.model.service.BookItineraryServiceTest.BookItineraryServiceTest;
import com.flightreservation.model.service.CustomerAccountServiceTest.CustomerAccountServiceTest;
import com.flightreservation.model.service.FactoryTest.FactoryServiceTest;
import com.flightreservation.model.service.ListAvailableItineraryOptionsServiceTest.ListAvailableItineraryOptionsServiceTest;
import com.flightreservation.model.service.LoginServiceTest.LoginServiceTest;
import com.flightreservation.model.service.ReserveItineraryServiceTest.ReserveItineraryServiceTest;
import com.flightreservation.model.service.SearchFlightInformationServiceTest.SearchFlightInformationServiceTest;

/**
 * @author Brenda Palmer
 *
 */

//The following will get all the Test classes and then execute them at once
@RunWith(Suite.class)
@SuiteClasses({ FactoryServiceTest.class, CustomerAccountServiceTest.class, LoginServiceTest.class,
		SearchFlightInformationServiceTest.class, ListAvailableItineraryOptionsServiceTest.class,
		ReserveItineraryServiceTest.class, BookItineraryServiceTest.class })
public class AllServicesTests {

}
