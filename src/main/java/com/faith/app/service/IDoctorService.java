package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import com.faith.app.entity.Doctor;
import com.faith.app.entity.Staff;

public interface IDoctorService {
	
	//List
	public List<Doctor>getdoctors();
	
	//Insert/Update
	public void saveDoctor(Doctor doctor);
	
	//Search By Id
	public Optional<Doctor> getDoctor(int id);
	
	//Delete
	public void deleteDoctor(int id);
	
	//Find By EmployeeName--Custom Methods
	public List<Doctor> getDoctorName(String Name);	

}
