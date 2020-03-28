package com.flightreservation.model.service.loginservice;

import com.flightreservation.model.domain.Login;

/**
 * @author Brenda Palmer
 *
 */

//Interface for LoginService
public interface ILoginService {

	public boolean authenticateUser(Login login);

}
