package com.hotel.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hotel.model.Hotel;

public interface HotelRepository extends MongoRepository<Hotel, Integer> {

}

