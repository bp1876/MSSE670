package com.flightreservation.model.domain;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BookItineraryTest.class, CustomerAccountTest.class, ListAvailableItineraryOptionsTest.class,
		LoginTest.class, ReserveItineraryTest.class, SearchFlightInformationTest.class })
public class AllTests {

}
