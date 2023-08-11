package com.gkeexample.employeeservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class SalariedEmployee {
    private Integer id;
    private String name;
    private String dept;
    private Salary salary;

}
