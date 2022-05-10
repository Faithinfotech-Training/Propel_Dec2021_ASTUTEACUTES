package com.faith.app.dto;

import java.util.Date;

public class BillDto {
	
	private int appoinId;
	private String tokenno;
	private Date doa;
	private String patientName;
	private String docName;
	private double consultationfee;
	public BillDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BillDto(int appoinId, String tokenno, Date doa, String patientName, String docName, double consultationfee) {
		super();
		this.appoinId = appoinId;
		this.tokenno = tokenno;
		this.doa = doa;
		this.patientName = patientName;
		this.docName = docName;
		this.consultationfee = consultationfee;
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
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public double getConsultationfee() {
		return consultationfee;
	}
	public void setConsultationfee(double consultationfee) {
		this.consultationfee = consultationfee;
	}
	@Override
	public String toString() {
		return "BillDto [appoinId=" + appoinId + ", tokenno=" + tokenno + ", doa=" + doa + ", patientName="
				+ patientName + ", docName=" + docName + ", consultationfee=" + consultationfee + "]";
	}
	
	
	
}
