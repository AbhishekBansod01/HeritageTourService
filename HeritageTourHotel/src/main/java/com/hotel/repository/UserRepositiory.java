package com.hotel.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.hotel.model.Users;

public interface UserRepositiory extends MongoRepository<Users, String> {
	Users findByuserName(String userName);
}
