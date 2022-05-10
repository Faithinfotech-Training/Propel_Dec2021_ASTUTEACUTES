package com.faith.app.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name= "specialization")
public class Specialization {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int specialiseId;
	
	
	private String specialization;
	
	private String isActive;
	
	
	@CreationTimestamp
	@Column(name = "created_date")
	private Date createdDate;

	@OneToMany(mappedBy="specialization" )
	private List<Doctor> docter;

	public Specialization() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Specialization(int specialiseId, String specialization, String isActive, Date createdDate,
			List<Doctor> docter) {
		super();
		this.specialiseId = specialiseId;
		this.specialization = specialization;
		this.isActive = isActive;
		this.createdDate = createdDate;
		this.docter = docter;
	}

	public int getSpecialiseId() {
		return specialiseId;
	}

	public void setSpecialiseId(int specialiseId) {
		this.specialiseId = specialiseId;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public List<Doctor> getDocter() {
		return docter;
	}

	public void setDocter(List<Doctor> docter) {
		this.docter = docter;
	}

	@Override
	public String toString() {
		return "Specialization [specialiseId=" + specialiseId + ", specialization=" + specialization + ", isActive="
				+ isActive + ", createdDate=" + createdDate + ", docter=" + docter + "]";
	}
	
}
