package com.example.Login.service;

import com.example.Login.model.userRegistration;
import com.example.Login.repository.repository;
import org.springframework.stereotype.Service;

@Service
public class service {
    private final repository repository;

    public service(com.example.Login.repository.repository repository) {
        this.repository = repository;
    }

    public void postDetails(userRegistration userDetails){
        repository.insert(userDetails);
    }
}
