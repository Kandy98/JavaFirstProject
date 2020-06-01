package com.kandy.junit_week8;

import java.util.ArrayList;
import java.util.List;

public class AddEmployee {
	List<Employee> list = new ArrayList<>();
	
	public void addEmployee(Employee emp) {
		list.add(emp);
	}
	
	public Employee getEmployee(int id) {
		for(Employee em: list) {
			if(em.getId() == id) {
				return em;
			}
		}
		
		return null;
	}
}
