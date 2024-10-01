package com.springbootmvc.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springbootmvc.models.Student;

public interface StudentRepositry extends JpaRepository<Student, Integer> {
	Student findByNameAndPassword(String name, String password);
	
	@Query("FROM Student WHERE name=:n and password=:p")
	Student getStudent(String n,String p);
	
	@Query(value="SELECT * FROM student_table where name=:n and password=:p",nativeQuery = true)
	Student  getStudentByNameAndPassword(String n,String p);
	
	boolean existsByName(String name);
	
	
}
