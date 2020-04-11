/**
 * 
 */
package com.flightreservation.model.business;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.flightreservation.model.business.exception.ServiceLoadingException;
import com.flightreservation.model.domain.CustomerAccount;
import com.flightreservation.model.service.exception.InvalidCreditCardException;

import junit.framework.TestCase;

/**
 * @author Brenda Palmer
 *
 */
class CustomerAccountMgrTest extends TestCase {

	@SuppressWarnings("unused")
	private CustomerAccount ca;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();

		ca = new CustomerAccount("brenda", "1234 place", "me@aol.com", 16, 4, "user", "pass");

	}

	@Test
	void testCreateCreditCardInformation() throws ServiceLoadingException, InvalidCreditCardException {
		assertTrue(Manager.class.isAssignableFrom(CustomerAccountManager.class));
		assertTrue(CustomerAccountManager.ca);
		System.out.println("testCreateCreditCardInformation Passed");
	}

	private void assertTrue(int ca2) {
		// TODO Auto-generated method stub

	}

	@Test
	void testgetCCInfo() throws ServiceLoadingException, InvalidCreditCardException {

		assertTrue(Manager.class.isAssignableFrom(CustomerAccountManager.class));
		System.out.println(CustomerAccountManager.ca);
		System.out.println("testgetCCInfo Passed");
	}

}
