package com.di.models;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student st1 = context.getBean("st1", Student.class);
		Student st2 = context.getBean("st2", Student.class);
		Employee emp1=context.getBean("emp1",Employee.class);
		Employee emp2=context.getBean("emp2",Employee.class);
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(emp1);
		System.out.println(emp2);
	}
}
