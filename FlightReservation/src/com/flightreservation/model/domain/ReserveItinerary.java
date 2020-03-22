package com.flightreservation.model.domain;

import java.io.Serializable;

public class ReserveItinerary extends ListAvailableItineraryOptions implements Serializable {

	/**
	 * 
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
	
	

	public ReserveItinerary(double cost, int departureTimeOffset, int legs, boolean selectList) {
		super(cost, departureTimeOffset, legs);
		this.selectList = selectList;
	}

	public void reserveFlight() {
		
		if(selectList == true) {
			
			System.out.println("List selected to be reserved: " + selectList);
		}
		
		else {
			
			System.out.println("Flight has not been reserved: " + selectList);
		}
	}
	
	public boolean validate() {
		
		if(selectList == false) return false;
		
		return true;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (selectList ? 1231 : 1237);
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
		if (selectList != other.selectList)
			return false;
		return true;
	}
	
	

	@Override
	public String toString() {
		return "ReserveItinerary [selectList=" + selectList + "]";
	}

	public static void main(String[] args) {
		
		ReserveItinerary reserveflight = new ReserveItinerary(522.97, 1, 1, true);
		
		System.out.println(reserveflight);
		
	}

}
