package com.employeeproject.demo.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeproject.demo.Model.Employee;
import com.employeeproject.demo.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository empRepo;


   

    @Override
    public List<Employee> getAllEmployee() {
        return empRepo.findAll();
    }

    @Override
    public void save(Employee employee) {
        if (Objects.nonNull(employee)){
            empRepo.save(employee);
        }
        
    }

    @Override
    public Employee getById(int id) {
        Employee emp = null;

        if (Objects.nonNull(id)){
            Optional<Employee> optionalEmployee = empRepo.findById(id);
            if(optionalEmployee.isPresent()){
                emp = optionalEmployee.get();
            }else{
                throw new RuntimeException("Employee with this id:"+ id +" is not found!");
            }
        }
        return emp ;
    }

    

    @Override
    public void deleteById(int id) {
        if(Objects.nonNull(id)){
            empRepo.deleteById(id);
        }
        
    }
    
}
