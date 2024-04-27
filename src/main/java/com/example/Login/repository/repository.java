package com.example.Login.repository;
import com.example.Login.model.addDepartment;
import com.example.Login.model.userRegistration;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface repository extends MongoRepository<userRegistration, String>{
      userRegistration findByMobilePhone(String userName);

      void insert(addDepartment userDetails);

}

