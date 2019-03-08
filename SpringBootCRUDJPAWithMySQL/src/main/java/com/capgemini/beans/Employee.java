package com.capgemini.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Empdetails")
public class Employee {

	@Id
	private String empid;
	private String empname;
	private double salary;
	private String designation;

	public Employee() {

	}

	public Employee(String empid, String empname, double salary, String designation) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.designation = designation;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + ", designation="
				+ designation + "]";
	}

	
	
}
