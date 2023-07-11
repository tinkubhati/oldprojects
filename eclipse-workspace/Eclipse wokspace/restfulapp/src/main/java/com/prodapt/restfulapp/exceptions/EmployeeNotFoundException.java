package com.prodapt.restfulapp.exceptions;

import org.springframework.stereotype.Component;

@Component
public class EmployeeNotFoundException extends Exception {
	
	String message;
	Long id;
	public EmployeeNotFoundException() {
		;
	}
	public EmployeeNotFoundException(String message, Long id) {
		
		this.message = message;
		this.id = id;
	}
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "EmployeeNotFoundException [message=" + message + ", id=" + id + "]";
	}
	
	public EmployeeNotFoundException(String name) {
		super("Could not find employee by "+name);
	}
	
	

}
