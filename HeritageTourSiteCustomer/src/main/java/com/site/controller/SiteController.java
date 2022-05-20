package com.site.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.site.model.Site;
import com.site.service.SiteService;


	@RestController
	@RequestMapping("/site/cu")
	public class SiteController {

		@Autowired
		private SiteService siteServ;

		@GetMapping("/getallsites")
		public ResponseEntity<List<Site>> getAllSites(){
			return new ResponseEntity<List<Site>>((List<Site>)siteServ.getAllSites(),HttpStatus.OK);
		}
		
		

	    @GetMapping("/getsite/{siteCode}")
	    public ResponseEntity<Object> getSiteBySiteCode(@PathVariable int siteCode )  {
	        return ResponseEntity.ok().body(siteServ.getSiteBySiteCode(siteCode));
	    }
		
		

		
	}


