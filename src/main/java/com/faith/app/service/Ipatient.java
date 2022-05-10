package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import com.faith.app.dto.PatientStaffDto;
import com.faith.app.entity.Patient;

public interface Ipatient {

	List<Patient> getPatient();

	void savePatient(Patient patient);

	Optional<Patient> getPatient(int theId);

	void deletePatient(int theId);

	Optional<Patient> getPatientBymobileno(String mobileno);

	Optional<Patient> getPatientByemail(String email);

	List<PatientStaffDto> getAllPatientDto();

	Optional<PatientStaffDto> getPatientBymobileno1(String mobileno);

	Optional<PatientStaffDto> getPatientByemail1(String email);
	

	

}
