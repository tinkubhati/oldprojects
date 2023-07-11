package com.bhati.JpaDemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "employees")
public class Alien {
	
	@Id
	
	private int emp_id;
	private String emp_name;
	private int performance;
	private long salary;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public int getPerformance() {
		return performance;
	}
	public void setPerformance(int performance) {
		this.performance = performance;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "alien [emp_id=" + emp_id + ", emp_name=" + emp_name + ", performance=" + performance + ", salary="
				+ salary + "]";
	}
	
	
	
	
	
	

}
