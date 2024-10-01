package com.appsoft.services;

import java.util.List;

import org.hibernate.dialect.identity.CockroachDBIdentityColumnSupport;

import com.appsoft.models.Employee;

public interface EmployeeService {
	Employee addEmployee(Employee emp);

	List<Employee> getAllEmployees();

	Employee getEmployeeById(int id);

	void deleteEmployee(int id);

	Employee udpateEmployee(Employee emp);
}
