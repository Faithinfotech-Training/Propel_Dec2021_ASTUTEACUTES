package com.faith.app.dto;

import java.util.Date;


public class AppoinmentPatientStaffDoctor {

	private int appoinId;
	
	private String tokenno;
	
	private Date doa;
	
	private String patientName;
	
	private Date dob;
	
	private String mobileno;
	
	private String gender;
	
	private String bloodGroup;
	
	private String fullName;
	
	private String docName;

	public AppoinmentPatientStaffDoctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppoinmentPatientStaffDoctor(int appoinId, String tokenno, Date doa, String patientName, Date dob,
			String mobileno, String gender, String bloodGroup, String fullName, String docName) {
		super();
		this.appoinId = appoinId;
		this.tokenno = tokenno;
		this.doa = doa;
		this.patientName = patientName;
		this.dob = dob;
		this.mobileno = mobileno;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		this.fullName = fullName;
		this.docName = docName;
	}

	public int getAppoinId() {
		return appoinId;
	}

	public void setAppoinId(int appoinId) {
		this.appoinId = appoinId;
	}

	public String getTokenno() {
		return tokenno;
	}

	public void setTokenno(String tokenno) {
		this.tokenno = tokenno;
	}

	public Date getDoa() {
		return doa;
	}

	public void setDoa(Date doa) {
		this.doa = doa;
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

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	@Override
	public String toString() {
		return "AppoinmentPatientStaffDoctor [appoinId=" + appoinId + ", tokenno=" + tokenno + ", doa=" + doa
				+ ", patientName=" + patientName + ", dob=" + dob + ", mobileno=" + mobileno + ", gender=" + gender
				+ ", bloodGroup=" + bloodGroup + ", fullName=" + fullName + ", docName=" + docName + "]";
	}
	
	
	
}
