package com.city.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.city.exception.CityAlreadyExistsException;
import com.city.exception.CityNotFound;
import com.city.model.City;
import com.city.repository.CityRepository;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityRepository cityRepo;
	
	
	
	@Override
	public List<City> getAllCities() {
		// TODO Auto-generated method stub
		return (List<City>) cityRepo.findAll();
	}


	 @Override
	    public Object getCityByCityCode(int cityCode) throws CityNotFound {
	        // TODO Auto-generated method stub
	        Optional<City> cityDB = this.cityRepo.findById(cityCode);

	            return cityDB.get();
		
		
	}
}