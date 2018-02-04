package org.sandip.springdemopckg;

public class Emp {
	int empid;
	String fname;
	String lname;
	
	public Emp(int empid, String fname, String lname) {
		this.empid = empid;
		this.fname = fname;
		this.lname = lname;
	}
	
	public Emp() {
		
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", fname=" + fname + ", lname=" + lname + "]";
	}
	
	
	
}
