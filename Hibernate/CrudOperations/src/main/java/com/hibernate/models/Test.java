package com.hibernate.models;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import java.util.List;
import antlr.collections.List;


public class Test {
	public static void main(String[] args) {
//       add();
//		show();
//		delete();
		update();
	}
	
	public static void add() {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		
		Student student=new Student("bibek","airee",987123857);
		session.save(student);
		session.getTransaction().commit();
		session.close();
		
	}
	
	public static void show() {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Student.class);
//		List<Student> students=criteria.list();
//		System.out.println(students);
		criteria.add(Restrictions.eq("address", "mnr"));
		List<Student> students=criteria.list();
		System.out.println(students);
	}
	
	public static void delete() {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
	    Student student=(Student) session.get(Student.class, 3);
	    session.delete(student);
	    session.getTransaction().commit();
		session.close();
	}
	
	public static void update() {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
	    Student student=(Student) session.get(Student.class, 4);
	    student.setName("manoj");
	    student.setAddress("ktm");
	    session.update(student);
	    session.getTransaction().commit();
		session.close();
	}
}
