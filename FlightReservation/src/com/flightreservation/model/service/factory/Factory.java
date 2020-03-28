package com.flightreservation.model.service.factory;

import com.flightreservation.model.service.bookitineraryservice.BookItineraryImpl;

import com.flightreservation.model.service.bookitineraryservice.IBookItineraryService;
import com.flightreservation.model.service.customeraccountservice.CustomerAccountImpl;
import com.flightreservation.model.service.customeraccountservice.ICustomerAccountService;
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

public class Factory {

	/**
	 * Service factory for CustomerAccountService
	 * 
	 */

	public ICustomerAccountService getCustomerAccount() {

		return new CustomerAccountImpl();
	}

	/**
	 * Service factory for LoginService
	 * 
	 */
	public ILoginService getLogin() {

		return new LoginServiceImpl();
	}

	/**
	 * Service factory for SearchFlightInformationService
	 * 
	 */
	public ISearchFlightInformationService getSFI() {

		return new SearchFlightInformationImpl();
	}

	/**
	 * Service factory for ListAvailableItineraryOptionsService
	 */
	public IListAvailableItineraryOptionsService getLAIO() {

		return new ListAvailableItineraryOptionsImpl();
	}

	/**
	 * Service factory for ReserveItineraryService
	 * 
	 */
	public IReserveItineraryService getRI() {

		return new ReserveItineraryImpl();
	}

	/**
	 * Service factory for BookItineraryService
	 * 
	 */
	public IBookItineraryService getBI() {

		return new BookItineraryImpl();
	}
}
