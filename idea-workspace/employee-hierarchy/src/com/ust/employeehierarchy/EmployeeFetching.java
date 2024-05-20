package com.ust.employeehierarchy;

import com.ust.employeehierarchy.service.EmployeeOperationImpl;
import com.ust.employeehierarchy.service.EmployeeOperations;

public class EmployeeFetching {

    public static void fetchEmployee() {
        EmployeeOperations employeeOperations = EmployeeOperationImpl.getInstance();

        employeeOperations.printAllEmployees();

    }

}
