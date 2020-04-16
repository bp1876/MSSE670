package com.flightreservation.model.domain;

import java.io.Serializable;

public class ReserveItinerary extends ListAvailableItineraryOptions implements Serializable {

	/**
	 * The following is a class variable for Serializable and an instance variable
	 * outlined in the class diagram
	 */
	private static final long serialVersionUID = 1L;

	private String selectList;

	/**
	 * @return the selectList
	 */
	public String isSelectList() {
		return selectList;
	}

	/**
	 * @param selectList the selectList to set
	 */
	public void setSelectList(String selectList) {
		this.selectList = selectList;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	/**
	 * 
	 */
	public ReserveItinerary() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cost
	 * @param departureTimeOffset
	 * @param legs
	 */
	public ReserveItinerary(String cost, String departureTimeOffset, String legs, String selectList) {
		super(cost, departureTimeOffset, legs);
		// TODO Auto-generated constructor stub
	}

	
	
	// method to reserve the flight
	public void reserveFlight(String selectionList) {

		if (selectionList.equalsIgnoreCase("Yes")) {

			System.out.println("List selected to be reserved: " + selectionList);
		}

		else {

			System.out.println("Flight has not been reserved: " + selectionList);
		}
	}

	// validate method for JUnit testing
	public boolean validate() {

		if (selectList == "")
			return false;

		return true;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((selectList == null) ? 0 : selectList.hashCode());
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
		ReserveItinerary other = (ReserveItinerary) obj;
		if (selectList == null) {
			if (other.selectList != null)
				return false;
		} else if (!selectList.equals(other.selectList))
			return false;
		return true;
	}

	// overriding toString method to print the object
	@Override
	public String toString() {
		return "ReserveItinerary [selectList=" + selectList + "]";
	}

	public static void main(String[] args) {

		//ReserveItinerary reserveflight = new ReserveItinerary("522.97", "1", "1", "true");

		//System.out.println(reserveflight);

	}

}
