package com.afproject.app.pcuSheet.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="pcusheets")
public class PCUSheet {
	
	@Id
	private String id;
	
	private String patient_name;
	private String doctor_name;
	private String medical_condition;
	private String medical_drugs;
	private String patient_current_status;
	private String date;
	private String description;
	
	
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDoctor_name() {
		return doctor_name;
	}
	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}
	
	public String getMedical_condition() {
		return medical_condition;
	}
	public void setMedical_condition(String medical_condition) {
		this.medical_condition = medical_condition;
	}
	public String getMedical_drugs() {
		return medical_drugs;
	}
	public void setMedical_drugs(String medical_drugs) {
		this.medical_drugs = medical_drugs;
	}
	public String getPatient_current_status() {
		return patient_current_status;
	}
	public void setPatient_current_status(String patient_current_status) {
		this.patient_current_status = patient_current_status;
	}
	
	
}
