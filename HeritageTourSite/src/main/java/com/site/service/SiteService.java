package com.site.service;

import java.util.List;


import com.site.model.Site;

public interface SiteService {

	//admin performing methods/ method declaration
	public Site addSite(Site site) ;
	public List<Site> getAllSites();
	public void deleteSiteBySiteCode(int sitecode) ;
	public Site updateSite(Site site);
	public Object getSiteBySiteCode(int id);



}

	