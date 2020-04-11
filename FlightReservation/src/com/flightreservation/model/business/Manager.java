/**
 * 
 */
package com.flightreservation.model.business;

import com.flightreservation.model.business.exception.ServiceLoadingException;
import com.flightreservation.model.service.IService;
import com.flightreservation.model.service.factory.Factory;

/**
 * @author Brenda Palmer
 * 
 * This is the Manager SuperType
 *
 */
public class Manager {

	private Factory factory = Factory.getInstance();
	
	protected IService getService (String svcName) throws ServiceLoadingException{
		
		return factory.getService(svcName);
	}
}
