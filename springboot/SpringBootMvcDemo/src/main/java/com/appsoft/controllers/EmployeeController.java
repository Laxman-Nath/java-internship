package com.appsoft.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.appsoft.models.Address;
import com.appsoft.models.Department;
import com.appsoft.models.Employee;
import com.appsoft.services.AddressService;
import com.appsoft.services.DepartmentService;
import com.appsoft.services.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService empService;
	@Autowired
	private AddressService adService;
	@Autowired
	private DepartmentService departmentService;

	@GetMapping("employee")
	public String getEmployee(Model m) {
		m.addAttribute("addresses", adService.getAddresses());
		m.addAttribute("depts", departmentService.getDepartments());
		return "empaddform";
	}

	@PostMapping("employee")
	public String postEmployee(@ModelAttribute Employee employee, Model m, @RequestParam Address add,
			@RequestParam List<Department> depts) {

		employee.setAddress(add);
		employee.setDepartments(depts);
		if (this.empService.addEmployee(employee) != null) {
			m.addAttribute("success", "Employee is successfully registered!");
		} else {

			m.addAttribute("error", "Error registering employee!");
		}

		return "empaddform";
	}

	@GetMapping("listEmployees")
	public String getAllEmployees(Model m) {
		List<Employee> emps = this.empService.getAllEmployees();
		m.addAttribute("emps", emps);
		return "emplist";
	}

	@GetMapping("editEmployee/{empId}")
	public String editEmployee(@PathVariable int empId, Model m) {
		m.addAttribute("addresses", adService.getAddresses());
		m.addAttribute("depts", departmentService.getDepartments());
		m.addAttribute("emp", this.empService.getEmployeeById(empId));
		return "empeditform";
	}

	@PostMapping("updateEmployee")
	public String saveUpdatedEmployee(@ModelAttribute Employee emp) {
		this.empService.udpateEmployee(emp);
		return "redirect:/listEmployees";
	}

	@GetMapping("deleteEmployee/{empId}")
	public String removeEmployee(@PathVariable int empId) {
		this.empService.deleteEmployee(empId);
		return "redirect:/listEmployees";
	}
}
