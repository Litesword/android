package com.example.Login.controller;
import com.example.Login.model.userRegistration;
import com.example.Login.service.service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/registration")
public class registrationControl {
    private final service service;

    public registrationControl(com.example.Login.service.service service) {
        this.service = service;
    }

    public userRegistration getdetails(){
       return null;
    }
    @PostMapping
    public void postDetails(@RequestBody userRegistration userDetails){
        service.postDetails(userDetails);
    }
}
