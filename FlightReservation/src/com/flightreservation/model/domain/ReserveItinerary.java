package com.flightreservation.model.domain;

import java.io.Serializable;

public class ReserveItinerary extends ListAvailableItineraryOptions implements Serializable {

	/**
	 * The following is a class variable for Serializable and an instance variable
	 * outlined in the class diagram
	 */
	private static final long serialVersionUID = 1L;

	private boolean selectList;

	/**
	 * @return the selectList
	 */
	public boolean isSelectList() {
		return selectList;
	}

	/**
	 * @param selectList the selectList to set
	 */
	public void setSelectList(boolean selectList) {
		this.selectList = selectList;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	// Constructor
	public ReserveItinerary(double cost, int departureTimeOffset, int legs, boolean selectList) {
		super(cost, departureTimeOffset, legs);
		this.selectList = selectList;
	}

	// method to reserve the flight
	public void reserveFlight() {

		if (selectList == true) {

			System.out.println("List selected to be reserved: " + selectList);
		}

		else {

			System.out.println("Flight has not been reserved: " + selectList);
		}
	}

	// validate method for JUnit testing
	public boolean validate() {

		if (selectList == false)
			return false;

		return true;
	}

	// overriding hashCode method
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (selectList ? 1231 : 1237);
		return result;
	}

	// overriding equals method for JUnit testing
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReserveItinerary other = (ReserveItinerary) obj;
		if (selectList != other.selectList)
			return false;
		return true;
	}

	// overriding toString method to print the object
	@Override
	public String toString() {
		return "ReserveItinerary [selectList=" + selectList + "]";
	}

	public static void main(String[] args) {

		ReserveItinerary reserveflight = new ReserveItinerary(522.97, 1, 1, true);

		System.out.println(reserveflight);

	}

}
