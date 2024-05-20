package com.ust.employeehierarchy;

import com.ust.employeehierarchy.model.types.Developer;
import com.ust.employeehierarchy.model.Employee;
import com.ust.employeehierarchy.model.types.Manager;
import com.ust.employeehierarchy.service.EmployeeOperationImpl;
import com.ust.employeehierarchy.service.EmployeeOperations;

import java.util.Scanner;

public class EmployeeApp {

    public static void main(String[] args) {

        EmployeeRegistering.registerEmployee();

        EmployeeFetching.fetchEmployee();

    }

}
