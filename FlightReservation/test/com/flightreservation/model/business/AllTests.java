package com.flightreservation.model.business;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BookItineraryMgrTest.class, CustomerAccountMgrTest.class, ListAvailableItineraryOptionsMgrTest.class,
		LoginMgrTest.class, ReserveItineraryMgrTest.class, SearchFlightInfoMgrTest.class })
public class AllTests {

}
