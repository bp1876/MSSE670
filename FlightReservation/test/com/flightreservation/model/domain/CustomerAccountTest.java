package com.flightreservation.model.domain;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class CustomerAccountTest {

	@Test
	public void testValidates() {

		CustomerAccount customer = new CustomerAccount("brenda", "1234 place", "me@aol.com", 16, 4, "user", "pass");

		//
		assertTrue(customer.validate(), "Customer validates");

		System.out.println("testValidates Passes");

	}

	@Test
	public void testNotValidates() {

		CustomerAccount customer = new CustomerAccount("", "1234 place", "me@aol.com", 16, 4, "user", "pass");

		//
		assertFalse(customer.validate(), "Customer does not validate");

		System.out.println("testNOTValidates Passes");

	}

	@Test
	public void testEqualsCustomerAccount() {

		CustomerAccount customer1 = new CustomerAccount("brenda", "1234 place", "me@aol.com", 16, 4, "user", "pass");
		CustomerAccount customer2 = new CustomerAccount("brenda", "1234 place", "me@aol.com", 16, 4, "user", "pass");

		assertTrue(customer1.equals(customer2), "customer1 equals customer2");

		System.out.println("testEqualsCustomerAccount Passes");
	}

	@Test
	public void testNotEqualsCustomerAccount() {

		CustomerAccount customer1 = new CustomerAccount("brenda", "1234 place", "me@aol.com", 16, 4, "user", "pass");
		CustomerAccount customer2 = new CustomerAccount("fred", "1234 place", "me@aol.com", 16, 4, "user", "pass");

		assertFalse(customer1.equals(customer2), "customer1 does not equals customer2");

		System.out.println("testNotEqualsCustomerAccount Passes");
	}

}
