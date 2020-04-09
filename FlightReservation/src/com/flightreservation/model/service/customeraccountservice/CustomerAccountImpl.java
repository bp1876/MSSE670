package com.flightreservation.model.service.customeraccountservice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.flightreservation.model.domain.CustomerAccount;
import com.flightreservation.model.domain.FlightReservationComposite;
import com.flightreservation.model.service.exception.InvalidCreditCardException;

/**
 * @author Brenda Palmer
 * 
 * @param FlightReservationComposite Used to validate credit card information
 * 
 * @throws InvalidCreditCardException If credit card information is missing or
 *                                    incorrect exception will be thrown or if
 *                                    class or file is cannot be found
 *
 */

public class CustomerAccountImpl implements ICustomerAccountService {

	@Override
	public boolean authenticateCreditCard(FlightReservationComposite frc) throws InvalidCreditCardException {

		boolean flag = false;
		ObjectInputStream readFile = null;

		try {

			FileOutputStream fos = new FileOutputStream(
					"C:\\Users\\Admin\\git\\MSSE670\\FlightReservation\\flightdocs\\CreditCardInformation.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(frc.getCa());
			oos.flush();

			readFile = new ObjectInputStream(new FileInputStream(
					"C:\\Users\\Admin\\git\\MSSE670\\FlightReservation\\flightdocs\\CreditCardInformation.out"));

			Object readObject = readFile.readObject();
			CustomerAccount savedCC = CustomerAccount.class.cast(readObject);

			CustomerAccount inCC = frc.getCa();

			if (inCC != null) {

				if (savedCC.equals(inCC)) {
					flag = true;
				} else {
					flag = false;
				}

			} else {

				throw new InvalidCreditCardException("Invalid Credit Card Information Passed to CustomerAccountImpl",
						null);
			}
		} catch (FileNotFoundException fileinvalid) {

			System.out.println("File not found!");
			throw new InvalidCreditCardException("File not found", fileinvalid);
		} catch (IOException e) {

			System.out.println("Exception accessing file!");
			throw new InvalidCreditCardException("Exception accessing file", e);
		} catch (ClassNotFoundException classmissing) {

			System.out.println("Class not found!");
			throw new InvalidCreditCardException("Class not found", classmissing);
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
