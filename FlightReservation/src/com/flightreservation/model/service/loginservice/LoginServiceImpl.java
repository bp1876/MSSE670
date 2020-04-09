package com.flightreservation.model.service.loginservice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.flightreservation.model.domain.FlightReservationComposite;
import com.flightreservation.model.domain.Login;
import com.flightreservation.model.service.exception.InvalidLoginException;

/**
 * @author Brenda Palmer
 * 
 * @param FlightReservationComposite Used to validate login information
 * 
 * @throws InvalidLoginException If login information is missing or incorrect
 *                               exception will be thrown or if class or file is
 *                               cannot be found
 *
 */

public class LoginServiceImpl implements ILoginService {

	@Override
	public boolean authenticateUser(FlightReservationComposite frc) throws InvalidLoginException {

		boolean flag = false;
		ObjectInputStream readFile = null;

		try {

			FileOutputStream fos = new FileOutputStream(
					"C:\\Users\\Admin\\git\\MSSE670\\FlightReservation\\flightdocs\\Login.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(frc.getLogin());
			oos.flush();
			oos.close();

			readFile = new ObjectInputStream(
					new FileInputStream("C:\\Users\\Admin\\git\\MSSE670\\FlightReservation\\flightdocs\\Login.out"));

			Object readObject = readFile.readObject();
			Login savedLogin = Login.class.cast(readObject);

			Login inLogin = frc.getLogin();

			if (inLogin != null) {

				if (savedLogin.equals(inLogin)) {
					flag = true;
				} else {
					flag = false;
				}

			} else {

				throw new InvalidLoginException("Invalid Login Information Passed to LoginServiceImpl");
			}

		} catch (FileNotFoundException fileinvalid) {

			System.out.println("File not found!");
			throw new InvalidLoginException("File not found", fileinvalid);
		} catch (IOException e) {

			System.out.println("Exception accessing file!");
			e.printStackTrace();
			throw new InvalidLoginException("Exception accessing file", e);
		} catch (ClassNotFoundException classmissing) {

			System.out.println("Class not found!");
			throw new InvalidLoginException("Class not found", classmissing);
		} catch (Exception e) {
			System.out.println("unknown error occured");
			throw new InvalidLoginException(e.getMessage());
		} finally {

			if (readFile != null) {
				try {
					readFile.close();
				} catch (IOException e) {
					// print StackTrace to screen or log
					e.printStackTrace();
				}
			}
		}

		return flag;
	}

}
