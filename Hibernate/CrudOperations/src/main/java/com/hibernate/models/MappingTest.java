package com.hibernate.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MappingTest {
	public static void main(String[] args) {
//      onetoone();
//		onetomany();
		manytomany();
	}

	public static void onetoone() {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.getCurrentSession();
		session.beginTransaction();

		Address address = new Address("nepal", "sudurpaschim", "mahendranagar");
		Employee employee = new Employee();
		employee.setName("Laxman");
		employee.setAge(23);
		employee.setAddress(address);
		session.save(employee);
		session.save(address);
		session.getTransaction().commit();
	}

	public static void onetomany() {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.getCurrentSession();
		session.beginTransaction();

		Address address = new Address("nepal", "sudurpaschim", "mahendranagar");
		session.save(address);
		
		Employee employee = new Employee();
		List<Phone> phones = new ArrayList<>();
        employee.setName("Laxman");
		employee.setAge(23);
		employee.setAddress(address);
		
		Phone phone1 = new Phone("ntc", 984737924, employee);
		Phone phone2 = new Phone("ncell", 980974853, employee);
		session.save(phone1);
		session.save(phone2);
		
		phones.add(phone1);
		phones.add(phone2);
		employee.setPhone(phones);
		
		
	
		session.save(employee);
		
		session.getTransaction().commit();
//		session.close();
	}
	
	public static void manytomany() {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.getCurrentSession();
		session.beginTransaction();

		Address address = new Address("nepal", "sudurpaschim", "mahendranagar");
		session.save(address);
		
		Employee employee1 = new Employee();
		List<Phone> phones = new ArrayList<>();
        employee1.setName("Laxman");
		employee1.setAge(23);
		employee1.setAddress(address);
		
		Phone phone1 = new Phone("ntc", 984737924, employee1);
		Phone phone2 = new Phone("ncell", 980974853, employee1);
		session.save(phone1);
		session.save(phone2);
		
		phones.add(phone1);
		phones.add(phone2);
		employee1.setPhone(phones);
		
		
	
		session.save(employee1);
		
		Address address2 = new Address("nepal", "sudurpaschim", "dhangadi");
		session.save(address2);
		
		Employee employee2 = new Employee();
		List<Phone> phones2 = new ArrayList<>();
        employee2.setName("rohit");
		employee2.setAge(25);
		employee2.setAddress(address2);
		
		Phone phone3 = new Phone("ntc", 984737924, employee1);
		Phone phone4 = new Phone("ncell", 980974853, employee1);
		session.save(phone3);
		session.save(phone4);
		
		phones2.add(phone3);
		phones2.add(phone4);
		employee2.setPhone(phones);
		
		
	
		session.save(employee2);
		
		Department department=new Department();
		department.setName("HR");
		department.setHod("bhim");
		department.setEmployees(Arrays.asList(employee1,employee2));
		session.save(department);
		
		session.getTransaction().commit();
	}
}
