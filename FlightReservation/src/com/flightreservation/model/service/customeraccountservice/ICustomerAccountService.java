package com.flightreservation.model.service.customeraccountservice;

import com.flightreservation.model.domain.CustomerAccount;

/**
 * @author Brenda Palmer
 *
 */
// Interface for CustomerAccountService
public interface ICustomerAccountService {

	public boolean authenticateCreditCard(CustomerAccount customeraccount);

}
