package com.appsoft.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.appsoft.models.Department;
import com.appsoft.services.DepartmentService;

import jakarta.servlet.http.HttpSession;

@Controller
public class DepartmentController {
	@Autowired
	private DepartmentService dpService;

	@GetMapping("department")
	public String getDepartment() {
		return "deptaddForm";
	}

	@PostMapping("department")
	public String saveDepartment(Model m, @ModelAttribute Department department) {
		if (this.dpService.addDepartment(department) != null) {
			m.addAttribute("success", "Department is added successfully!");
		} else {
			m.addAttribute("error", "Error adding department!");
		}
		return "deptaddForm";
	}

	@GetMapping("listDepts")
	public String getAllDepartments(Model m) {

		List<Department> departments = this.dpService.getDepartments();
		m.addAttribute("departments", departments);
		System.out.println(departments.isEmpty());
		return "deptList";

	}

	@GetMapping("editDepartment/{deptId}")
	public String editDepartment(@PathVariable int deptId, Model m) {
		Department dept = this.dpService.getDepartmentById(deptId);
		m.addAttribute("dept", dept);
		return "deptEditForm";
	}

	@PostMapping("saveDeptChanges")
	public String saveChanges(@ModelAttribute Department dept, HttpSession session) {
//		Department oldDepartment=this.dpService.getDepartmentById(deptId);
//		oldDepartment.setName(department.getName());
//		oldDepartment.setHod(department.getHod());
//		oldDepartment.setPhone(department.getPhone());
		if (this.dpService.updateDepartment(dept) != null) {
			session.setAttribute("success", "Department is successfully updated!");
		} else {
			session.setAttribute("error", "Error updating department!");
		}
		return "redirect:/listDepts";
	}

	@GetMapping("deleteDepartment/{deptId}")
	public String deleteDepartment(@PathVariable int deptId, Model m) {
		this.dpService.deleteDepartment(deptId);
		m.addAttribute("success", "Department is successfully deleted!");
		return "redirect:/listDepts";
	}
}
