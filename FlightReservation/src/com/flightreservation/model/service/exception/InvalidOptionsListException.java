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
public class InvalidOptionsListException extends Exception{

	
	private static final long serialVersionUID = 1L;
	
	public InvalidOptionsListException(final String message) {
		
		super(message);
	}

	public InvalidOptionsListException(String string, FileNotFoundException fileinvalid) {
		// TODO Auto-generated constructor stub
	}

	public InvalidOptionsListException(String string, IOException e) {
		// TODO Auto-generated constructor stub
	}

	public InvalidOptionsListException(String string, ClassNotFoundException classmissing) {
		// TODO Auto-generated constructor stub
	}

}
