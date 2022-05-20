package com.city.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.city.model.City;
@SpringBootTest
@ExtendWith(SpringExtension.class)

class CityRepositoryTest {


		@Autowired
		private CityRepository cityRepo;
		
		@Test
		public void givenCityShouldReturnCityObject() {
			City d1=new City(101,"Ahmedabad",12,34);//user input
			cityRepo.save(d1); // data is saved into Database
			City d2= cityRepo.findById(d1.getCityCode()).get();//fetching the data from database
			assertNotNull(d2); //to check if it is returning the Department Object
			assertEquals(d1.getCityName(),d2.getCityName());

		}
		
		@Test
		public void getAllmustReturnAllcities() {
			City d1=new City(102,"SaudiArabia",24,56);//user input
			City d2=new City(103,"NorthKorea",49,62); //user input
			cityRepo.save(d1);//saving the data into repository/database
			cityRepo.save(d2);//saving the data into repository/database
			List<City>deptList=(List<City>)cityRepo.findAll();
			assertEquals("SaudiArabia",deptList.get(1).getCityName());
			assertEquals(8,deptList.size());
		}
	}
