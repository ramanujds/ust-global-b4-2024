package com.ust.employeehierarchy.service;

import com.ust.employeehierarchy.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeOperationImpl implements  EmployeeOperations{

    List<Employee> employees = new ArrayList<>();

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public Employee getEmployee(int id) {
        return employees.stream().filter(e->e.getId()==id).findFirst().get();
    }

    @Override
    public void printAllEmployees() {
        employees.forEach(Employee::printDetails);
    }
}
