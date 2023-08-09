package com.gkeexample.employeeservice.controller;

import com.gkeexample.employeeservice.model.Employee;
import com.gkeexample.employeeservice.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    private final EmployeeService employeeService;

    public Controller(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/get-employee-list")
    public List<Employee> getEmployeeList() {
        return employeeService.getEmployeeList();
    }
}
