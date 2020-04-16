/**
 * 
 */
package com.flightreservation.model.service.CustomerAccountServiceTest;

import org.junit.jupiter.api.BeforeEach;

import com.flightreservation.model.domain.CustomerAccount;


import junit.framework.TestCase;

/**
 * @author Brenda Palmer
 *
 */
public class CustomerAccountServiceTest extends TestCase {

	
	private CustomerAccount customeraccount1, customeraccount2;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();

	

		customeraccount1 = new CustomerAccount("brenda", "1234 place", "me@aol.com", "16", "4", "user", "pass");
		customeraccount2 = new CustomerAccount("brenda", "1234 place", "me@aol.com", "16", "4", "user", "pass");
	}

	/**
	 * Casting Factory output to ICustomerAccountService
	 * 
	 */
	public final void testauthenticateCreditCard() {

		
		assertTrue("CustomerAccount validates", customeraccount1.validate());
		System.out.println("testauthenticateCreditCard Passed");
	}

	public final void testEqualsAuthenticateCreditCard() {

		assertTrue("customeraccount1 equals customeraccount2", customeraccount1.equals(customeraccount2));
		System.out.println("testEqualsAuthenticateCreditCard Passed");
	}
}
