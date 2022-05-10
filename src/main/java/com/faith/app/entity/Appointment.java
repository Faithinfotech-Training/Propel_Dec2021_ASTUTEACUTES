package com.faith.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonBackReference;



@Entity
@Table(name= "appointment")
public class Appointment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int appoinId;
	
	private String tokenno;
	
	private int patientId;
	@ManyToOne
	@JoinColumn(name="patientId", insertable = false, updatable = false)
	private Patient  patient; 
	
	
	
	
	
	private int docId;
	@ManyToOne
	@JoinColumn(name="docId", insertable = false, updatable = false)
	Doctor doctor;
	
	
	
	private int staffId;
	@ManyToOne
	@JoinColumn(name="staffId", insertable = false, updatable = false)
	private Staff staff;
	
	@CreationTimestamp
	@Column(name = "doa")
	private Date doa;
	
	
	
	private String isActive;



	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Appointment(int appoinId, String tokenno, int patientId, Patient patient, int docId, Doctor doctor,
			int staffId, Staff staff, Date doa, String isActive) {
		super();
		this.appoinId = appoinId;
		this.tokenno = tokenno;
		this.patientId = patientId;
		this.patient = patient;
		this.docId = docId;
		this.doctor = doctor;
		this.staffId = staffId;
		this.staff = staff;
		this.doa = doa;
		this.isActive = isActive;
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



	public int getPatientId() {
		return patientId;
	}



	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}



	public Patient getPatient() {
		return patient;
	}



	public void setPatient(Patient patient) {
		this.patient = patient;
	}



	public int getDocId() {
		return docId;
	}



	public void setDocId(int docId) {
		this.docId = docId;
	}



	public Doctor getDoctor() {
		return doctor;
	}



	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}



	public int getStaffId() {
		return staffId;
	}



	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}



	public Staff getStaff() {
		return staff;
	}



	public void setStaff(Staff staff) {
		this.staff = staff;
	}



	public Date getDoa() {
		return doa;
	}



	public void setDoa(Date doa) {
		this.doa = doa;
	}



	public String getIsActive() {
		return isActive;
	}



	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}



	@Override
	public String toString() {
		return "Appointment [appoinId=" + appoinId + ", tokenno=" + tokenno + ", patientId=" + patientId + ", patient="
				+ patient + ", docId=" + docId + ", doctor=" + doctor + ", staffId=" + staffId + ", staff=" + staff
				+ ", doa=" + doa + ", isActive=" + isActive + "]";
	}




	
	}