package com.city.model;

import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.annotation.Id;


@Document(collection="HeritageCity")
public class City {
	
	//Attributes
	@Id
	private int cityCode;
	private String cityName;
	private int nuHotels;
	private int nuSites;
	
	
	//Parameterized constructor 
	public City(int cityCode, String cityName, int nuHotels, int nuSites) {
		super();
		this.cityCode = cityCode;
		this.cityName = cityName;
		this.nuHotels = nuHotels;
		this.nuSites = nuSites;
	}
	
	
	//default constructor
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	//getters and setters
	public int getCityCode() {
		return cityCode;
	}
	public void setCityCode(int cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getNuHotels() {
		return nuHotels;
	}
	public void setNuHotels(int nuHotels) {
		this.nuHotels = nuHotels;
	}
	public int getNuSites() {
		return nuSites;
	}
	public void setNuSites(int nuSites) {
		this.nuSites = nuSites;
	}
	
	
	//toString Method
	@Override
	public String toString() {
		return "City [cityCode=" + cityCode + ", cityName=" + cityName + ", nuHotels=" + nuHotels + ", nuSites="
				+ nuSites + "]";
	}
	
}
