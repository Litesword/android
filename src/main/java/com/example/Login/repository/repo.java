package com.example.Login.repository;

import com.example.Login.model.addDepartment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface repo extends MongoRepository<addDepartment, String> {

}
