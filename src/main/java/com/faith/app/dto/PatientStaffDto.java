package com.faith.app.dto;

import java.util.Date;

public class PatientStaffDto {
	
	private int patientId;
	private String patientName;
	private Date dob;
	private String mobileno;
	private String gender;
	private String bloodGroup;
	private String address;
	private String email;
	private String fullName;
	public PatientStaffDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PatientStaffDto(int patientId, String patientName, Date dob, String mobileno, String gender, String bloodGroup,
			String address, String email, String fullName) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.dob = dob;
		this.mobileno = mobileno;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		this.address = address;
		this.email = email;
		this.fullName = fullName;
	}
	
	public int getPatientId() {
		return patientId;
	}
	public void setId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	@Override
	public String toString() {
		return "PatientStaffDto [patientId=" + patientId + ", patientName=" + patientName + ", dob=" + dob + ", mobileno=" + mobileno
				+ ", gender=" + gender + ", bloodGroup=" + bloodGroup + ", address=" + address + ", email=" + email
				+ ", fullName=" + fullName + "]";
	}
	
	
	
}
