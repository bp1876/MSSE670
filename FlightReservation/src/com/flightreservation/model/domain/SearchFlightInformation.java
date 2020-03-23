package com.flightreservation.model.domain;

import java.io.Serializable;
import java.util.ArrayList;

public class SearchFlightInformation implements Serializable {

	/**
	 * The following fields are the class variable for Serializable and instance variables
	 * as outlined in the class diagram
	 */
	private static final long serialVersionUID = 1L;

	private String departureDate;

	private String departureTime;

	private String departureLocation;

	private String arrivalDate;

	private String arrivalTime;

	private String arrivalLocation;

	private int numerOfPassengers;

	private boolean oneWay;

	private boolean roundTrip;

	/**
	 * @return the departureDate
	 */
	public String getDepartureDate() {
		return departureDate;
	}

	/**
	 * @param departureDate the departureDate to set
	 */
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	/**
	 * @return the departureTime
	 */
	public String getDepartureTime() {
		return departureTime;
	}

	/**
	 * @param departureTime the departureTime to set
	 */
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	/**
	 * @return the departureLocation
	 */
	public String getDepartureLocation() {
		return departureLocation;
	}

	/**
	 * @param departureLocation the departureLocation to set
	 */
	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}

	/**
	 * @return the arrivalDate
	 */
	public String getArrivalDate() {
		return arrivalDate;
	}

	/**
	 * @param arrivalDate the arrivalDate to set
	 */
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	/**
	 * @return the arrivalTime
	 */
	public String getArrivalTime() {
		return arrivalTime;
	}

	/**
	 * @param arrivalTime the arrivalTime to set
	 */
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	/**
	 * @return the arrivalLocation
	 */
	public String getArrivalLocation() {
		return arrivalLocation;
	}

	/**
	 * @param arrivalLocation the arrivalLocation to set
	 */
	public void setArrivalLocation(String arrivalLocation) {
		this.arrivalLocation = arrivalLocation;
	}

	/**
	 * @return the numerOfPassengers
	 */
	public int getNumerOfPassengers() {
		return numerOfPassengers;
	}

	/**
	 * @param numerOfPassengers the numerOfPassengers to set
	 */
	public void setNumerOfPassengers(int numerOfPassengers) {
		this.numerOfPassengers = numerOfPassengers;
	}

	/**
	 * @return the oneWay
	 */
	public boolean isOneWay() {
		return oneWay;
	}

	/**
	 * @param oneWay the oneWay to set
	 */
	public void setOneWay(boolean oneWay) {
		this.oneWay = oneWay;
	}

	/**
	 * @return the roundTrip
	 */
	public boolean isRoundTrip() {
		return roundTrip;
	}

	/**
	 * @param roundTrip the roundTrip to set
	 */
	public void setRoundTrip(boolean roundTrip) {
		this.roundTrip = roundTrip;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	//Constructor
	public SearchFlightInformation(String departureDate, String departureTime, String departureLocation,
			String arrivalDate, String arrivalTime, String arrivalLocation, int numerOfPassengers, boolean oneWay,
			boolean roundTrip) {
		super();
		this.departureDate = departureDate;
		this.departureTime = departureTime;
		this.departureLocation = departureLocation;
		this.arrivalDate = arrivalDate;
		this.arrivalTime = arrivalTime;
		this.arrivalLocation = arrivalLocation;
		this.numerOfPassengers = numerOfPassengers;
		this.oneWay = oneWay;
		this.roundTrip = roundTrip;
	}

	//Method to search flights by inputting desired search criteria and then saving it to a list
	@SuppressWarnings("rawtypes")
	public ArrayList<Comparable> searchFlights(String departureDate, String departureTime, String departureLocation,
			String arrivalDate, String arrivalTime, String arrivalLocation, int numerOfPassengers, boolean oneWay,
			boolean roundTrip) {

		ArrayList<Comparable> list = new ArrayList<Comparable>();
		list.add(departureDate);
		list.add(departureTime);
		list.add(departureLocation);
		list.add(arrivalDate);
		list.add(arrivalTime);
		list.add(arrivalLocation);
		list.add(numerOfPassengers);
		list.add(oneWay);
		list.add(roundTrip);

		return list;
	}
	
	
    //overriding the hashCode method
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arrivalDate == null) ? 0 : arrivalDate.hashCode());
		result = prime * result + ((arrivalLocation == null) ? 0 : arrivalLocation.hashCode());
		result = prime * result + ((arrivalTime == null) ? 0 : arrivalTime.hashCode());
		result = prime * result + ((departureDate == null) ? 0 : departureDate.hashCode());
		result = prime * result + ((departureLocation == null) ? 0 : departureLocation.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + numerOfPassengers;
		result = prime * result + (oneWay ? 1231 : 1237);
		result = prime * result + (roundTrip ? 1231 : 1237);
		return result;
	}

	//overriding the equals method
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SearchFlightInformation other = (SearchFlightInformation) obj;
		if (arrivalDate == null) {
			if (other.arrivalDate != null)
				return false;
		} else if (!arrivalDate.equals(other.arrivalDate))
			return false;
		if (arrivalLocation == null) {
			if (other.arrivalLocation != null)
				return false;
		} else if (!arrivalLocation.equals(other.arrivalLocation))
			return false;
		if (arrivalTime == null) {
			if (other.arrivalTime != null)
				return false;
		} else if (!arrivalTime.equals(other.arrivalTime))
			return false;
		if (departureDate == null) {
			if (other.departureDate != null)
				return false;
		} else if (!departureDate.equals(other.departureDate))
			return false;
		if (departureLocation == null) {
			if (other.departureLocation != null)
				return false;
		} else if (!departureLocation.equals(other.departureLocation))
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (numerOfPassengers != other.numerOfPassengers)
			return false;
		if (oneWay != other.oneWay)
			return false;
		if (roundTrip != other.roundTrip)
			return false;
		return true;
	}

	//validate method for JUnit testing
	public boolean validate() {

		if (departureDate == "")
			return false;
		if (departureTime == "")
			return false;
		if (departureLocation == "")
			return false;
		if (arrivalDate == "")
			return false;
		if (arrivalTime == "")
			return false;
		if (arrivalLocation == "")
			return false;
		if (numerOfPassengers == 0)
			return false;
		if (oneWay == false)
			return false;
		if (roundTrip == false)
			return false;

		return true;
	}

	//overriding toString method to print the object
	@Override
	public String toString() {
		return "SearchFlightInformation [departureDate=" + departureDate + ", departureTime=" + departureTime
				+ ", departureLocation=" + departureLocation + ", arrivalDate=" + arrivalDate + ", arrivalTime="
				+ arrivalTime + ", arrivalLocation=" + arrivalLocation + ", numerOfPassengers=" + numerOfPassengers
				+ ", oneWay=" + oneWay + ", roundTrip=" + roundTrip + "]";
	}

	public static void main(String[] args) {

		SearchFlightInformation flightinfo = new SearchFlightInformation("031920", "5am", "DEN", "032020", "1pm", "AAA",
				2, false, true);

		System.out.println(flightinfo);

	}

}
