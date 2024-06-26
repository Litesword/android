package com.example.Login.service;
import com.example.Login.model.Admin;
import com.example.Login.repository.AdminRepo;
import com.example.Login.repository.repo;
import com.example.Login.model.addDepartment;
import com.example.Login.model.userRegistration;
import com.example.Login.repository.repository;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class service {
    private final repository repository;
    private final repo repo;
    private final AdminRepo AdminRepo;
    public service(com.example.Login.repository.repository repository, com.example.Login.repository.repo repo, com.example.Login.repository.AdminRepo adminRepo) {
        this.repository = repository;
        this.repo = repo;
        this.AdminRepo = adminRepo;
    }
    public userRegistration getDetails(String user){
        userRegistration Requser = repository.findByMobilePhone(user);
        return Requser;
    }
    public userRegistration deleteDetails(String user){
        userRegistration Requser = repository.deleteByMobilePhone(user);
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
    public void addDetails(addDepartment userDetails){

        try{
                repo.insert(userDetails);
            }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public List<addDepartment> getDepartments(String username) {
       return  repo.findAllByPaper(username);

    }

    public Admin getAdmin(String username){
        return AdminRepo.findByUsername(username);
    }
}
