/**
 * 
 */
package com.flightreservation.model.service.CustomerAccountServiceTest;

import org.junit.jupiter.api.BeforeEach;

import com.flightreservation.model.domain.CustomerAccount;
import com.flightreservation.model.service.customeraccountservice.ICustomerAccountService;
import com.flightreservation.model.service.factory.Factory;

import junit.framework.TestCase;

/**
 * @author Brenda Palmer
 *
 */
public class CustomerAccountServiceTest extends TestCase {

	private Factory sf;
	private CustomerAccount customeraccount;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();

		sf = new Factory();

		customeraccount = new CustomerAccount("brenda", "1234 place", "me@aol.com", 16, 4, "user", "pass");
	}

	/**
	 * Casting Factory output to ICustomerAccountService
	 * 
	 */
	public final void testauthenticateCreditCard() {

		ICustomerAccountService cas = sf.getCustomerAccount();
		assertTrue(cas.authenticateCreditCard(customeraccount));
		System.out.println("testauthenticateCreditCard Passed");
	}

	public final void testNullAuthenticateCreditCard() {

		ICustomerAccountService cas = sf.getCustomerAccount();
		assertTrue(cas.authenticateCreditCard(null));
		System.out.println("testNullAuthenticateCreditCard Passed");
	}
}
