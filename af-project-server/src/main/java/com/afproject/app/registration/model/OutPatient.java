package com.afproject.app.registration.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="outPatient")
public class OutPatient {

	@Id
	private String registration_no;
	private String name;
	private int age;
	private String sex;
	private String address;
	private String guardian_phone_no;
	private String guradian_name;
	private String guardian_ID;
	private String admittedCondition;
	private String diet;
	private String date;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAdmittedCondition() {
		return admittedCondition;
	}
	public void setAdmittedCondition(String admittedCondition) {
		this.admittedCondition = admittedCondition;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDiet() {
		return diet;
	}
	public void setDiet(String diet) {
		this.diet = diet;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getRegistration_no() {
		return registration_no;
	}
	public void setRegistration_no(String registration_no) {
		this.registration_no = registration_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGuardian_phone_no() {
		return guardian_phone_no;
	}
	public void setGuardian_phone_no(String guardian_phone_no) {
		this.guardian_phone_no = guardian_phone_no;
	}
	public String getGuradian_name() {
		return guradian_name;
	}
	public void setGuradian_name(String guradian_name) {
		this.guradian_name = guradian_name;
	}
	public String getGuardian_ID() {
		return guardian_ID;
	}
	public void setGuardian_ID(String guardian_ID) {
		this.guardian_ID = guardian_ID;
	}
}
