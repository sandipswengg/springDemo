package org.sandip.springdemopckg;

public class Emp {
	IEmployeeTypes iTypes;
	
	public Emp(IEmployeeTypes iTypes) {
		this.iTypes = iTypes;
	}
	
	public void getDetails() {
		this.iTypes.getDetails();
	}
}
