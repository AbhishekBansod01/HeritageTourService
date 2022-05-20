package com.city.exception;

public class CityAlreadyExistsException extends Exception{
	

	//Exception for if cityis already exists
	private static final long serialVersionUID = 1L; //default constructor
	public CityAlreadyExistsException() {
	super();
	// TODO Auto-generated constructor stub
	} //parameterized constructor
	public CityAlreadyExistsException(String message) {
	super(message);
	// TODO Auto-generated constructor stub
	}


	

}
