package com.example.Login.repository;

import com.example.Login.model.addDepartment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface repo extends MongoRepository<addDepartment, String> {

    List<addDepartment> findAllByPaper(String username);
}
