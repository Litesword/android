package com.example.Login.repository;

import com.example.Login.model.Admin;
import com.example.Login.model.userRegistration;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdminRepo extends MongoRepository<Admin, String>  {
     Admin findByUsername(String username);
}
