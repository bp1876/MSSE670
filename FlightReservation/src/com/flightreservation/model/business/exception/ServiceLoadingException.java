/**
 * 
 */
package com.flightreservation.model.business.exception;

/**
 * @author Brenda Palmer
 *
 */
@SuppressWarnings("serial")
public class ServiceLoadingException extends Exception{
	
	public ServiceLoadingException(final String message) {
		
		super(message);
	}

	public ServiceLoadingException(String svcName, Exception excp) {
		// TODO Auto-generated constructor stub
	}

}
