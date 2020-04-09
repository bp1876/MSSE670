package com.flightreservation.model.service.reserveitineraryservice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.flightreservation.model.domain.FlightReservationComposite;
import com.flightreservation.model.domain.ReserveItinerary;
import com.flightreservation.model.service.exception.InvalidReserveFlightException;

/**
 * @author Brenda Palmer
 * 
 * @param FlightReservationComposite Used to validate reserving flight
 *                                   information
 * 
 * @throws InvalidReserveFlightException If reserve flight information is
 *                                       missing or incorrect exception will be
 *                                       thrown or if class or file is cannot be
 *                                       found
 *
 */

public class ReserveItineraryImpl implements IReserveItineraryService {

	@Override
	public boolean reserveFlight(FlightReservationComposite frc) throws InvalidReserveFlightException {

		boolean flag = false;
		ObjectInputStream readFile = null;

		try {

			FileOutputStream fos = new FileOutputStream(
					"C:\\Users\\Admin\\git\\MSSE670\\FlightReservation\\flightdocs\\ReserveFlight.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(frc.getRi());
			oos.flush();

			readFile = new ObjectInputStream(new FileInputStream(
					"C:\\Users\\Admin\\git\\MSSE670\\FlightReservation\\flightdocs\\ReserveFlight.out"));

			Object readObject = readFile.readObject();
			ReserveItinerary savedReserve = ReserveItinerary.class.cast(readObject);

			ReserveItinerary inReserve = frc.getRi();

			if (inReserve != null) {

				if (savedReserve.equals(inReserve)) {
					flag = true;
				} else {
					flag = false;
				}

			} else {

				throw new InvalidReserveFlightException(
						"Invalid Reserve Flight Information Passed to ReserveItineraryImpl");
			}
		} catch (FileNotFoundException fileinvalid) {

			System.out.println("File not found!");
			throw new InvalidReserveFlightException("File not found", fileinvalid);
		} catch (IOException e) {

			System.out.println("Exception accessing file!");
			throw new InvalidReserveFlightException("Exception accessing file", e);
		} catch (ClassNotFoundException classmissing) {

			System.out.println("Class not found!");
			throw new InvalidReserveFlightException("Class not found", classmissing);
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
