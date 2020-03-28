package com.flightreservation.model.service.LoginServiceTest;

import org.junit.jupiter.api.BeforeEach;

import com.flightreservation.model.domain.Login;
import com.flightreservation.model.service.factory.Factory;
import com.flightreservation.model.service.loginservice.ILoginService;

import junit.framework.TestCase;

/**
 * @author Brenda Palmer
 *
 */

public class LoginServiceTest extends TestCase {

	private Factory sf;
	private Login login;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();

		sf = new Factory();

		login = new Login("brenda", "pass");

	}

	/**
	 * Casting Factory output to ILoginService
	 * 
	 */
	public final void testauthenticateUser() {

		ILoginService ils = sf.getLogin();
		assertTrue(ils.authenticateUser(login));
		System.out.println("testauthenticateUser Passed");
		
	}

	public final void testNullAuthenticateUser() {
		
		ILoginService ils = sf.getLogin();
		assertTrue(ils.authenticateUser(null));
		System.out.println("testNullAuthenticateUser Passed");
		
	}
}
