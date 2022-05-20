package com.example.springbootthymeleafwebapp.service;

import com.example.springbootthymeleafwebapp.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
}
