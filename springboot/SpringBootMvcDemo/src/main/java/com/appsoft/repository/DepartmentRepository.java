package com.appsoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appsoft.models.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
