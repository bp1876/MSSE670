package com.flightreservation.model.service.LoginServiceTest;

import org.junit.jupiter.api.BeforeEach;

import com.flightreservation.model.domain.Login;


import junit.framework.TestCase;

/**
 * @author Brenda Palmer
 *
 */

public class LoginServiceTest extends TestCase {

	private Login login1, login2;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();

		
		login1 = new Login("brenda", "pass");
		login2 = new Login("brenda", "pass");

	}

	/**
	 * Casting Factory output to ILoginService
	 * 
	 */
	public final void testauthenticateUser() {

		
		assertTrue("Login validates", login1.validate());
		System.out.println("testauthenticateUser Passed");
		
	}

	public final void testEqualsAuthenticateUser() {
		
		
		assertTrue("login1 equals login2", login1.equals(login2));
		System.out.println("testEqualsAuthenticateUser Passed");
		
	}
}
