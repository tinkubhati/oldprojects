package com.prodapt.registrationlogin.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.registrationlogin.entities.Registration;

@Repository
public interface RegistrationRepository extends CrudRepository<Registration, Integer> {

}
