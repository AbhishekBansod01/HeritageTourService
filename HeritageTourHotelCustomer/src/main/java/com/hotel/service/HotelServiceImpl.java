package com.hotel.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.hotel.exception.HotelAlreadyExistsException;
import com.hotel.exception.HotelNotFound;
import com.hotel.model.Hotel;
import com.hotel.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository hotelRepo;
	
//	
//	public HotelServiceImpl(HotelRepository hotelRepo) {
//		super();
//		this.hotelRepo = hotelRepo;
//	}


//	@Override
//	public Hotel addHotel(Hotel hotel) throws HotelAlreadyExistsException {
//		
//		
//		
//		// TODO Auto-generated method stub
//		
//		if(hotelRepo.existsById(hotel.getHotelCode()))
//        {
//            throw new HotelAlreadyExistsException();
//        }
//        return hotelRepo.save(hotel);
//
//    }
//
//		
	
	
	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return (List<Hotel>) hotelRepo.findAll();
	}

	
//	@Override
//	public void deleteHotelByHotelCode(int hotelcode) throws HotelNotFound {
//		// TODO Auto-generated method stub
//		hotelRepo.deleteById(hotelcode);
//		
//	
//		        // TODO Auto-generated method stub
//		        Optional<Hotel> hotelDb = this.hotelRepo.findById(hotelcode);
//		 
//		        if (hotelDb.isPresent()) {
//
//		            this.hotelRepo.delete(hotelDb.get());
//		        } 
//		        else
//		        {
//		            throw new HotelNotFound();
//		        }
//		    }
//		
//	
	
	 @Override
	    public Object getHotelByHotelCode(int id) throws HotelNotFound {
	        // TODO Auto-generated method stub
	        Optional<Hotel> hotelDB = this.hotelRepo.findById(id);

	            return hotelDB.get();
		
		
	}



//
//	 @Override
//		public Hotel updateHotel(Hotel hotel) throws HotelNotFound {
//			// TODO Auto-generated method stub
//			Hotel updateHotel=hotelRepo.save(hotel);
//			return updateHotel;
//		}



	
}
