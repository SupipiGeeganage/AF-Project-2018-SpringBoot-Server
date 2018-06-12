package com.afproject.app.registration.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.afproject.app.registration.model.InPatient;

public interface InPatientRepository extends MongoRepository<InPatient, String>{

}
