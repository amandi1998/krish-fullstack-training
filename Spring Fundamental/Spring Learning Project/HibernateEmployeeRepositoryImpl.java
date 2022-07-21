package com.krishantha.training.salesmanager.respository;

import com.krishantha.training.salesmanager.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {

    public List<Employee> getAllEmployees(){
        List<Employee> employeeList = new ArrayList<>();
        Employee employee = new Employee();
        employee.setEmployeeName("Chanuka");
        employee.setEmployeeLocation("Homagama");
        employeeList.add(employee);
        return employeeList;
    }
}
