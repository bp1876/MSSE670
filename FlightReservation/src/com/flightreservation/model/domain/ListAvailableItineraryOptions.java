package com.flightreservation.model.domain;

import java.io.Serializable;
import java.util.ArrayList;

public class ListAvailableItineraryOptions implements Serializable {

	/**
	 * The following is the class variable for Serializable, along with the instance variables
	 * refer to class diagram, which defines what must be included in this class
	 */
	private static final long serialVersionUID = 1L;

	private double cost;

	private int departureTimeOffset;

	private int legs;

	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}

	/**
	 * @return the departureTimeOffset
	 */
	public int getDepartureTimeOffset() {
		return departureTimeOffset;
	}

	/**
	 * @param departureTimeOffset the departureTimeOffset to set
	 */
	public void setDepartureTimeOffset(int departureTimeOffset) {
		this.departureTimeOffset = departureTimeOffset;
	}

	/**
	 * @return the legs
	 */
	public int getLegs() {
		return legs;
	}

	/**
	 * @param legs the legs to set
	 */
	public void setLegs(int legs) {
		this.legs = legs;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	//Constructor 
	public ListAvailableItineraryOptions(double cost, int departureTimeOffset, int legs) {
		super();
		this.cost = cost;
		this.departureTimeOffset = departureTimeOffset;
		this.legs = legs;
	}

	//method to create a list of the available flight options
	public ArrayList<Object> optionsList(double cost, int departureTimeOffset, int legs) {

		SearchFlightInformation flightinfo = new SearchFlightInformation("031920", "5am", "DEN", "032020", "1pm", "AAA",
				2, false, true);

		ArrayList<Object> list = new ArrayList<Object>();

		while (flightinfo != null) {

			list.add(flightinfo);
			list.add(cost);
			list.add(departureTimeOffset);
			list.add(legs);

		}

		return list;
	}

	//validate method for JUnit testing
	public boolean validate() {

		if (cost == 0.00)
			return false;
		if (departureTimeOffset > 2)
			return false;
		if (legs > 2)
			return false;

		return true;
	}

	//overriding hashCode method 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + departureTimeOffset;
		result = prime * result + legs;
		return result;
	}

	//overriding equals method for JUnit testing
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListAvailableItineraryOptions other = (ListAvailableItineraryOptions) obj;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (departureTimeOffset != other.departureTimeOffset)
			return false;
		if (legs != other.legs)
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

		ListAvailableItineraryOptions optionsList = new ListAvailableItineraryOptions(500.99, 1, 1);

		System.out.println(optionsList);
	}

}
