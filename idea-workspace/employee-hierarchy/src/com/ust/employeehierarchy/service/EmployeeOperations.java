package com.ust.employeehierarchy.service;

import com.ust.employeehierarchy.model.Employee;

public interface EmployeeOperations {

    void addEmployee(Employee employee);

    Employee getEmployee(int id);

    void printAllEmployees();

    Employee getEmployeeByName(String name);

}
