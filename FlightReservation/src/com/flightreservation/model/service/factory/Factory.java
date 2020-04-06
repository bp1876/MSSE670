package com.flightreservation.model.service.factory;

import com.flightreservation.model.business.exception.ServiceLoadingException;
import com.flightreservation.model.service.IService;

/**
 * @author Brenda Palmer
 *
 */

public class Factory {

	/**
	 * Singleton Pattern
	 */

	public Factory() {
	}

	private static Factory factory = new Factory();

	public static Factory getInstance() {
		return factory;
	}

	public IService getService(String svcName) throws ServiceLoadingException {

		try {
			Class<?> c = Class.forName(getImplName(svcName));
			return (IService) c.newInstance();
		} catch (Exception e) {
			svcName = svcName + "service unable to load";
			throw new ServiceLoadingException(svcName, e);
		}

	}

	/**
	 * 
	 * @param svcName
	 * @return
	 * @throws Exception
	 */
	private String getImplName(String svcName) throws Exception {

		java.util.Properties propFile = new java.util.Properties();

		String propertyFile = System.getProperty("user.dir");

		System.out.println("Property File Location passed : " + propertyFile);
		java.io.FileInputStream fis = new java.io.FileInputStream("C:\\Users\\Admin\\git\\MSSE670\\FlightReservation\\config\\application.properties");

		propFile.load(fis);
		fis.close();
		return propFile.getProperty(svcName);
	}
}
