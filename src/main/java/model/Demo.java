package model;

//import java.util.ArrayList;
//import java.util.List;

import org.springframework.context.ApplicationContext;

public class Demo {

	//List<Employee> employees = new ArrayList<Employee>();
	
	public static void findEmployee(ApplicationContext context) {
		
		System.out.println("Enter employee id to search");
		int t = Scan.sc.nextInt();
		boolean flag= false;
		
		for(int i=1; i<6;i ++) {
			
			Employee emp = (Employee) context.getBean("emp" + i);
			
			if(emp.getId() == t) {
				System.out.println(emp.toString());
				flag = true;
				break;
			}
		}
		
		if(flag==false)
			System.out.println("employee not found");
	}
}
