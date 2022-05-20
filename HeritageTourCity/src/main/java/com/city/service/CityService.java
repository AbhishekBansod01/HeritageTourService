package com.city.service;

import java.util.List;

import com.city.exception.CityAlreadyExistsException;
import com.city.exception.CityNotFound;
import com.city.model.City;

public interface CityService {

//declaration of methods going to be defined in the implementation
	public City addCity(City city) throws CityAlreadyExistsException;
	public List<City> getAllCities();
	public void deleteCityByCityCode(int citycode) throws CityNotFound;
	public City updateCity(City city)throws CityNotFound;
	public Object getCityByCityCode(int cityCode)throws CityNotFound;



}

	