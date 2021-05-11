package com.project.package1;

public class Employee {
	
	public long empId;
	public String empName;
	public String empAddress;
	public int empAge;
	
	
	public Employee(long empId, String empName, String empAddress, int empAge) {
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empAge = empAge;
	}
	
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	
	
	
	
	
	
}



