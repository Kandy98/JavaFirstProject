package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import com.example.demo.model.Employee;

public class EmployeeDao {
public static List<Employee> employees = new ArrayList<>();

	static {
		employees.add(new Employee(1, "Kandarp Verma", "Delhi"));
		employees.add(new Employee(2, "Yogesh Aggarwal", "Delhi"));
	}
	
	public static List<Employee> findAll() {
		return employees;
	}
	
	public static Employee findById(int id) throws NoSuchElementException {
		for(Employee employee:employees) {
			if(employee.getId()==id) {
				return employee;
			}
		}
		
		throw new NoSuchElementException();
	}
	
	public static List<Employee> findByName(String name) {
		List<Employee> emp = new ArrayList<>();
		for(Employee employee: employees) {
			if(employee.getName() == name) {
				emp.add(employee);
			}
		}
		
		return emp;
	}

	public static Employee save(Employee employee) {
		employees.add(employee);
		return employee;
	}
	
	public static Employee update(Employee emp) {
		for(Employee employee:employees) {
			if(employee.getId()==emp.getId()) {
				employee.setName(emp.getName());
				employee.setCity(emp.getCity());
				return employee;
			}
		}
		return null;
	}
}
