package com.site.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.site.model.Site;
import com.site.repository.SiteRepository;

@Service
public class SiteServiceImpl implements SiteService {

	@Autowired
	private SiteRepository SiteRepo;

	
	
	@Override
	public List<Site> getAllSites() {
		// TODO Auto-generated method stub
		return (List<Site>) SiteRepo.findAll();
	}


	 @Override
	    public Object getSiteBySiteCode(int siteCode) {
	        // TODO Auto-generated method stub
	        Optional<Site> SiteDB = this.SiteRepo.findById(siteCode);

	            return SiteDB.get();
		
		
	}
}
