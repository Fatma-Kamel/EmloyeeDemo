package com.employeeproject.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.employeeproject.demo.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee , Integer>{
    
}
