package com.city.repository;


//importing MongoRepository
import org.springframework.data.mongodb.repository.MongoRepository;

import com.city.model.City;

public interface CityRepository extends MongoRepository<City, Integer> {


}
