package com.gkeexample.employeeservice.service;

import com.gkeexample.employeeservice.model.Employee;
import com.gkeexample.employeeservice.model.SalariedEmployee;
import com.gkeexample.employeeservice.model.Salary;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class EmployeeService {

    @Value("${salary-service-url}")
    private String salaryServiceUrl;

    private final RestTemplate restTemplate;

    public EmployeeService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Employee> getEmployeeList() {
        return List.of(new Employee(1,"John","Devops"),
                new Employee(2, "Jack", "Javascript"),
                new Employee(3, "Eva", "DB"));
    }

    public SalariedEmployee getEmployee() {
        Salary salary = restTemplate.getForObject(salaryServiceUrl, Salary.class);

        return new SalariedEmployee(2, "Jack", "Javascript", salary);
    }
}
