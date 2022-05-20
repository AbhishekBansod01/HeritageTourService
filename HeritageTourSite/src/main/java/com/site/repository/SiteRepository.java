package com.site.repository;


//importing mongo repository
import org.springframework.data.mongodb.repository.MongoRepository;

import com.site.model.Site;

public interface SiteRepository extends MongoRepository<Site, Integer> {


}
