package com.appsoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appsoft.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
