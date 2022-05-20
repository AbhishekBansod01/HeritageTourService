package com.hotel.model;

import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.annotation.Id;


@Document(collection="HeritageHotel")
public class Hotel {
	@Id
	private int hotelCode;//101201301,101205309
	private int cityCode;
	private String hotelName;
	private int roomsAvailable;
	private int roomPrice; //per day
	
	
	
	//default constructor
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//parmeterized constructor
	public Hotel(int hotelCode, int cityCode, String hotelName, int roomsAvailable, int roomPrice) {
		super();
		this.hotelCode = hotelCode;
		this.cityCode = cityCode;
		this.hotelName = hotelName;
		this.roomsAvailable = roomsAvailable;
		this.roomPrice = roomPrice;
	}
	
	
	//getter and setters
	public int getHotelCode() {
		return hotelCode;
	}
	public void setHotelCode(int hotelCode) {
		this.hotelCode = hotelCode;
	}
	public int getCityCode() {
		return cityCode;
	}
	public void setCityCode(int cityCode) {
		this.cityCode = cityCode;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getRoomsAvailable() {
		return roomsAvailable;
	}
	public void setRoomsAvailable(int roomsAvailable) {
		this.roomsAvailable = roomsAvailable;
	}
	public int getRoomPrice() {
		return roomPrice;
	}
	public void setRoomPrice(int roomPrice) {
		this.roomPrice = roomPrice;
	}
	
	
	//toString method
	@Override
	public String toString() {
		return "Hotel [hotelCode=" + hotelCode + ", cityCode=" + cityCode + ", hotelName=" + hotelName
				+ ", roomsAvailable=" + roomsAvailable + ", roomPrice=" + roomPrice + "]";
	}
	
	
	
}
