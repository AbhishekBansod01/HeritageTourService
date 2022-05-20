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
	@RequestMapping("/hotel/ad")
	public class HotelController {

		@Autowired
		private HotelService hotelServ;
		
		//methods accessible for the Admin
		@PostMapping("/addhotel")
		public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel) throws HotelAlreadyExistsException{
			return ResponseEntity.created(null).body(this.hotelServ.addHotel(hotel));
		}
		
		
		
		//GetMapping is used to get all the data from the database
		@GetMapping("/getallhotels")
		public ResponseEntity<List<Hotel>> getAllHotels(){
			return new ResponseEntity<List<Hotel>>((List<Hotel>)hotelServ.getAllHotels(),HttpStatus.OK);
		}
		
		
		//DeleteMapping is used to delete the data from the databsse
		@DeleteMapping("/deletehotel/{hotelCode}")
		public ResponseEntity<Void> deleteHotelByHotelCode(@PathVariable int hotelCode) throws HotelNotFound{
			hotelServ.deleteHotelByHotelCode(hotelCode);
			return ResponseEntity.noContent().build();
			
		}
		
		//Get Mapping is used to retrieve the data from the database
	    @GetMapping("/gethotel/{hotelCode}")
	    public ResponseEntity<Object> getHotelByHotelCode(@PathVariable int hotelCode ) throws HotelNotFound {
	        return ResponseEntity.ok().body(hotelServ.getHotelByHotelCode(hotelCode));
	    }
		
		
		//PutMapping is used to update the data
		@PutMapping("/updatehotel")
		public ResponseEntity<Hotel> updateHotel(@RequestBody Hotel hotel) throws HotelNotFound{
		Hotel updatedhotel=((HotelService) hotelServ).updateHotel(hotel);
		return new ResponseEntity<>(updatedhotel,HttpStatus.CREATED);
		
		}
		
		
	}


