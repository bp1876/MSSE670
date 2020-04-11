/**
 * 
 */
package com.flightreservation.model.AllTestSuite;


import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.flightreservation.model.service.FactoryTest.FactoryServiceTest;

import junit.framework.TestCase;


/**
 * @author Brenda Palmer
 *
 */
@RunWith(Suite.class)
@SelectPackages({"com.flightreservation.model.service", "com.flightreservation.model.domain"})
@SuiteClasses({com.flightreservation.model.service.AllTests.AllServicesTests.class,
	com.flightreservation.model.domain.AllTests.class})
public class ApplicationTestSuite extends TestCase{
	
	
	
	public ApplicationTestSuite(String name) {
		
		super(name);
	}

	
		
	}
	
	
	

