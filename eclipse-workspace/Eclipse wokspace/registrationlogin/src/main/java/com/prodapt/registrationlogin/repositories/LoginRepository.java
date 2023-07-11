package com.prodapt.registrationlogin.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.registrationlogin.entities.Login;

@Repository
public interface LoginRepository extends CrudRepository<Login, Integer> {

}
