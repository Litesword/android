package com.example.Login.service;

import com.example.Login.model.userRegistration;
import com.example.Login.repository.repository;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

@Service
public class service {
    private final repository repository;

    public service(com.example.Login.repository.repository repository) {
        this.repository = repository;
    }
    public userRegistration getDetails(String user){
        userRegistration Requser = repository.findByMobilePhone(user);
        return Requser;
    }
    public void postDetails(userRegistration userDetails){
        try{
            if(getDetails(userDetails.getMobilePhone())==null){
                repository.insert(userDetails);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
