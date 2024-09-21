package com.hibernate.models;

import java.util.List;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
	@OneToOne
	@JoinColumn(name="address_id")
	private Address address;
	
	@OneToMany(mappedBy = "employee")
	private List<Phone> phones;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public List<Phone> getPhone() {
		return phones;
	}
	public void setPhone(List<Phone> phones) {
		this.phones = phones;
	}
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
