package com.city.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.city.model.City;
import com.city.service.CityService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@ExtendWith(MockitoExtension.class)

public class CityControllerTest {

	@Autowired
	private static MockMvc mockMvc;
	
	@Mock
	private CityService cs;
	private City city;
	private List<City> CCList;
	
	@InjectMocks
	private CityController cc;
	
	@BeforeEach
	public void setup() {
		city=new City(101,"Raipur",20,36);
		mockMvc=MockMvcBuilders.standaloneSetup(cc).build();
	}
		// test cases on addcity
//		@Test
//		public void addCityControllerTest() throws Exception 
//		{
//			when(cs.addCity(any())).thenReturn(city);
//			mockMvc.perform(post("/city/ad/addcity")
//					.contentType(MediaType.APPLICATION_JSON)
//					.content(asJSONString(city)))
//					.andExpect(status().isCreated());
//			verify(cs,times(1)).addCity(any());
//		}

		//test case on getallcities
		@Test
		public void getAllCitiesControllerTest1() throws Exception
		{
			when(cs.getAllCities()).thenReturn(CCList);
			mockMvc.perform(MockMvcRequestBuilders.get("/city/ad/getallcities")
			.contentType(MediaType.APPLICATION_JSON)
			.content(asJSONString(city)))
			.andDo(MockMvcResultHandlers.print()); //print JSON object
			verify(cs,times(0)).getAllCities();
			
		}
		
		
		
		
		public static  String asJSONString(final Object obj) {
			try {
				return new ObjectMapper().writeValueAsString(obj);
			}catch(Exception e) {
				throw new RuntimeException(e);
			}
		

	}


}
