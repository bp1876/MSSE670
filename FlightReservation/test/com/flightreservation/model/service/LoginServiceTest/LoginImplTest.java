package com.flightreservation.model.service.LoginServiceTest;



import com.flightreservation.model.business.exception.ServiceLoadingException;
import com.flightreservation.model.domain.FlightReservationComposite;
import com.flightreservation.model.domain.Login;
import com.flightreservation.model.service.exception.InvalidLoginException;
import com.flightreservation.model.service.factory.Factory;
import com.flightreservation.model.service.loginservice.ILoginService;
import com.flightreservation.model.service.loginservice.LoginServiceImpl;

import junit.framework.TestCase;

public class LoginImplTest extends TestCase {

	private Factory serviceFactory;
	private Login login;
	private FlightReservationComposite frc = new FlightReservationComposite();

	/**
	 * @throws java.lang.Exception
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();

		serviceFactory = Factory.getInstance();

		login = new Login("brenda", "pass");
		frc.setLogin(login);
	}

	
	public final void testLogin() {

		ILoginService log = null;

		try {
			log = (ILoginService) serviceFactory.getService(ILoginService.NAME);

			assertTrue(log.authenticateUser(frc));
			System.out.println("testLogin Passed");

		} catch (ServiceLoadingException e) {
			e.printStackTrace();
			fail("ServiceLoadingException");
		} catch (InvalidLoginException icce) {
			icce.printStackTrace();
			fail("InvalidLoginException");
		
		}
		
		LoginServiceImpl lsi = null;
		try {
			
			
			lsi = (LoginServiceImpl) serviceFactory.getService(ILoginService.NAME);

			assertTrue(lsi.authenticateUser(frc));
			System.out.println("testLogin Passed");
					
		} catch (ServiceLoadingException e) {
			e.printStackTrace();
			fail("ServiceLoadException");
		} catch (InvalidLoginException loge) {
			loge.printStackTrace();
			fail("InvalidLoginException");

		}
	}
	
}
