package com.krishantha.training.salesmanager;

import com.krishantha.training.salesmanager.model.Employee;
import com.krishantha.training.salesmanager.respository.EmployeeRepository;
import com.krishantha.training.salesmanager.service.EmployeeService;
import com.krishantha.training.salesmanager.service.EmployeeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("ApplicationContext.xml");

        EmployeeService service = applicationContext.getBean("employeeService", EmployeeService.class);
        List<Employee> employeeList = service.getAllEmployees();
        employeeList.forEach(employee->{
            System.out.println(employee.getEmployeeName() +" at "+employee.getEmployeeLocation());
        });


    }
}
