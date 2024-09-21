package com.di.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
@Scope("prototype")
public class College {
	@Value("snsc")
	private String name;
	@Value("mnr")
	private String address;
	@Value("30")
	private int noOfStudents;
	@Autowired
	private Student student;
	@Autowired
//	@Qualifier("nepaliTeacher")
	private Teacher teacher;
//	private Teacher teacher;
     
//	public College(String name, String address, int noOfStudents) {
//		super();
//		this.name = name;
//		this.address = address;
//		this.noOfStudents = noOfStudents;
//	}

	public void printData() {
		System.out.println("Name=" + this.name);
		System.out.println("Address=" + this.address);
		System.out.println("No of students=" + this.noOfStudents);
		student.printData();
		teacher.teaching();
	}
}
