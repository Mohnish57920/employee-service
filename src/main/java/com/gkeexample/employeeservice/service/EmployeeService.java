package com.gkeexample.employeeservice.service;

import com.gkeexample.employeeservice.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    public List<Employee> getEmployeeList() {
        return List.of(new Employee(1,"John","Devops"),
                new Employee(2, "Jack", "Javascript"),
                new Employee(3, "Eva", "DB"));
    }
}
