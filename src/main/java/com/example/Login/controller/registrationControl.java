package com.example.Login.controller;
import com.example.Login.model.userRegistration;
import com.example.Login.service.service;
import org.springframework.web.bind.annotation.*;
import com.example.Login.model.userRegistration;
@RestController
@RequestMapping("/api/registration")
public class registrationControl {
    private final service service;

    public registrationControl(com.example.Login.service.service service) {
        this.service = service;
    }

    @PostMapping
    public void postDetails(
            @RequestParam(name = "userName") String userName,
            @RequestParam(name = "email") String email,
            @RequestParam(name = "password") String password,
            @RequestParam(name = "mobilePhone") int mobilePhone,
            @RequestParam(name = "fullName") String fullName) {

        // Create a userRegistration object from the received query parameters
        userRegistration userDetails = new userRegistration();
        userDetails.setUserName(userName);
        userDetails.setEmail(email);
        userDetails.setPassword(password);
        userDetails.setMobilePhone(mobilePhone);
        userDetails.setFullName(fullName);

        // Call the service method with the userRegistration object
        service.postDetails(userDetails);
    }

    @GetMapping("/{username}")

    public userRegistration getDetails(@PathVariable  String username){
      return service.getDetails(username);
    }
}

