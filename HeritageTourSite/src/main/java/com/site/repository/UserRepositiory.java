package com.site.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.site.model.Users;

public interface UserRepositiory extends MongoRepository<Users, String> {
	Users findByuserName(String userName);
}
