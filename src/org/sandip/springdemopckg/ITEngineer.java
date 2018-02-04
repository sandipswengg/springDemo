package org.sandip.springdemopckg;

public class ITEngineer {
	IEmployeeTypes empType;
	
	public void setEmpType(IEmployeeTypes empType) {
		this.empType = empType;
	}
	
	public void getDetails() {
		System.out.println(this.empType);
	}
}
