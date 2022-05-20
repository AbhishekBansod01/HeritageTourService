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
	
	
	//adding sites into the database
	@Override
	public Site addSite(Site site) {
		
        return SiteRepo.save(site);

    }
		
	
	//getting all sites's data
	@Override
	public List<Site> getAllSites() {
		// TODO Auto-generated method stub
		return (List<Site>) SiteRepo.findAll();
	}

	
	//deleteing site using site code
	@Override
	public void deleteSiteBySiteCode(int Sitecode){
		SiteRepo.deleteById(Sitecode);
        // TODO Auto-generated method stub
        Optional<Site> SiteDb = this.SiteRepo.findById(Sitecode);

            this.SiteRepo.delete(SiteDb.get());
            
	}
	
	//update using respective data
	@Override
	public Site updateSite(Site site) {
		// TODO Auto-generated method stub
		Site updateSite=SiteRepo.save(site);
		return updateSite;
	}

	//getting data using site code

	 @Override
	    public Object getSiteBySiteCode(int id) {
	        // TODO Auto-generated method stub
	        Optional<Site> SiteDB = this.SiteRepo.findById(id);

	            return SiteDB.get();
		
		
	}
}
