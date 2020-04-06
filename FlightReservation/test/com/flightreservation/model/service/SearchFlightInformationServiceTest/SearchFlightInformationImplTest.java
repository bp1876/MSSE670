package com.flightreservation.model.service.SearchFlightInformationServiceTest;

import com.flightreservation.model.business.exception.ServiceLoadingException;
import com.flightreservation.model.domain.FlightReservationComposite;
import com.flightreservation.model.domain.SearchFlightInformation;
import com.flightreservation.model.service.exception.InvalidSearchFlightException;
import com.flightreservation.model.service.factory.Factory;
import com.flightreservation.model.service.searchflightinformationservice.ISearchFlightInformationService;
import com.flightreservation.model.service.searchflightinformationservice.SearchFlightInformationImpl;

import junit.framework.TestCase;

public class SearchFlightInformationImplTest extends TestCase{
	
	private Factory serviceFactory;
	private SearchFlightInformation sfi;
	private FlightReservationComposite frc = new FlightReservationComposite();

	/**
	 * @throws java.lang.Exception
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();

		serviceFactory = Factory.getInstance();

		sfi = new SearchFlightInformation("031920", "5am", "DEN", "032020", "1pm", "AAA",
				2, false, true);
		frc.setSfi(sfi);
	}

	public final void testSearchFlightInformation() {

		ISearchFlightInformationService isfis;

		try {
			isfis = (ISearchFlightInformationService) serviceFactory.getService(ISearchFlightInformationService.NAME);

			assertTrue(isfis.searchFlights(frc));
			System.out.println("testSearchFlightInformation Passed");

		} catch (ServiceLoadingException e) {
			e.printStackTrace();
			fail("ServiceLoadingException");
		} catch (InvalidSearchFlightException icce) {
			icce.printStackTrace();
			fail("InvalidSearchFlightException");
		}

		try {

			SearchFlightInformationImpl s = (SearchFlightInformationImpl) serviceFactory.getService(ISearchFlightInformationService.NAME);

			assertTrue(s.searchFlights(frc));
			System.out.println("testSearchFlightInformation Passed");

		} catch (ServiceLoadingException e) {
			e.printStackTrace();
			fail("ServiceLoadException");
		} catch (InvalidSearchFlightException sfe) {
			sfe.printStackTrace();
			fail("InvalidSearchFlightException");

		}
	}

}
