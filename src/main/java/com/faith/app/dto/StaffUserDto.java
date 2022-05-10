package com.faith.app.dto;

import java.util.Date;

public class StaffUserDto {
	
	private int staffId;	
	private int userId;	
	private String staffNo;	
	private String fullName;	
	private Date dob;	
	private String mobileno;	
	private String address;	
	private Date doj;	
	private double salary;	
	private String email;
	private String userName;
	
	public StaffUserDto() {
		super();
	}

	public StaffUserDto(int staffId, int userId, String staffNo, String fullName, Date dob, String mobileno,
			String address, Date doj, double salary, String email, String userName) {
		super();
		this.staffId = staffId;
		this.userId = userId;
		this.staffNo = staffNo;
		this.fullName = fullName;
		this.dob = dob;
		this.mobileno = mobileno;
		this.address = address;
		this.doj = doj;
		this.salary = salary;
		this.email = email;
		this.userName = userName;
	}

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getStaffNo() {
		return staffNo;
	}

	public void setStaffNo(String staffNo) {
		this.staffNo = staffNo;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "StaffUserDto [staffId=" + staffId + ", userId=" + userId + ", staffNo=" + staffNo + ", fullName="
				+ fullName + ", dob=" + dob + ", mobileno=" + mobileno + ", address=" + address + ", doj=" + doj
				+ ", salary=" + salary + ", email=" + email + ", userName=" + userName + "]";
	}
	
	
}
