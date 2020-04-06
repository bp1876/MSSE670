/**
 * 
 */
package com.flightreservation.model.service.exception;



/**
 * @author Brenda Palmer
 *
 */
public class InvalidCreditCardException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidCreditCardException (final String message, final Throwable e) {
		
		super(message, e);
	}

	public InvalidCreditCardException(String string) {
		// TODO Auto-generated constructor stub
	}

	
	
	

}
