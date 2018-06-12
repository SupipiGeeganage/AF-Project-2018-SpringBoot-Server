package com.afproject.app.registration.model;

public class OutPatient {

	private String name;
	private int age;
	private String sex;
	private String address;
	private int guardian_phone_no;
	private String guradian_name;
	private String guardian_ID;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getGuardian_phone_no() {
		return guardian_phone_no;
	}
	public void setGuardian_phone_no(int guardian_phone_no) {
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
