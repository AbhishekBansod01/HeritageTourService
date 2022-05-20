package com.hotel.exception;

public class HotelAlreadyExistsException extends Exception{
	

	//Exception for if hotel is already exists
	private static final long serialVersionUID = 1L; //default constructor
	public HotelAlreadyExistsException() {
	super();
	// TODO Auto-generated constructor stub
	} //parameterized constructor
	public HotelAlreadyExistsException(String message) {
	super(message);
	// TODO Auto-generated constructor stub
	}


	

}
