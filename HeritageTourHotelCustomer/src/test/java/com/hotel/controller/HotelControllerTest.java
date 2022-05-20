package com.hotel.controller;

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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hotel.model.Hotel;
import com.hotel.service.HotelService;
@ExtendWith(MockitoExtension.class)

public class HotelControllerTest {

	@Autowired
	private static MockMvc mockMvc;
	
	@Mock
	private HotelService cs;
	private Hotel hotel;
	private List<Hotel> CCList;
	
	@InjectMocks
	private HotelController cc;
	
	@BeforeEach
	public void setup() {
		hotel=new Hotel(101201301,101, "TajHotel", 12, 500);
		mockMvc=MockMvcBuilders.standaloneSetup(cc).build();
	}
	

		//test case on getallHotels
		@Test
		public void getAllHotelsControllerTest1() throws Exception
		{
			when(cs.getAllHotels()).thenReturn(CCList);
			mockMvc.perform(MockMvcRequestBuilders.get("/hotel/cu/getallhotels")
			.contentType(MediaType.APPLICATION_JSON)
			.content(asJSONString(hotel)))
			.andDo(MockMvcResultHandlers.print()); //print JSON object
			verify(cs,times(1)).getAllHotels();
			
		}
		
		
		
		
		public static  String asJSONString(final Object obj) {
			try {
				return new ObjectMapper().writeValueAsString(obj);
			}catch(Exception e) {
				throw new RuntimeException(e);
			}
		

	}


}
