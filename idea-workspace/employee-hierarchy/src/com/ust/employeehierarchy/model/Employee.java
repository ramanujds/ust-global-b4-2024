package com.ust.employeehierarchy.model;

public abstract class Employee {
    protected int id;
    protected String name;
    protected double salary;
    protected String location;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employee(){

     }

    public Employee(int id, String name, double salary, String location) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.location = location;
    }

    public abstract void printDetails();
}
