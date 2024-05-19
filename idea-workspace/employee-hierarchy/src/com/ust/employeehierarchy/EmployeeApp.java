package com.ust.employeehierarchy;

import com.ust.employeehierarchy.model.types.Developer;
import com.ust.employeehierarchy.model.Employee;
import com.ust.employeehierarchy.model.types.Manager;
import com.ust.employeehierarchy.service.EmployeeOperationImpl;
import com.ust.employeehierarchy.service.EmployeeOperations;

import java.util.Scanner;

public class EmployeeApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Employee employee1 = new Manager(201,"Lokesh",87000,"Delhi",7);



        Employee employee2 = new Developer(501,"Karan",76000,"Bangalore","Java");

        EmployeeOperations employeeOperations = new EmployeeOperationImpl();

        employeeOperations.addEmployee(employee1);
        employeeOperations.addEmployee(employee2);

        employeeOperations.printAllEmployees();

//        System.out.println("Enter the id : ");
//        int id = scan.nextInt();
//
//
//        Employee emp = employeeOperations.getEmployee(id);
//
//        emp.printDetails();



    }

}
