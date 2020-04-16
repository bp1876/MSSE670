/**
 * 
 */
package com.flightreservation.model.business;

import com.flightreservation.model.business.exception.ServiceLoadingException;
import com.flightreservation.model.domain.FlightReservationComposite;
import com.flightreservation.model.domain.ListAvailableItineraryOptions;
import com.flightreservation.model.service.exception.InvalidOptionsListException;
import com.flightreservation.model.service.factory.Factory;
import com.flightreservation.model.service.listavailableitineraryoptionsservice.IListAvailableItineraryOptionsService;

/**
 * @author Brenda Palmer
 *
 */
public class ListAvailableItineraryOptionsManager extends Manager {

	public ListAvailableItineraryOptionsManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static boolean avaliableOptions = false;  //if fails change to true
	
	public void createListOptions(FlightReservationComposite frc)
			throws ServiceLoadingException, InvalidOptionsListException {

		Factory factory = Factory.getInstance();

		try {

			IListAvailableItineraryOptionsService ilaios = (IListAvailableItineraryOptionsService) factory
					.getService(IListAvailableItineraryOptionsService.NAME);
			ilaios.optionsList(frc);
		} catch (ServiceLoadingException sle) {
			sle.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void viewListOptions(FlightReservationComposite frc) {

	}

	public void updateListOptions(FlightReservationComposite frc) {

	}

	public void deleteListOptions(FlightReservationComposite frc) {

	}

	public boolean getListOptions(ListAvailableItineraryOptions laio) {

		return true;
	}

	public void generateStatement(FlightReservationComposite frc) {

	}

}
