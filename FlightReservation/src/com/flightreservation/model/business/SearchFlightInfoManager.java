/**
 * 
 */
package com.flightreservation.model.business;

import com.flightreservation.model.business.exception.ServiceLoadingException;
import com.flightreservation.model.domain.FlightReservationComposite;
import com.flightreservation.model.domain.SearchFlightInformation;
import com.flightreservation.model.service.exception.InvalidSearchFlightException;
import com.flightreservation.model.service.factory.Factory;
import com.flightreservation.model.service.searchflightinformationservice.ISearchFlightInformationService;

/**
 * @author Brenda Palmer
 *
 */
public class SearchFlightInfoManager extends Manager {

	public SearchFlightInfoManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static boolean searchflightresults = false;
	
	public void createSearchFlightInfo(FlightReservationComposite frc)
			throws ServiceLoadingException, InvalidSearchFlightException {

		Factory factory = Factory.getInstance();

		try {

			ISearchFlightInformationService isfis = (ISearchFlightInformationService) factory
					.getService(ISearchFlightInformationService.NAME);
			isfis.searchFlights(frc);
		} catch (ServiceLoadingException sle) {
			sle.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void viewSearchFlightInfo(FlightReservationComposite frc) {

	}

	public void updateSearchFlightInfo(FlightReservationComposite frc) {

	}

	public void deleteSearchFlightInfo(FlightReservationComposite frc) {

	}

	public boolean getSearchFlightInfo(boolean searchflightresults) {

		return true;
	}

	public void generateStatement(FlightReservationComposite frc) {

	}

	public void getSearchFlightInfo(SearchFlightInformation sfi) {
		// TODO Auto-generated method stub
		
	}

}
