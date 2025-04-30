package com.employeeproject.demo.service;

import java.util.List;

import com.employeeproject.demo.Model.Employee;

public interface EmployeeService {
    List<Employee> getAllEmployee();

    void save(Employee employee);

    Employee getById(int id);

    void deleteById(int id);
    
}
