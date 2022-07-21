package com.krishantha.training.salesmanager;

import com.krishantha.training.salesmanager.config.ApplicationConfiguration;
import com.krishantha.training.salesmanager.model.Employee;
import com.krishantha.training.salesmanager.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {
    public static void main(String[] args) {

//        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        EmployeeService service1 = applicationContext.getBean("employeeService", EmployeeService.class);
        System.out.println(service1.toString());

        EmployeeService service2 = applicationContext.getBean("employeeService", EmployeeService.class);
        System.out.println(service2.toString());

        List<Employee> employeeList = service1.getAllEmployees();
        employeeList.forEach(employee -> {
            System.out.println(employee.getEmployeeName() + " at " + employee.getEmployeeLocation());
        });


    }
}
