package com.afproject.app.registration.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="inPatient")
public class InPatient {
	
	@Id
	private String ip_id;
	private String admission_no;
	private String name;
	private String sex;
	private String age;
	private String admittedCondition;
	private String room_no;
	private String consultant;
	private String surgeon;
	private String diet;
	private String date;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAdmittedCondition() {
		return admittedCondition;
	}
	public void setAdmittedCondition(String admittedCondition) {
		this.admittedCondition = admittedCondition;
	}
	public String getId() {
		return ip_id;
	}
	public void setId(String id) {
		this.ip_id = id;
	}
	
	public String getAdmission_no() {
		return admission_no;
	}
	public void setAdmission_no(String admission_no) {
		this.admission_no = admission_no;
	}
	public String getRoom_no() {
		return room_no;
	}
	public void setRoom_no(String room_no) {
		this.room_no = room_no;
	}
	public String getConsultant() {
		return consultant;
	}
	public void setConsultant(String consultant) {
		this.consultant = consultant;
	}
	public String getSurgeon() {
		return surgeon;
	}
	public void setSurgeon(String surgeon) {
		this.surgeon = surgeon;
	}
	public String getDiet() {
		return diet;
	}
	public void setDiet(String diet) {
		this.diet = diet;
	}
	
}
