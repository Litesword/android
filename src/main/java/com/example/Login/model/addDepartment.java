package com.example.Login.model;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Departments")
public class addDepartment {
    private String departmentName,paper;


    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public String getPaper() {
        return paper;
    }
    public void setPaper(String paper) {
        this.paper = paper;
    }
}
