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
public class InvalidSearchFlightException extends Exception{

	
	private static final long serialVersionUID = 1L;
	
	public InvalidSearchFlightException(final String message) {
		
		super(message);
	}

	public InvalidSearchFlightException(String string, FileNotFoundException fileinvalid) {
		// TODO Auto-generated constructor stub
	}

	public InvalidSearchFlightException(String string, IOException e) {
		// TODO Auto-generated constructor stub
	}

	public InvalidSearchFlightException(String string, ClassNotFoundException classmissing) {
		// TODO Auto-generated constructor stub
	}

}
