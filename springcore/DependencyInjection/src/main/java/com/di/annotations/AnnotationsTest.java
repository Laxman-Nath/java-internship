package com.di.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class AnnotationsTest {
	public static void main(String[] args) {
       ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
       College college=context.getBean("college",College.class);
       College college2=context.getBean("college",College.class);
       college.printData();
       
       System.out.println(college);
       System.out.println(college2);
       
//       Student student=context.getBean("st1",Student.class);
//       student.printData();
       
	}
}
