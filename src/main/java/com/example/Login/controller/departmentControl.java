package com.example.Login.controller;

import com.example.Login.model.addDepartment;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/add_department")
public class departmentControl {
    private final com.example.Login.service.service service;
    public departmentControl(com.example.Login.service.service service) {
        this.service = service;
    }


    @PostMapping
    public void postDetails(@RequestBody addDepartment department) {
        service.addDetails(department);

    }
    @GetMapping("/{departmentName}")
    Collection<addDepartment> getDetails(@PathVariable  String departmentName){
        return service.getDepartments(departmentName);
    }
    }
