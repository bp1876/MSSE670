package com.flightreservation.model.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 * @author Brenda Palmer
 *
 */
public class CustomerAccount implements Serializable {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	private String name;

	private String address;

	private String email;

	private int creditCardSixteenNumber;

	private int creditCardExpireDate;

	private String userName;

	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCreditCardSixteenNumber() {
		return creditCardSixteenNumber;
	}

	public void setCreditCardSixteenNumber(int creditCardSixteenNumber) {
		this.creditCardSixteenNumber = creditCardSixteenNumber;
	}

	public int getCreditCardExpireDate() {
		return creditCardExpireDate;
	}

	public void setCreditCardExpireDate(int creditCardExpireDate) {
		this.creditCardExpireDate = creditCardExpireDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public boolean validate() {

		if (name == "")
			return false;
		if (address == "")
			return false;
		if (email == "")
			return false;
		if (creditCardSixteenNumber == 0)
			return false;
		if (creditCardExpireDate == 0)
			return false;
		if (userName == "")
			return false;
		if (password == "")
			return false;

		return true;
	}

	



	/**
	 * @param name
	 * @param address
	 * @param email
	 * @param creditCardSixteenNumber
	 * @param creditCardExpireDate
	 * @param userName
	 * @param password
	 */
	public CustomerAccount(String name, String address, String email, int creditCardSixteenNumber,
			int creditCardExpireDate, String userName, String password) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.creditCardSixteenNumber = creditCardSixteenNumber;
		this.creditCardExpireDate = creditCardExpireDate;
		this.userName = userName;
		this.password = password;
	}

	public void registerCustomer() {

		CustomerAccount ca = new CustomerAccount(name, address, email, creditCardExpireDate, creditCardExpireDate,
				userName, password);

		ArrayList<CustomerAccount> list = new ArrayList<CustomerAccount>();

		list.add(ca);

	}

	public void registerCreditCardInformation(int creditCardSixteenNumber, int creditCardExpireDate) {

		Pattern num = Pattern.compile("(creditCardSixteenNumber)( \\d{16})");

		Pattern expire = Pattern.compile("(creditCardExpireDate)( \\d{4})");

		ArrayList<Pattern> list = new ArrayList<Pattern>();

		list.add(num);
		list.add(expire);

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + creditCardExpireDate;
		result = prime * result + creditCardSixteenNumber;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
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
		CustomerAccount other = (CustomerAccount) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (creditCardExpireDate != other.creditCardExpireDate)
			return false;
		if (creditCardSixteenNumber != other.creditCardSixteenNumber)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CustomerAccount [name=" + name + ", address=" + address + ", email=" + email
				+ ", creditCardSixteenNumber=" + creditCardSixteenNumber + ", creditCardExpireDate="
				+ creditCardExpireDate + ", userName=" + userName + ", password=" + password + "]";
	}

	public static void main(String[] args) {

		CustomerAccount customer = new CustomerAccount("brenda", "1234 place", "me@aol.com", 16, 4, "user", "pass");

		System.out.println(customer);
	}

}