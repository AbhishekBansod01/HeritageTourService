package com.site.model;

import org.springframework.data.mongodb.core.mapping.Document;



import org.springframework.data.annotation.Id;



@Document(collection="HeritageSite")
public class Site {
	@Id
	private int siteCode;//101201,101202,101203
	private int cityCode;//101
	private String siteName;
	private String sitedescription;
	public Site() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Site(int siteCode, int cityCode, String siteName, String sitedescription) {
		super();
		this.siteCode = siteCode;
		this.cityCode = cityCode;
		this.siteName = siteName;
		this.sitedescription = sitedescription;
	}
	public int getSiteCode() {
		return siteCode;
	}
	public void setSiteCode(int siteCode) {
		this.siteCode = siteCode;
	}
	public int getCityCode() {
		return cityCode;
	}
	public void setCityCode(int cityCode) {
		this.cityCode = cityCode;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	public String getSitedescription() {
		return sitedescription;
	}
	public void setSitedescription(String sitedescription) {
		this.sitedescription = sitedescription;
	}
	@Override
	public String toString() {
		return "Site [siteCode=" + siteCode + ", cityCode=" + cityCode + ", siteName=" + siteName + ", sitedescription="
				+ sitedescription + "]";
	}
	
	
	
	
}
