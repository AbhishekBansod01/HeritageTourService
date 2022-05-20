package com.site.controller;

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
import com.site.model.Site;
import com.site.service.SiteService;
@ExtendWith(MockitoExtension.class)

public class SiteControllerTest {

	@Autowired
	private static MockMvc mockMvc;
	
	@Mock
	private SiteService cs;
	private Site site;
	private List<Site> CCList;
	
	@InjectMocks
	private SiteController cc;
	
	@BeforeEach
	public void setup() {
		site=new Site(101201,101,"JamaMasjid","jaskd asd adja d asdmsa dJD");
		mockMvc=MockMvcBuilders.standaloneSetup(cc).build();
	}
		// test cases on addSite
		@Test
		public void addSiteControllerTest() throws Exception 
		{
			when(cs.addSite(any())).thenReturn(site);
			mockMvc.perform(post("/site/ad/addsite")
					.contentType(MediaType.APPLICATION_JSON)
					.content(asJSONString(site)))
					.andExpect(status().isCreated());
			verify(cs,times(1)).addSite(any());
		}

		//test case on getallSites
		@Test
		public void getAllSitesControllerTest1() throws Exception
		{
			when(cs.getAllSites()).thenReturn(CCList);
			mockMvc.perform(MockMvcRequestBuilders.get("/site/ad/getallsites")
			.contentType(MediaType.APPLICATION_JSON)
			.content(asJSONString(site)))
			.andDo(MockMvcResultHandlers.print()); //print JSON object
			verify(cs,times(1)).getAllSites();
			
		}
		
		
		
		
		public static  String asJSONString(final Object obj) {
			try {
				return new ObjectMapper().writeValueAsString(obj);
			}catch(Exception e) {
				throw new RuntimeException(e);
			}
		

	}


}
