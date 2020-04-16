package com.flightreservation.model.domain;

import java.io.Serializable;
import java.util.ArrayList;

public class ListAvailableItineraryOptions implements Serializable {

	/**
	 * The following is the class variable for Serializable, along with the instance variables
	 * refer to class diagram, which defines what must be included in this class
	 */
	private static final long serialVersionUID = 1L;

	private String cost;

	private String departureTimeOffset;

	private String legs;

	/**
	 * @return the cost
	 */
	public String getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(String cost) {
		this.cost = cost;
	}

	/**
	 * @return the departureTimeOffset
	 */
	public String getDepartureTimeOffset() {
		return departureTimeOffset;
	}

	/**
	 * @param departureTimeOffset the departureTimeOffset to set
	 */
	public void setDepartureTimeOffset(String departureTimeOffset) {
		this.departureTimeOffset = departureTimeOffset;
	}

	/**
	 * @return the legs
	 */
	public String getLegs() {
		return legs;
	}

	/**
	 * @param legs the legs to set
	 */
	public void setLegs(String legs) {
		this.legs = legs;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	//Constructor 
	public ListAvailableItineraryOptions(String cost, String departureTimeOffset, String legs) {
		super();
		this.cost = cost;
		this.departureTimeOffset = departureTimeOffset;
		this.legs = legs;
	}

	public ListAvailableItineraryOptions() {
		// TODO Auto-generated constructor stub
	}

	//method to create a list of itinerary options
	public void listOptions(String text, String text2, String text3) {

		ArrayList<Object> list = new ArrayList<Object>();

		ListAvailableItineraryOptions sfi = new ListAvailableItineraryOptions(cost, departureTimeOffset, legs);

		list.add(sfi);

		// Currently just verifying that the departureDate field was populated for validation
		if (text.equals("")) {

			System.out.println("Invalid list options criteria entered, please try again");

		} else {

			System.out.println("Here is a list of the available itineraries");

		}
	}

	//validate method for JUnit testing
	public boolean validate() {

		if (cost == "")
			return false;
		if (departureTimeOffset == "")
			return false;
		if (legs == "")
			return false;

		return true;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cost == null) ? 0 : cost.hashCode());
		result = prime * result + ((departureTimeOffset == null) ? 0 : departureTimeOffset.hashCode());
		result = prime * result + ((legs == null) ? 0 : legs.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListAvailableItineraryOptions other = (ListAvailableItineraryOptions) obj;
		if (cost == null) {
			if (other.cost != null)
				return false;
		} else if (!cost.equals(other.cost))
			return false;
		if (departureTimeOffset == null) {
			if (other.departureTimeOffset != null)
				return false;
		} else if (!departureTimeOffset.equals(other.departureTimeOffset))
			return false;
		if (legs == null) {
			if (other.legs != null)
				return false;
		} else if (!legs.equals(other.legs))
			return false;
		return true;
	}

	//overriding toString method for printing the object
	@Override
	public String toString() {
		return "ListAvailableItineraryOptions [cost=" + cost + ", departureTimeOffset=" + departureTimeOffset
				+ ", legs=" + legs + "]";
	}

	public static void main(String[] args) {

		//ListAvailableItineraryOptions optionsList = new ListAvailableItineraryOptions(500.99, 1, 1);

		//System.out.println(optionsList);
	}

}
