package com.afproject.app.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.afproject.app.user.model.Users;


public interface UserRepository extends MongoRepository<Users, String >{

}
