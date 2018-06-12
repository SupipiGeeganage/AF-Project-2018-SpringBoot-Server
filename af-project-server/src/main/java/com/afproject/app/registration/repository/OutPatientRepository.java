package com.afproject.app.registration.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.afproject.app.registration.model.OutPatient;

public interface OutPatientRepository extends MongoRepository<OutPatient, String> {

}
