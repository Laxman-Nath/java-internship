package com.appsoft.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsoft.models.Department;
import com.appsoft.repository.DepartmentRepository;
import com.appsoft.services.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired 
	private DepartmentRepository departmentRepo;
	@Override
	public Department addDepartment(Department department) {
		
		return this.departmentRepo.save(department);
	}

	@Override
	public void deleteDepartment(int id) {
		this.departmentRepo.deleteById(id);
		
	}

	@Override
	public Department updateDepartment(Department department) {
		
		return this.departmentRepo.save(department);
	}

	@Override
	public List<Department> getDepartments() {
		
		return this.departmentRepo.findAll();
	}

	@Override
	public Department getDepartmentById(int id) {
	
		return this.departmentRepo.findById(id).orElse(null);
		// optional class in java
	}

}
