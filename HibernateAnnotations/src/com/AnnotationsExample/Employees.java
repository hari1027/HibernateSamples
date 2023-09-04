package com.AnnotationsExample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="emp")

public class Employees {
	@Id
	@Column(name="emp_ID")
	private String empId;
	@Column(name="emp_Name")
	private String empName;
	@Column(name="emp_Address")
	private String empAddress;
	@Column(name="emp_Salary")
	private double empsalary;
	@Column(name="emp_phone")
	private String empphone ;
	
	public String getEmpphone() {
		return empphone;
	}
	public void setEmpphone(String empphone) {
		this.empphone = empphone;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
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
	public double getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}
	
	

}
