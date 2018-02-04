package org.sandip.springdemopckg;

import java.util.List;

public class ITEngineer implements IEmployeeTypes {

	public List emps;
	
	public void setEmps(List emps) {
		this.emps = emps;
	}
	
	@Override
	public String toString() {
		return "ITEngineer [emps=" + emps + "]";
	}

	@Override
	public void getDetails() {
		System.out.println("This is IT Engineer");
	}
	
	@Override
	public void getAllResources() {
		System.out.println("IT emp names are: " + emps);
		
	}
}

