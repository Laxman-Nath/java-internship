package com.appsoft.services;

import java.util.List;

import com.appsoft.models.Department;

public interface DepartmentService {
  Department addDepartment(Department department);
  void deleteDepartment(int id);
  Department updateDepartment(Department department);
  List<Department> getDepartments();
  Department getDepartmentById(int id);
}
