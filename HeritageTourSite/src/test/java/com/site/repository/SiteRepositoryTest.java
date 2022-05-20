package com.site.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.site.model.Site;
@SpringBootTest
@ExtendWith(SpringExtension.class)

class SiteRepositoryTest {


		@Autowired
		private SiteRepository siteRepo;
		
		@Test
		public void givenSiteShouldReturnSiteObject() {
			Site d1=new Site(101201,101,"Jama Masjid","jaskd asd adja d asdmsa dJD");//user input
			siteRepo.save(d1); // data is saved into Database
			Site d2= siteRepo.findById(d1.getSiteCode()).get();//fetching the data from database
			assertNotNull(d2); //to check if it is returning the Department Object
			assertEquals(d1.getSiteName(),d2.getSiteName());

		}
		
		@Test
		public void getAllmustReturnAllsites() {
			Site d1=new Site(101201,101,"Jama Masjid","jaskd asd adja d asdmsa dJD");//user input
			Site d2=new Site(101203,101,"Red Fort","askd asd adfs dfsdja d asdmsa dJD"); //user input
			siteRepo.save(d1);//saving the data into repository/database
			siteRepo.save(d2);//saving the data into repository/database
			List<Site>deptList=(List<Site>)siteRepo.findAll();
			assertEquals("Jama Masjid",deptList.get(1).getSiteName());
			assertEquals(3,deptList.size());
		}
	}
