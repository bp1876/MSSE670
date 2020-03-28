package com.flightreservation.model.service.customeraccountservice;

import com.flightreservation.model.domain.CustomerAccount;

/**
 * @author Brenda Palmer
 *
 */

public class CustomerAccountImpl implements ICustomerAccountService {

	/**
	 * Stubbed plugin design for implementing CustomerAccountService for validating
	 * credit card information
	 */
	@Override
	public boolean authenticateCreditCard(CustomerAccount customeraccount) {

		System.out.println("Entering method CustomerAccountServiceImpl::authenticateCreditCard");

		return true;
	}

}
