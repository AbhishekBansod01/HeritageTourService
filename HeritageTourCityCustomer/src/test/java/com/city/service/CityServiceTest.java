package com.city.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.city.exception.CityAlreadyExistsException;
import com.city.exception.CityNotFound;
import com.city.model.City;
import com.city.repository.CityRepository;
@SpringBootTest
@ExtendWith(MockitoExtension.class)

class CityServiceTest {

	@Mock
	private CityRepository cr;
	@InjectMocks
	private CityServiceImpl csi;

//	@Test
//	public void testAddCountry() throws CityAlreadyExistsException {
//		City d1=new City(101,"Bangalore",23,45);//user input
//		when(cr.save(any())).thenReturn(d1);
//		csi.addCity(d1);//Data is saved in Database
//		verify(cr,times(1)).save(any());
//	}
	@Test
	public void testGetAllCountries() {
		City d1=new City(101,"Mumbai",23,43);//user input
		City d2=new City(102,"Chennai",12,14);//user input
		City d3=new City(103,"Delhi",18,10); //user input
		cr.save(d1);//saving the data into repository/database
		cr.save(d2);//saving the data into repository/database
		cr.save(d3);//saving the data into repository/database
		List<City>cList=new ArrayList<>();
		cList.add(d1);
		cList.add(d2);
		cList.add(d3);
		
		when(cr.findAll()).thenReturn(cList);
		List<City> cList1=csi.getAllCities();
		assertEquals(cList,cList1);
		verify(cr,times(1)).save(d1);
		verify(cr,times(1)).findAll();
		
	}
	

//	@Test
//	void testUpdateCity() throws CityAlreadyExistsException {
//		City d1=new City(101,"Bangalore",12,19);//user input
//		when(cr.save(d1)).thenReturn(d1);
//		csi.addCity(d1);//Data is updated in Database
//		verify(cr,times(1)).save(d1);
//	
//	}
	
		
}


