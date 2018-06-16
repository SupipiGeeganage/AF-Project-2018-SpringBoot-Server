package com.afproject.app.payment.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="payment")
public class payment {

	@Id
	private String id;
	
	
	private String dueDate;
	private String foodpck;
	private Double foodpckCharge;
	private String addnurse;
	private Double addnurseCharge;
	private String patientName;
	private Double TotalPayment;
	private String NIC;
	private int noOfDates;
	
	public int getNoOfDates() {
		return noOfDates;
	}
	
	public void setNoOfDates(int noOfDates) {
		this.noOfDates = noOfDates;
	}

	public String getNIC() {
		return NIC;
	}
	public void setNIC(String nIC) {
		NIC = nIC;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public Double getFoodpckCharge() {
		return foodpckCharge;
	}
	public void setFoodpckCharge(Double foodpckCharge) {
		this.foodpckCharge = foodpckCharge;
	}
	public Double getAddnurseCharge() {
		return addnurseCharge;
	}
	public void setAddnurseCharge(Double addnurseCharge) {
		this.addnurseCharge = addnurseCharge;
	}
	public Double getTotalPayment() {
		return TotalPayment;
	}
	public void setTotalPayment(Double totalPayment) {
		TotalPayment = totalPayment;
	}
	
	
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientName() {
		return patientName;
	}
	
	public String getFoodpck() {
		return foodpck;
	}
	public void setFoodpck(String foodpck) {
		this.foodpck = foodpck;
	}
	public String getAddnurse() {
		return addnurse;
	}
	public void setAddnurse(String addnurse) {
		this.addnurse = addnurse;
	}
	}
