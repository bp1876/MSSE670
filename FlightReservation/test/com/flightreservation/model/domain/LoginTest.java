package com.flightreservation.model.domain;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class LoginTest {

	@Test
	public void testValidates() {

		Login login = new Login("brenda", "pass");

		assertTrue(login.validate(), "Login validates");

		System.out.println("testValidates Passes");

	}

	@Test
	public void testNotValidates() {

		Login login = new Login("", "pass");

		assertFalse(login.validate(), "Login does not validate");

		System.out.println("testNotValidates Passes");

	}

	@Test
	public void testEqualsLogin() {

		Login login1 = new Login("brenda", "pass");
		Login login2 = new Login("brenda", "pass");

		assertTrue(login1.equals(login2), "login1 equals login2");

		System.out.println("testEqualsLogin Passes");

	}

	@Test
	public void testNotEqualsLogin() {

		Login login1 = new Login("brenda", "pass");
		Login login2 = new Login("fred", "pass");

		assertFalse(login1.equals(login2), "login1 does not equal login2");

		System.out.println("testNotEqualsLogin Passes");

	}

}
