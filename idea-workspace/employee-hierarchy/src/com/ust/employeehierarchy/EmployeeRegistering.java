package com.ust.employeehierarchy;

import com.ust.employeehierarchy.model.Employee;
import com.ust.employeehierarchy.model.types.Developer;
import com.ust.employeehierarchy.model.types.Manager;
import com.ust.employeehierarchy.service.EmployeeOperationImpl;
import com.ust.employeehierarchy.service.EmployeeOperations;

public class EmployeeRegistering {

    public static void registerEmployee() {
        EmployeeOperations employeeOperations = EmployeeOperationImpl.getInstance();
        Employee employee1 = new Manager(201,"Lokesh",87000,"Delhi",7);
        Employee employee2 = new Developer(501,"Karan",76000,"Bangalore","Java");
        employeeOperations.addEmployee(employee1);
        employeeOperations.addEmployee(employee2);

    }

}
