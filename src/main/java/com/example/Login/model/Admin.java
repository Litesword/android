package com.example.Login.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "adminRegistration")
public class Admin{
  private   String password;
    private String username;
    private String MobilePhone;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobilePhone() {
        return MobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        MobilePhone = mobilePhone;
    }

    public Admin(String password) {
        this.password = password;
    }
}
