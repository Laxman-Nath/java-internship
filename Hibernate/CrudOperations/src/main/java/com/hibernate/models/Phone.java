package com.hibernate.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="phone")
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String company;
	private long number;
	@ManyToOne
	@JoinColumn(name="employee_id")
	private Employee employee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	

	public Phone( String company, long number, Employee employee) {
		this.company = company;
		this.number = number;
		this.employee = employee;
	}

	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}

}
