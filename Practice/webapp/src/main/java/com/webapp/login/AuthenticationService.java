package com.webapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		
		    boolean isValidUsername = username.equalsIgnoreCase("tinku");
		   boolean isValidPassword =  password.equalsIgnoreCase("bhati");
		   
		   return isValidUsername && isValidPassword;
	    }
		
	}


