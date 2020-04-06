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
public class InvalidBookFlightException extends Exception{

	
	private static final long serialVersionUID = 1L;
	
	public InvalidBookFlightException(final String message) {
		
		super(message);
	}

	public InvalidBookFlightException(String string, FileNotFoundException fileinvalid) {
		// TODO Auto-generated constructor stub
	}

	public InvalidBookFlightException(String string, IOException e) {
		// TODO Auto-generated constructor stub
	}

	public InvalidBookFlightException(String string, ClassNotFoundException classmissing) {
		// TODO Auto-generated constructor stub
	}

}
