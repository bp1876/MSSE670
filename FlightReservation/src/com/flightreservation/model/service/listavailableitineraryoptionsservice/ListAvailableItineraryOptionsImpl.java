package com.flightreservation.model.service.listavailableitineraryoptionsservice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.flightreservation.model.domain.FlightReservationComposite;
import com.flightreservation.model.domain.ListAvailableItineraryOptions;
import com.flightreservation.model.service.exception.InvalidOptionsListException;

/**
 * @author Brenda Palmer
 * 
 * @param FlightReservationComposite Used to validate Options List information
 * 
 * @throws InvalidOptionsListException If options list information is missing or
 *                                     incorrect exception will be thrown or if
 *                                     class or file is cannot be found
 *
 */

public class ListAvailableItineraryOptionsImpl implements IListAvailableItineraryOptionsService {

	@Override
	public boolean optionsList(FlightReservationComposite frc) throws InvalidOptionsListException {
		boolean flag = false;
		ObjectInputStream readFile = null;
		

		try {

			FileOutputStream fos = new FileOutputStream(
					"C:\\Users\\Admin\\git\\MSSE670\\FlightReservation\\flightdocs\\OptionsList.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(frc.getLaio());
			oos.flush();
			

			readFile = new ObjectInputStream(new FileInputStream(
					"C:\\Users\\Admin\\git\\MSSE670\\FlightReservation\\flightdocs\\OptionsList.out"));

			Object readObject = readFile.readObject();
			ListAvailableItineraryOptions savedList = ListAvailableItineraryOptions.class.cast(readObject); 

			ListAvailableItineraryOptions inList = frc.getLaio();

			if (inList != null) {

				if (savedList.equals(inList)) {
					flag = true;
				} else {
					flag = false;
				}

			} else {

				throw new InvalidOptionsListException("Invalid Options List Information Passed to CustomerAccountImpl");
			}
		} catch (FileNotFoundException fileinvalid) {

			System.out.println("File not found!");
			throw new InvalidOptionsListException("File not found", fileinvalid);
		} catch (IOException e) {

			System.out.println("Exception accessing file!");
			throw new InvalidOptionsListException("Exception accessing file", e);
		} catch (ClassNotFoundException classmissing) {

			System.out.println("Class not found!");
			throw new InvalidOptionsListException("Class not found", classmissing);
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
