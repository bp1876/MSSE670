/**
 * 
 */
package com.flightreservation.model.service.CustomerAccountServiceTest;

import com.flightreservation.model.business.exception.ServiceLoadingException;
import com.flightreservation.model.domain.CustomerAccount;
import com.flightreservation.model.domain.FlightReservationComposite;
import com.flightreservation.model.service.customeraccountservice.CustomerAccountImpl;
import com.flightreservation.model.service.customeraccountservice.ICustomerAccountService;
import com.flightreservation.model.service.exception.InvalidCreditCardException;
import com.flightreservation.model.service.factory.Factory;

import junit.framework.TestCase;

/**
 * @author Brenda Palmer
 *
 */
public class CustomerAccountImplTest extends TestCase {

	private Factory serviceFactory;
	private CustomerAccount ca;
	private FlightReservationComposite frc = new FlightReservationComposite();

	/**
	 * @throws java.lang.Exception
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();

		serviceFactory = Factory.getInstance();

		ca = new CustomerAccount("brenda", "1234 place", "me@aol.com", "16", "4", "user", "pass");

		frc.setCa(ca);
	}

	public final void testCreditCardInformation() {

		ICustomerAccountService icas;

		try {
			icas = (ICustomerAccountService) serviceFactory.getService(ICustomerAccountService.NAME);

			assertTrue(icas.authenticateCreditCard(frc));
			System.out.println("testCreditCardInformation Passed");

		} catch (ServiceLoadingException e) {
			e.printStackTrace();
			fail("ServiceLoadingException");
		} catch (InvalidCreditCardException icce) {
			icce.printStackTrace();
			fail("InvalidCreditCardException");
		}

		try {

			CustomerAccountImpl cai = (CustomerAccountImpl) serviceFactory.getService(ICustomerAccountService.NAME);

			assertTrue(cai.authenticateCreditCard(frc));
			System.out.println("testCreditCardInformation Passed");

		} catch (ServiceLoadingException e) {
			e.printStackTrace();
			fail("ServiceLoadException");
		} catch (InvalidCreditCardException icce) {
			icce.printStackTrace();
			fail("InvalidCreditCardException");

		}
	}
}
