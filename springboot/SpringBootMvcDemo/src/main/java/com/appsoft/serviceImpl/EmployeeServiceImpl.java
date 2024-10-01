package com.appsoft.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsoft.models.Employee;
import com.appsoft.repository.EmployeeRepository;
import com.appsoft.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public Employee addEmployee(Employee emp) {

		return this.empRepo.save(emp);
	}

	@Override
	public List<Employee> getAllEmployees() {

		return this.empRepo.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {

		return this.empRepo.findById(id).get();
	}

	@Override
	public void deleteEmployee(int id) {
		this.empRepo.deleteById(id);
		;

	}

	@Override
	public Employee udpateEmployee(Employee emp) {

		return this.empRepo.save(emp);
	}

}
