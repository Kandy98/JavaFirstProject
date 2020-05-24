package model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRunner {

	public static void main(String[] args) {
		
		ApplicationContext context1 = new ClassPathXmlApplicationContext("Bean.xml");
		Demo.findEmployee(context1);
		
		ApplicationContext context2 = new AnnotationConfigApplicationContext(EmployeeBeanFactory.class);
		Demo.findEmployee(context2);
	}

}
