package com.example.demo.service;

import java.util.List;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;

@RestController
public class StudentController {
	
	@GetMapping("/employee")
	public List<Employee> getStudents() {
		return EmployeeDao.findAll();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getStudentById(@PathVariable(value = "id") int id) {
		return EmployeeDao.findById(id);
	}
	
	@GetMapping("/employee/{name}")
	public List<Employee> getStudentByName(@PathVariable(value = "name") String name) {
		return EmployeeDao.findByName(name);
	}
	
	@PostMapping("/employee")
	public Employee createPatient(@RequestBody Employee employee) {
		return EmployeeDao.save(employee);
	}
	
	@PutMapping("/employee/{id}")
    public Employee updatePatient(@PathVariable(value = "id") int employeeId,
                                           @RequestBody Employee employeeDetails) {

        Employee employee = EmployeeDao.findById(employeeId);

        employee.setName(employeeDetails.getName());
        employee.setCity(employeeDetails.getCity());
        
        Employee updatedEmployee = EmployeeDao.update(employee);
        return updatedEmployee;
    }
}
