package com.city.service;

import java.util.List;

import com.city.exception.CityAlreadyExistsException;
import com.city.exception.CityNotFound;
import com.city.model.City;

public interface CityService {


	//public City addCity(City city) throws CityAlreadyExistsException;
	public List<City> getAllCities();
	public Object getCityByCityCode(int cityCode)throws CityNotFound;



}

	