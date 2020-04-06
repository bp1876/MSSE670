package com.flightreservation.model.service.ListAvailableItineraryOptionsServiceTest;

import com.flightreservation.model.business.exception.ServiceLoadingException;
import com.flightreservation.model.domain.FlightReservationComposite;
import com.flightreservation.model.domain.ListAvailableItineraryOptions;
import com.flightreservation.model.service.exception.InvalidOptionsListException;
import com.flightreservation.model.service.factory.Factory;
import com.flightreservation.model.service.listavailableitineraryoptionsservice.IListAvailableItineraryOptionsService;
import com.flightreservation.model.service.listavailableitineraryoptionsservice.ListAvailableItineraryOptionsImpl;


import junit.framework.TestCase;

public class ListAvailableItineraryOptionsImplTest extends TestCase{
	

	private Factory serviceFactory;
	private ListAvailableItineraryOptions optionsList;
	private FlightReservationComposite frc = new FlightReservationComposite();

	/**
	 * @throws java.lang.Exception
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();

		serviceFactory = Factory.getInstance();

		optionsList = new ListAvailableItineraryOptions(500.99, 1, 1);
		frc.setLaio(optionsList);
	}

	public final void testOptionsList() {

		IListAvailableItineraryOptionsService ilaios;

		try {
			ilaios = (IListAvailableItineraryOptionsService) serviceFactory.getService(IListAvailableItineraryOptionsService.NAME);

			assertTrue(ilaios.optionsList(frc));
			System.out.println("testOptionsList Passed");

		} catch (ServiceLoadingException e) {
			e.printStackTrace();
			fail("ServiceLoadingException");
		} catch (InvalidOptionsListException icce) {
			icce.printStackTrace();
			fail("InvalidOptionsListException");
		}

		try {

			ListAvailableItineraryOptionsImpl l = (ListAvailableItineraryOptionsImpl) serviceFactory.getService(IListAvailableItineraryOptionsService.NAME);

			assertTrue(l.optionsList(frc));
			System.out.println("testOptionsList Passed");

		} catch (ServiceLoadingException e) {
			e.printStackTrace();
			fail("ServiceLoadException");
		} catch (InvalidOptionsListException ole) {
			ole.printStackTrace();
			fail("InvalidOptionsListException");

		}
	}

}
