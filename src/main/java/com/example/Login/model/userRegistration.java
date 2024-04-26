package com.example.Login.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "UsersDetails")
public class userRegistration {
    private String email,userName;
    private String mobilePhone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
