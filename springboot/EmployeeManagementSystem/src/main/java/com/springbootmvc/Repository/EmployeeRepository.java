package com.springbootmvc.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootmvc.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
     
}
