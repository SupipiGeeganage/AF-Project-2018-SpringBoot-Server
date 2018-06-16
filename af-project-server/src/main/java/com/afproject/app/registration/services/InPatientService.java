package com.afproject.app.registration.services;

import java.util.List;

import com.afproject.app.registration.model.InPatient;

public interface InPatientService {

	InPatient CreateInPatient(InPatient inPatient);
	List<InPatient> listInPatient();
	InPatient getOneInPatient(String ip_id);
	void updateDetails(InPatient inPatient, String id);
	void deletePatient(String id);
}
