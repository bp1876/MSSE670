package com.flightreservation.model.domain;

import java.io.Serializable;

public class BookItinerary extends ReserveItinerary implements Serializable {

	/**
	 * Brenda Palmer
	 */
	
	//class variable for the interface Serializable
	private static final long serialVersionUID = 1L;

	//instance variable for flight booked field
	private String flightBooked;

	/**
	 * @return the flightBooked
	 */
	public String isFlightBooked() {
		return flightBooked;
	}

	/**
	 * @param flightBooked the flightBooked to set
	 */
	public void setFlightBooked(String flightBooked) {
		this.flightBooked = flightBooked;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	//Constructor that also includes parent classes fields
	public BookItinerary(String cost, String departureTimeOffset, String legs, String selectList, String flightBooked) {
		super(cost, departureTimeOffset, legs, selectList);
		this.flightBooked = flightBooked;
	}

	public BookItinerary() {
		// TODO Auto-generated constructor stub
	}

	//method to check if flight has been booked
	public void bookFlight(String book) {

		if (book.equalsIgnoreCase("Yes")) {

			System.out.println("Flight successfully booked: " + book);
		}

		else {

			System.out.println("Flight has not been booked: " + book);
		}
	}

	//validate method for JUnit testing
	public boolean validate() {

		if (flightBooked == "")
			return false;

		return true;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((flightBooked == null) ? 0 : flightBooked.hashCode());
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
		if (flightBooked == null) {
			if (other.flightBooked != null)
				return false;
		} else if (!flightBooked.equals(other.flightBooked))
			return false;
		return true;
	}

	//overriding toString method for printing an object
	@Override
	public String toString() {
		return "BookItinerary [flightBooked=" + flightBooked + "]";
	}

	public static void main(String[] args) {

		//BookItinerary book = new BookItinerary("588.10", "1", "1", "true", "true");

		//System.out.println(book);

	}

}
