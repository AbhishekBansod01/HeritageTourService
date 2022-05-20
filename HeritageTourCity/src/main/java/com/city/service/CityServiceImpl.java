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
	
	//definitions of the methods accessible for the Admin User  
	@Override
	public City addCity(City city) throws CityAlreadyExistsException{
		if(cityRepo.existsById(city.getCityCode()))
        {
            throw new CityAlreadyExistsException();
        }
        return cityRepo.save(city);

    }
		
	
	//get the data of all cities available
	@Override
	public List<City> getAllCities() {
		// TODO Auto-generated method stub
		return (List<City>) cityRepo.findAll();
	}

	//method will be used to delete city using city code
	@Override
	public void deleteCityByCityCode(int citycode)throws CityNotFound {
		cityRepo.deleteById(citycode);
        // TODO Auto-generated method stub
        Optional<City> cityDb = this.cityRepo.findById(citycode);
 
        if (cityDb.isPresent()) {

            this.cityRepo.delete(cityDb.get());
            
        } 
        else
        {
            throw new CityNotFound();
        }
    }

	
	//method used to update the citydata
	@Override
	public City updateCity(City city) {
		// TODO Auto-generated method stub
		City updateCity=cityRepo.save(city);
		return updateCity;
	}

	
//method used to get city via citycode
	 @Override
	    public Object getCityByCityCode(int cityCode) throws CityNotFound {
	        // TODO Auto-generated method stub
	        Optional<City> cityDB = this.cityRepo.findById(cityCode);

	            return cityDB.get();
		
		
	}
}