package com.SpringbootMongoDB.repository;

import com.SpringbootMongoDB.model.Items;
import com.SpringbootMongoDB.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
public interface ItemRepository extends MongoRepository<Items, String> {

    public Items findByItemName(String ItemName);
    public List<Items> findBy(String email);

}

