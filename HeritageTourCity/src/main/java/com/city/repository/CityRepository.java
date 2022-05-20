package com.city.repository;


//importing MongoRepository
import org.springframework.data.mongodb.repository.MongoRepository;

import com.city.model.City;

public interface CityRepository extends MongoRepository<City, Integer> {  //City is the class name , Integer =is the datatype of Primary key


}
