package com.city.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.city.exception.CityAlreadyExistsException;
import com.city.exception.CityNotFound;
import com.city.model.City;
import com.city.service.CityService;



	@RestController						 //RestController
	@RequestMapping("/city/ad")  		//RequestMapping
	public class CityController {		//Creating a CityController Class
		
		
		//Autowiring done
		@Autowired							
		private CityService cityServ;
		
		
		
		
		//PostMapping//Create/add functionas will be performed using this
		@PostMapping("/addcity")			
		public ResponseEntity<City> addCity(@RequestBody City city) throws CityAlreadyExistsException{
			return ResponseEntity.created(null).body(this.cityServ.addCity(city));
		}
		
		
		//GetMapping is used to get the data from the database
		@GetMapping("/getallcities")		
		public ResponseEntity<List<City>> getAllCities(){
			return new ResponseEntity<List<City>>((List<City>)cityServ.getAllCities(),HttpStatus.OK);
		}
		
		

		//getting data on the bases of unique id
	    @GetMapping("/getcity/{cityCode}")					
	    public ResponseEntity<Object> getCityByCityCode(@PathVariable int cityCode ) throws CityNotFound {
	        return ResponseEntity.ok().body(cityServ.getCityByCityCode(cityCode));
	    }
	    
	    
	    

		
	  //DeleteMapping is used to perform delete operations
		@DeleteMapping("/deletecity/{cityCode}")				
		public ResponseEntity<Void> deleteCityByCityCode(@PathVariable int cityCode) throws CityNotFound{
			cityServ.deleteCityByCityCode(cityCode);
			return ResponseEntity.noContent().build();
			
		}
		//PutMapping is used to update the data
		@PutMapping("/updatecity")
		public ResponseEntity<City> updateCity(@RequestBody City city) throws CityNotFound{
		City updatedcity=((CityService) cityServ).updateCity(city);
		return new ResponseEntity<>(updatedcity,HttpStatus.CREATED);
		
		}
		
		
	}


