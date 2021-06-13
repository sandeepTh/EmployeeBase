package com.example.employeebase.repository;
import com.example.employeebase.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    @Override
    List<Employee> findAll();

    @Override
    Optional<Employee> findById(Integer aLong);

    @Override
    <S extends Employee> S save(S s);
}