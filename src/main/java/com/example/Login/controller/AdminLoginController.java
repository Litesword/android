package com.example.Login.controller;

import com.example.Login.model.Admin;
import com.example.Login.model.addDepartment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/admin")
public class AdminLoginController {
    private final com.example.Login.service.service service;

    public AdminLoginController(com.example.Login.service.service service) {
        this.service = service;
    }

    @GetMapping("/{username}")
    Admin getDetails(@PathVariable String username){
        return service.getAdmin(username);
    }
}
