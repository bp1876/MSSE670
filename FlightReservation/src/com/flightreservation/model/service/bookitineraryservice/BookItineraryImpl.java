package com.flightreservation.model.service.bookitineraryservice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.flightreservation.model.domain.BookItinerary;
import com.flightreservation.model.domain.FlightReservationComposite;
import com.flightreservation.model.service.exception.InvalidBookFlightException;


/**
 * @author Brenda Palmer
 * 
 * @param FlightReservationComposite
 * 			Used to validate booking flight information
 * 
 * @throws InvalidBookFlightException
 * 			If booking flight information is missing or incorrect exception will be thrown or if 
 * 			class or file is cannot be found
 *
 */

public class BookItineraryImpl implements IBookItineraryService {

	@Override
	public boolean bookFlight(FlightReservationComposite frc) throws InvalidBookFlightException {
		

		boolean flag = false;
		ObjectInputStream readFile = null;
		
		try {

			FileOutputStream fos = new FileOutputStream(
					"C:\\Users\\Admin\\git\\MSSE670\\FlightReservation\\flightdocs\\BookFlight.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(frc.getBook());
			oos.flush();
			

			readFile = new ObjectInputStream(new FileInputStream("C:\\Users\\Admin\\git\\MSSE670\\FlightReservation\\flightdocs\\BookFlight.out"));

			Object readObject = readFile.readObject();
			BookItinerary savedBook = BookItinerary.class.cast(readObject);
					
			BookItinerary inBook = frc.getBook();

			if (inBook != null) {

				if (savedBook.equals(inBook)) {
					flag = true;
				} else {
					flag = false;
				}

			} else {

				throw new InvalidBookFlightException("Invalid Book Flight Information Passed to BookItineraryImpl");
			}
		} catch (FileNotFoundException fileinvalid) {

			System.out.println("File not found!");
			throw new InvalidBookFlightException("File not found", fileinvalid);
		} catch (IOException e) {

			System.out.println("Exception accessing file!");
			throw new InvalidBookFlightException("Exception accessing file", e);
		} catch (ClassNotFoundException classmissing) {

			System.out.println("Class not found!");
			throw new InvalidBookFlightException("Class not found", classmissing);
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
