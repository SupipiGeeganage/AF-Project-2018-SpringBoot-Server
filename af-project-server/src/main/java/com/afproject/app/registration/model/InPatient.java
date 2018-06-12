package com.afproject.app.registration.model;

public class InPatient {

	private String admission_no;
	private String room_no;
	private String consultant;
	private String surgeon;
	private String diet;
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
