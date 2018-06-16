package com.afproject.app.registration.services;

import java.util.List;

import com.afproject.app.registration.model.OutPatient;

public interface OutPatientService {

	List<OutPatient> listOutPatient();

	OutPatient addOutPatient(OutPatient outpatient);

	OutPatient getOnePatient(String id);

	void updateDetails(OutPatient outPatient, String id);

	void deletePatient(String id);

}
