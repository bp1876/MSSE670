package com.flightreservation.model.domain;

import java.io.Serializable;

public class Login implements Serializable {

	/**
	 * The following are the class variable and instance variables. Refer to class
	 * diagram on what should be included in this class
	 */
	private static final long serialVersionUID = 1L;

	private String userName;

	private String password;

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	// method to authenticate the user with a valid username and valid password
	public void authenticateUser(String userName, String password) {

		if ((userName == "brenda") & (password == "pass")) {

			System.out.println("Login Successful");
		} else {
			System.out.println("Login failed, please try again");
		}

	}

	// Constructor
	public Login(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	// validate method for JUint testing
	public boolean validate() {

		if (userName == "")
			return false;
		if (password == "")
			return false;

		return true;
	}

	// overriding the hashCode method
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	// overriding the equals method for JUnit testing
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Login other = (Login) obj;
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

	// overriding the toString method to print the object
	@Override
	public String toString() {
		return "Login [userName=" + userName + ", password=" + password + "]";
	}

	public static void main(String[] args) {

		Login login = new Login("brenda", "pass");

		System.out.println(login);

	}

}
