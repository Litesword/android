package com.example.Login.controller;

import com.example.Login.model.addDepartment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/add_department")
public class departmentControl {
    private final com.example.Login.service.service service;
    public departmentControl(com.example.Login.service.service service) {
        this.service = service;
    }


    @PostMapping
    public void postDetails(@RequestBody addDepartment userDetails) {
        service.addDetails(userDetails);

    }

    }
