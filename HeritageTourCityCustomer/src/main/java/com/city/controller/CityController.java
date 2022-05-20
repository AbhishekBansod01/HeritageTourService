package com.city.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.city.exception.CityNotFound;
import com.city.model.City;
import com.city.service.CityService;



	@RestController
	@RequestMapping("/city/cu")
	public class CityController {

		@Autowired
		private CityService cityServ;
		
		//methods accessible for the customer
		
		//GetMapping is used to get all the data from the database
		@GetMapping("/getallcities")
		public ResponseEntity<List<City>> getAllCities(){
			return new ResponseEntity<List<City>>((List<City>)cityServ.getAllCities(),HttpStatus.OK);
		}
		
		
		//getting data on the bases of unique id
	    @GetMapping("/getcity/{cityCode}")
	    public ResponseEntity<Object> getCityByCityCode(@PathVariable int cityCode ) throws CityNotFound {
	        return ResponseEntity.ok().body(cityServ.getCityByCityCode(cityCode));
	    }
		
	    		
		
	}


