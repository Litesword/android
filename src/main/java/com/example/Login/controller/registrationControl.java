package com.example.Login.controller;
import com.example.Login.model.userRegistration;
import com.example.Login.service.service;
import org.springframework.web.bind.annotation.*;
import com.example.Login.model.userRegistration;
@RestController
@RequestMapping("/api/registrate")
public class registrationControl {
    private final service service;

    public registrationControl(com.example.Login.service.service service) {
        this.service = service;
    }

    @PostMapping
    public void postDetails(
            @RequestParam(name = "userName",required = false, defaultValue = "") String userName,
            @RequestParam(name = "email",required = false, defaultValue = "") String email,
            @RequestParam(name = "mobilePhone",required = true) String mobilePhone){

        // Create a userRegistration object from the received query parameters
        userRegistration userDetails = new userRegistration();
        userDetails.setUserName(userName);
        userDetails.setEmail(email);
        userDetails.setMobilePhone(mobilePhone);
        // Call the service method with the userRegistration object
        service.postDetails(userDetails);
    }

    @GetMapping("/{username}")

    public userRegistration getDetails(@PathVariable  String username){
      return service.getDetails(username);
    }
}

