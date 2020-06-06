package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import com.example.demo.model.Student;

public class StudentDao {
public static List<Student> students = new ArrayList<>();

	static {
		students.add(new Student(1, "Kandarp Verma", "Delhi"));
		students.add(new Student(2, "Yogesh Aggarwal", "Delhi"));
	}
	
	public static List<Student> findAll() {
		return students;
	}
	
	public static Student findById(int id) throws NoSuchElementException {
		for(Student student:students) {
			if(student.getId()==id) {
				return student;
			}
		}
		
		throw new NoSuchElementException();
	}
	
	public List<Student> findByCity(String city) {
		List<Student> stu = new ArrayList<>();
		for(Student student: students) {
			if(student.getCity() == city) {
				stu.add(student);
			}
		}
		
		return stu;
	}
}
