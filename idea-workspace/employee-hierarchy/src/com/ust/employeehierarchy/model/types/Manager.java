package com.ust.employeehierarchy.model.types;

import com.ust.employeehierarchy.model.Employee;

public class Manager extends Employee {


    int teamSize;

    public Manager(){ };

    public Manager(int id, String name, double salary, String location, int teamSize) {
        super(id,name,salary,location);
        this.teamSize = teamSize;
    }

    public void printDetails(){
        System.out.println("Manager Details for employee - "+name);
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Salary: "+salary);
        System.out.println("Employee Location: "+location);
        System.out.println("Team Size : "+teamSize);
    }
}
