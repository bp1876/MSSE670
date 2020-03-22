package com.flightreservation.model.domain;

import java.io.Serializable;

public class BookItinerary extends ReserveItinerary implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean flightBooked;

	/**
	 * @return the flightBooked
	 */
	public boolean isFlightBooked() {
		return flightBooked;
	}

	/**
	 * @param flightBooked the flightBooked to set
	 */
	public void setFlightBooked(boolean flightBooked) {
		this.flightBooked = flightBooked;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public BookItinerary(double cost, int departureTimeOffset, int legs, boolean selectList, boolean flightBooked) {
		super(cost, departureTimeOffset, legs, selectList);
		this.flightBooked = flightBooked;
	}

	public void bookFlight(boolean flightReserved) {

		if (flightReserved == true) {

			// In order to complete the booking process, credit card information has to be
			// added
			CustomerAccount ca = new CustomerAccount("brenda", "1234 place", "me@aol.com", 16, 4, "user", "pass");
			ca.registerCreditCardInformation(16, 4);

		}
	}

	public boolean validate() {

		if (flightBooked == false)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (flightBooked ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookItinerary other = (BookItinerary) obj;
		if (flightBooked != other.flightBooked)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BookItinerary [flightBooked=" + flightBooked + "]";
	}

	public static void main(String[] args) {

		BookItinerary book = new BookItinerary(588.10, 1, 1, true, true);

		System.out.println(book);

	}

}
