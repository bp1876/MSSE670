package com.flightreservation.model.service.searchflightinformationservice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.flightreservation.model.domain.FlightReservationComposite;
import com.flightreservation.model.domain.SearchFlightInformation;
import com.flightreservation.model.service.exception.InvalidSearchFlightException;

/**
 * @author Brenda Palmer
 * 
 * @param FlightReservationComposite Used to validate search flight information
 * 
 * @throws InvalidSearchFlightException If search flight information is missing
 *                                      or incorrect exception will be thrown or
 *                                      if class or file is cannot be found
 *
 */

public class SearchFlightInformationImpl implements ISearchFlightInformationService {

	public boolean searchFlights(FlightReservationComposite frc) throws InvalidSearchFlightException {

		boolean flag = false;
		ObjectInputStream readFile = null;

		try {

			FileOutputStream fos = new FileOutputStream(
					"C:\\Users\\Admin\\git\\MSSE670\\FlightReservation\\flightdocs\\SearchFlightInformation.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(frc.getSfi());
			oos.flush();
			oos.close();

			readFile = new ObjectInputStream(new FileInputStream(
					"C:\\Users\\Admin\\git\\MSSE670\\FlightReservation\\flightdocs\\SearchFlightInformation.out"));

			Object readObject = readFile.readObject();
			SearchFlightInformation savedSearch = SearchFlightInformation.class.cast(readObject);

			SearchFlightInformation inSearch = frc.getSfi();

			if (inSearch != null) {

				if (savedSearch.equals(inSearch)) {
					flag = true;
				} else {
					flag = false;
				}

			} else {

				throw new InvalidSearchFlightException(
						"Invalid Search Flight Information Passed to SearchFlightInfomationImpl");
			}
		} catch (FileNotFoundException fileinvalid) {

			System.out.println("File not found!");
			throw new InvalidSearchFlightException("File not found", fileinvalid);
		} catch (IOException e) {

			System.out.println("Exception accessing file!");
			throw new InvalidSearchFlightException("Exception accessing file", e);
		} catch (ClassNotFoundException classmissing) {

			System.out.println("Class not found!");
			throw new InvalidSearchFlightException("Class not found", classmissing);
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
