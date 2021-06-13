package com.example.employeebase.controller;

import com.example.employeebase.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.employeebase.Employee;

import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository repository;

    @PostMapping("/employee")
    public void addEmployee(@RequestBody Employee employee){
        repository.save(employee);
    }

    @RequestMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id")Integer id){
      Optional<Employee> employee =  repository.findById(id);
        if (employee.isPresent()) {
            return new ResponseEntity<>(employee.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
      }
}
