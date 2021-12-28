package com.springbootcrudexample.Spring.Boot.Crud.Example.repository;

import com.springbootcrudexample.Spring.Boot.Crud.Example.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
