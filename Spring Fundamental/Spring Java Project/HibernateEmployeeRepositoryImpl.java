package com.krishantha.training.salesmanager.respository;

import com.krishantha.training.salesmanager.model.Employee;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("hibernateRepo")
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {

    @Value("${name}")
    private String employeeName;
    @Value("${city}")
    private String employeeLocation;

    public List<Employee> getAllEmployees(){
        List<Employee> employeeList = new ArrayList<>();
        Employee employee = new Employee();
        employee.setEmployeeName(employeeName);
        employee.setEmployeeLocation(employeeLocation);
        employeeList.add(employee);
        return employeeList;
    }
}
