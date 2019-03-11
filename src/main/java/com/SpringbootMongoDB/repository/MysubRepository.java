package com.SpringbootMongoDB.repository;

import com.SpringbootMongoDB.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MysubRepository extends MongoRepository<User, String> {

}
