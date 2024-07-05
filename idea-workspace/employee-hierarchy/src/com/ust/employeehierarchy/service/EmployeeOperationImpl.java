package com.ust.employeehierarchy.service;

import com.ust.employeehierarchy.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeOperationImpl implements  EmployeeOperations{

    List<Employee> employees;

    private static EmployeeOperationImpl employeeOperation;

    public static EmployeeOperationImpl getInstance(){
        if (employeeOperation == null) {
            employeeOperation = new EmployeeOperationImpl();
        }
        return employeeOperation;
    }

    private EmployeeOperationImpl(){
        employees = new ArrayList<>();
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public Employee getEmployee(int id) {
        return employees.stream().filter(e->e.getId()==id).findFirst().orElse(null);
    }

    @Override
    public void printAllEmployees() {
        employees.forEach(Employee::printDetails);
    }

    @Override
    public Employee getEmployeeByName(String name) {
        return employees.parallelStream().filter(e->e.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
    }
}
