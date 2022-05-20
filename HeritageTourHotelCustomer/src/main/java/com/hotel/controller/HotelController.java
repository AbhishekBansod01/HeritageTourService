package com.hotel.controller;
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

import com.hotel.exception.HotelNotFound;
import com.hotel.exception.HotelAlreadyExistsException;
import com.hotel.model.Hotel;
import com.hotel.service.HotelService;

	@RestController
	@RequestMapping("/hotel/cu")
	public class HotelController {

		@Autowired
		private HotelService hotelServ;
		
		
		//GetMapping is used to get all the data from the database
		@GetMapping("/getallhotels")
		public ResponseEntity<List<Hotel>> getAllHotels(){
			return new ResponseEntity<List<Hotel>>((List<Hotel>)hotelServ.getAllHotels(),HttpStatus.OK);
		}

		//Get Mapping is used to retrieve the data from the database
	    @GetMapping("/gethotel/{hotelCode}")
	    public ResponseEntity<Object> getHotelByHotelCode(@PathVariable int hotelCode ) throws HotelNotFound {
	        return ResponseEntity.ok().body(hotelServ.getHotelByHotelCode(hotelCode));
	    }
		

		
	}


