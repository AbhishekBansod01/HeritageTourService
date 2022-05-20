package com.hotel.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.hotel.model.Hotel;

@SpringBootTest
@ExtendWith(SpringExtension.class)

class HotelRepositoryTest {

	@Autowired
	private HotelRepository hotelRepo;

	@Test
	public void givenHotelShouldReturnHotelObject() {
		Hotel d1 = new Hotel(101201301,101, "TajHotel", 12, 500);// user input
		hotelRepo.save(d1); // data is saved into Database
		Hotel d2 = hotelRepo.findById(d1.getHotelCode()).get();// fetching the data from database
		assertNotNull(d2); // to check if it is returning the Department Object
		assertEquals(d1.getHotelName(), d2.getHotelName());

	}

	@Test
	public void getAllmustReturnAllhotels() {
		Hotel d1 = new Hotel(101201301,101, "TajHotel", 12, 500);// user input
		Hotel d2 = new Hotel(101201303,101, "MumbaiHotel", 13, 600); // user input
		hotelRepo.save(d1);// saving the data into repository/database
		hotelRepo.save(d2);// saving the data into repository/database
		List<Hotel> deptList = (List<Hotel>) hotelRepo.findAll();
		assertEquals("TajHotel", deptList.get(0).getHotelName());
		assertEquals(11, deptList.size());
	}
}
