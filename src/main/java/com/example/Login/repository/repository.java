package com.example.Login.repository;
import com.example.Login.model.userRegistration;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface repository extends MongoRepository<userRegistration, String>{

}

