/**
 * 
 */
package com.flightreservation.model.business;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.flightreservation.model.business.exception.ServiceLoadingException;
import com.flightreservation.model.domain.Login;
import com.flightreservation.model.service.exception.InvalidLoginException;

import junit.framework.TestCase;

/**
 * @author Brenda Palmer
 *
 */
public class LoginMgrTest extends TestCase{
	
	@SuppressWarnings("unused")
	private Login login;

	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();
		
			
	login = new Login("brenda", "pass");

}
	
	@Test
	public void testLoginInformation() throws ServiceLoadingException, InvalidLoginException {
		assertTrue(Manager.class.isAssignableFrom(LoginManager.class));
		
		System.out.println("testLoginInformation Passed");
	}

	

	public void assertTrue(String userName) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testgetLoginInfo() throws ServiceLoadingException, InvalidLoginException {

		assertTrue(Manager.class.isAssignableFrom(LoginManager.class));
		assertTrue(LoginManager.userName);
		assertTrue(LoginManager.password);
		System.out.println("testgetLoginInfo Passed");
	}

	
}
