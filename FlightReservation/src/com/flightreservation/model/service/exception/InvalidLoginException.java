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
public class InvalidLoginException extends Exception{

	
	private static final long serialVersionUID = 1L;
	
	public InvalidLoginException(final String message) {
		
		super(message);
	}

	public InvalidLoginException(String string, FileNotFoundException fileinvalid) {
		// TODO Auto-generated constructor stub
	}

	public InvalidLoginException(String string, IOException e) {
		// TODO Auto-generated constructor stub
	}

	public InvalidLoginException(String string, ClassNotFoundException classmissing) {
		// TODO Auto-generated constructor stub
	}

}
