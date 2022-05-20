package com.hotel.service;

import java.util.List;

import com.hotel.exception.HotelAlreadyExistsException;
import com.hotel.exception.HotelNotFound;
import com.hotel.model.Hotel;

public interface HotelService {

	 
	//services that admin can access  
	public Hotel addHotel(Hotel hotel) throws HotelAlreadyExistsException;
	public List<Hotel> getAllHotels();
	public void deleteHotelByHotelCode(int hotelcode) throws HotelNotFound;
	public Hotel updateHotel(Hotel hotel) throws HotelNotFound;
	public Object getHotelByHotelCode(int id) throws HotelNotFound;
	


}

	