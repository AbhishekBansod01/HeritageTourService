package com.site.service;

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

import com.site.exception.SiteAlreadyExistsException;
import com.site.exception.SiteNotFound;
import com.site.model.Site;
import com.site.repository.SiteRepository;
@SpringBootTest
@ExtendWith(MockitoExtension.class)

class SiteServiceTest {

	@Mock
	private SiteRepository cr;
	@InjectMocks
	private SiteServiceImpl csi;

	@Test
	public void testAddCountry() throws SiteAlreadyExistsException {
		Site d1=new Site(101201,101,"JamaMasjid","jaskd asd adja d asdmsa dJD");//user input
		when(cr.save(any())).thenReturn(d1);
		csi.addSite(d1);//Data is saved in Database
		verify(cr,times(1)).save(any());
	}
	@Test
	public void testGetAllCountries() {
		Site d1=new Site(101201,101,"JamaMasjid","jaskd asd adja d asdmsa dJD");//user input
		Site d2=new Site(101202,101,"RedFort","xabsdmadna dadasd addsdasd");//user input
		Site d3=new Site(101203,101,"QutubMinar","djabdj dadbad ADAD AD Dad"); //user input
		cr.save(d1);//saving the data into repository/database
		cr.save(d2);//saving the data into repository/database
		cr.save(d3);//saving the data into repository/database
		List<Site>cList=new ArrayList<>();
		cList.add(d1);
		cList.add(d2);
		cList.add(d3);
		
		when(cr.findAll()).thenReturn(cList);
		List<Site> cList1=csi.getAllSites();
		assertEquals(cList,cList1);
		verify(cr,times(1)).save(d1);
		verify(cr,times(1)).findAll();
		
	}
	

	@Test
	void testUpdateSite() throws SiteAlreadyExistsException {
		Site d1=new Site(101201,101,"JamaMasjid","jaskd asd adja d asdmsa dJD");//user input
		when(cr.save(d1)).thenReturn(d1);
		csi.addSite(d1);//Data is updated in Database
		verify(cr,times(1)).save(d1);
	
	}
	
		
}


