package com.example.demo.service;

import java.util.List;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;

@RestController
public class StudentController {
	
	@GetMapping("/student")
	public List<Student> getStudents() {
		return StudentDao.findAll();
	}
	
	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable(value = "id") int id) {
		return StudentDao.findById(id);
	}
}
