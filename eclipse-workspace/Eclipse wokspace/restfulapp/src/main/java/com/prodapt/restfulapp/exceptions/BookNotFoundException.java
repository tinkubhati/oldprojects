package com.prodapt.restfulapp.exceptions;

import org.springframework.stereotype.Component;

@Component
public class BookNotFoundException extends Exception{
	
	private String message;

	public BookNotFoundException() {
		
	}

	public BookNotFoundException(String message) {
		
		this.message = message;
	}

	@Override
	public String toString() {
		return "BookNotFoundException [message=" + message + "]";
	}

	public String getMessage() {
		return message;
	}

	

}
