package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.dao.PatientRepository;
import com.faith.app.dto.PatientStaffDto;
import com.faith.app.entity.Patient;



@Service
public class PatientServiceImplli implements Ipatient {

	@Autowired
	private PatientRepository patientrepo;
	
	@Override
	public List<Patient> getPatient() {
		 
		return (List<Patient>)patientrepo.findAll();
	}

	@Override
	public void savePatient(Patient patient) {
		
		patientrepo.save(patient);

	}
	
	
	//Get Employee By Id
	@Override
	public Optional<Patient> getPatient(int theId) {
		 
		return patientrepo.findById(theId);
	}

	@Override
	public void deletePatient(int theId) {
		 
		patientrepo.deleteById(theId);
	}
	@Override
	public Optional<Patient> getPatientBymobileno(String mobileno ){
		
		return patientrepo.searchbymobileno(mobileno);
	}
	@Override
	public Optional<Patient> getPatientByemail(String email ){
		
		return patientrepo.searchbyemail(email);
	}
	@Override
	public List<PatientStaffDto> getAllPatientDto(){
		return patientrepo.listalldtoPatients();
	}
	@Override
	public Optional<PatientStaffDto> getPatientBymobileno1(String mobileno ){
		
		return patientrepo.searchbymobileno1(mobileno);
	}
	@Override
	public Optional<PatientStaffDto> getPatientByemail1(String email ){
		
		return patientrepo.searchbyemail1(email);
	}
	
}

