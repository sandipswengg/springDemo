package org.sandip.springdemopckg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	
	// https://www.youtube.com/watch?v=qcjFZ_Ua8O0&index=7&list=PLBgMUB7xGcO1YY1J9NoXssmaB0FjLSbQ5
	// ==> By constructor way:
	
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		Emp emp = (Emp)context.getBean("ITEmpBean"); // Generating an 
		Emp accountEmp = (Emp)context.getBean("accountEmpBean");
		
		emp.getDetails();
		accountEmp.getDetails();
		
	}
	
}
