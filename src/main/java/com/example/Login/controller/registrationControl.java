package com.example.Login.controller;
import com.example.Login.model.userRegistration;
import com.example.Login.service.service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/registration")
public class registrationControl {
    private final service service;

    public registrationControl(com.example.Login.service.service service) {
        this.service = service;
    }

    @PostMapping
    public void postDetails(@RequestBody userRegistration userDetails){
        service.postDetails(userDetails);
    }
    @GetMapping("/{username}")

    public userRegistration getDetails(@PathVariable  String username){
      return service.getDetails(username);
    }
}

