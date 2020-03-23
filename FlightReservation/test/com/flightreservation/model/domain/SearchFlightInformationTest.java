package com.flightreservation.model.domain;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class SearchFlightInformationTest {

	@Test
	public void testValidates() {

		SearchFlightInformation flightinfo = new SearchFlightInformation("031920", "5am", "DEN", "032020", "1pm", "AAA",
				2, true, true);

		//Testing that the arguments passed are valid
		assertTrue(flightinfo.validate(), "SearchFlightInformation validates");

		System.out.println("testValidates Passes");
	}

	@Test
	public void testNotValidates() {

		SearchFlightInformation flightinfo = new SearchFlightInformation("", "5am", "DEN", "032020", "1pm", "AAA", 2,
				false, true);

		//Testing that the arguments passed are invalid 
		assertFalse(flightinfo.validate(), "SearchFlightInformation does not validate");

		System.out.println("testNotValidates Passes");
	}

	@Test
	public void testEquals() {

		SearchFlightInformation flightinfo1 = new SearchFlightInformation("031920", "5am", "DEN", "032020", "1pm",
				"AAA", 2, false, true);
		SearchFlightInformation flightinfo2 = new SearchFlightInformation("031920", "5am", "DEN", "032020", "1pm",
				"AAA", 2, false, true);

		//Testing that the arguments for both objects are a match
		assertTrue(flightinfo1.equals(flightinfo2), "flightinfo1 equals flightinfo2");

		System.out.println("testEquals Passes");
	}

	@Test
	public void testNotEquals() {

		SearchFlightInformation flightinfo1 = new SearchFlightInformation("031920", "5am", "DEN", "032020", "1pm",
				"AAA", 2, false, true);
		SearchFlightInformation flightinfo2 = new SearchFlightInformation("031921", "5am", "DEN", "032020", "1pm",
				"AAA", 2, false, true);

		//Testing that the arguments for both objects are not a match
		assertFalse(flightinfo1.equals(flightinfo2), "flightinfo1 does not equal flightinfo2");

		System.out.println("testNotEquals Passes");
	}

}
