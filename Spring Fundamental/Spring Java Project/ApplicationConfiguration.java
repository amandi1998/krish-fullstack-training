package com.krishantha.training.salesmanager.config;

import com.krishantha.training.salesmanager.service.EmployeeService;
import com.krishantha.training.salesmanager.service.EmployeeServiceImpl;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.krishantha")
@PropertySource("../application.properties")
public class ApplicationConfiguration {

    @Bean("employeeService")
//    @Scope("singleton")
    @Scope("prototype")
    public EmployeeService getEmployeeService() {
//        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
//        employeeService.setEmployeeRepository(getEmployeeRepository());
        return new EmployeeServiceImpl();
    }
    /*@Bean("employeeRepository")
    public EmployeeRepository getEmployeeRepository() {
        return new HibernateEmployeeRepositoryImpl();
    }*/

}
