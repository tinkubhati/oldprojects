package com.pecuniaPay.registrationLogin.services;

import java.util.Optional;

import com.pecuniaPay.registrationLogin.entities.Registration;
import com.pecuniaPay.registrationLogin.exceptions.RegistrationClassNotFound;

public interface RegistrationService {
	public Registration saveNewUser(Registration userDetails);
	
	public Optional<Registration> getUserDetailsById(Long id) throws RegistrationClassNotFound;
}
