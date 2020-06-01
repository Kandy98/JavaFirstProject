package com.kandy.junit_week8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class EmployeeTest {
	
	AddEmployee list;
	Employee employee;
	
	@BeforeEach
	public void setup() {
		employee = new Employee(1, "Kandarp", "Delhi");
		list = new AddEmployee();
		list.addEmployee(employee);
	}

	@Test
	public void testValid() {
		Assertions.assertEquals(employee, list.getEmployee(1));
	}
	
	@Test
	public void testInvalid() {
		Assertions.assertEquals(null, list.getEmployee(2));
	}
	
	@AfterEach
	void teardown() {
		employee = null;
		list = null;
	}
}
