package com.ust.employeehierarchy.model.types;

import com.ust.employeehierarchy.model.Employee;

public class Developer extends Employee {

    String programmingLanguage;

    public Developer(){ }

    public Developer(int id, String name, double salary, String location, String programmingLanguage) {
        super(id,name,salary,location);
        this.programmingLanguage = programmingLanguage;
    }

    public void printDetails(){
        System.out.println("Developer Details for employee - "+name);

        System.out.println("Employee ID: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Salary: "+salary);
        System.out.println("Employee Location: "+location);
        System.out.println("Programming Language : "+programmingLanguage);
    }
}
