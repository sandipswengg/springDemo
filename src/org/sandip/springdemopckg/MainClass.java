package org.sandip.springdemopckg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		Emp empobj = new Emp();
		
		empobj.empid = 1;
		empobj.fname = "Sandip";
		empobj.lname = "Sarkar";
		
		System.out.println("EMp details is : " + empobj);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		Emp emp = (Emp)context.getBean("empBean"); 
		System.out.println("EMp details is : " + emp);
		
	}
	
}
