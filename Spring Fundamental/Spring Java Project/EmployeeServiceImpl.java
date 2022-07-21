package com.krishantha.training.salesmanager.service;

import com.krishantha.training.salesmanager.model.Employee;
import com.krishantha.training.salesmanager.respository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {


    private EmployeeRepository employeeRepository;


    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        System.out.println("Overloaded Constructor Executed");
        this.employeeRepository = employeeRepository;
    }

    public EmployeeServiceImpl() {
        System.out.println("Default Constructor Executed");
    }

    @Autowired
    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        System.out.println("Setter Executed");
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }
}
