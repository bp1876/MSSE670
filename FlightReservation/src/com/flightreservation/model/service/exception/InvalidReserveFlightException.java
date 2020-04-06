/**
 * 
 */
package com.flightreservation.model.service.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Brenda Palmer
 *
 */
public class InvalidReserveFlightException extends Exception{

	
	private static final long serialVersionUID = 1L;
	
	public InvalidReserveFlightException(final String message) {
		
		super(message);
	}

	public InvalidReserveFlightException(String string, FileNotFoundException fileinvalid) {
		// TODO Auto-generated constructor stub
	}

	public InvalidReserveFlightException(String string, IOException e) {
		// TODO Auto-generated constructor stub
	}

	public InvalidReserveFlightException(String string, ClassNotFoundException classmissing) {
		// TODO Auto-generated constructor stub
	}

}
