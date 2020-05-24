package model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeBeanFactory {

	@Bean(name="emp1")
	public Employee emp1() {
		Employee emp = new Employee();
		
		emp.setId(1);
		emp.setName("kandarp verma");
		emp.setCity("delhi");
		
		return emp;
	}
	
	@Bean(name="emp2")
	public Employee emp2() {
		Employee emp = new Employee();
		
		emp.setId(2);
		emp.setName("satish jain");
		emp.setCity("gurugram");
		
		return emp;
	}
	
	@Bean(name="emp3")
	public Employee emp3() {
		Employee emp = new Employee();
		
		emp.setId(3);
		emp.setName("yogesh agarwal");
		emp.setCity("delhi");
		
		return emp;
	}
	
	@Bean(name="emp4")
	public Employee emp4() {
		Employee emp = new Employee();
		
		emp.setId(4);
		emp.setName("sahil kumar");
		emp.setCity("bangalore");
		
		return emp;
	}
	
	@Bean(name="emp5")
	public Employee emp5() {
		Employee emp = new Employee();
		
		emp.setId(5);
		emp.setName("hitesh gautam");
		emp.setCity("pune");
		
		return emp;
	}
}
