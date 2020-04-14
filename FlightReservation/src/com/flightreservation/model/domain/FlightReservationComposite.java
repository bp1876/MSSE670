/**
 * 
 */
package com.flightreservation.model.domain;

import java.io.Serializable;

/**
 * @author Brenda Palmer
 *
 */
public class FlightReservationComposite implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Holds information for Customer Account credit card information
	 */
	private CustomerAccount ca;
	
	/**
	 * Holds information for login 
	 */
	private Login login;
	
	/**
	 * Holds information for search flight
	 */
	private SearchFlightInformation sfi;
	
	/**
	 * Holds information for options list
	 */
	private ListAvailableItineraryOptions laio;
	
	/**
	 * Holds information for reserve flight
	 */
	private ReserveItinerary ri;
	
	/**
	 * Holds information for book flight
	 */
	private BookItinerary book;

	/**
	 * @return the ca
	 */
	public CustomerAccount getCa() {
		return ca;
	}

	/**
	 * @param ca the ca to set
	 */
	public void setCa(CustomerAccount ca) {
		this.ca = ca;
	}

	/**
	 * @return the login
	 */
	public Login getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(Login login) {
		this.login = login;
	}

	/**
	 * @return the sfi
	 */
	public SearchFlightInformation getSfi() {
		return sfi;
	}

	/**
	 * @param sfi the sfi to set
	 */
	public void setSfi(SearchFlightInformation sfi) {
		this.sfi = sfi;
	}

	/**
	 * @return the laio
	 */
	public ListAvailableItineraryOptions getLaio() {
		return laio;
	}

	/**
	 * @param laio the laio to set
	 */
	public void setLaio(ListAvailableItineraryOptions laio) {
		this.laio = laio;
	}

	/**
	 * @return the ri
	 */
	public ReserveItinerary getRi() {
		return ri;
	}

	/**
	 * @param ri the ri to set
	 */
	public void setRi(ReserveItinerary ri) {
		this.ri = ri;
	}

	/**
	 * @return the book
	 */
	public BookItinerary getBook() {
		return book;
	}

	/**
	 * @param book the book to set
	 */
	public void setBook(BookItinerary book) {
		this.book = book;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String toString() {
		
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("\n CustomerAccount info: ");
		buffer.append(ca);
		buffer.append("\n Login info: ");
		buffer.append(login);
		buffer.append("\n Search Flight Information info: ");
		buffer.append(sfi);
		buffer.append("\n Options List info: ");
		buffer.append(laio);
		buffer.append("\n Reserve Flight info: ");
		buffer.append(ri);
		buffer.append("\n Book Flight info: ");
		buffer.append(book);
		
		
		return buffer.toString();
		
		
	}

	public void getLogin(String text, String text2) {
		// TODO Auto-generated method stub
		
	}

	public void setLogin(String text, String text2) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
