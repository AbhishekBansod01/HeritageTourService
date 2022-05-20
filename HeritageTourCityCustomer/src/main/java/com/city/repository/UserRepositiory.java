package com.city.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.city.model.Users;

public interface UserRepositiory extends MongoRepository<Users, String> {
	Users findByuserName(String userName);
}
