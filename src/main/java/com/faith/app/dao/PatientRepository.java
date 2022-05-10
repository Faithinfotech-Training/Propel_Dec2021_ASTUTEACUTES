package com.faith.app.dao;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.dto.PatientStaffDto;
import com.faith.app.entity.Patient;
@Repository
public interface PatientRepository extends CrudRepository<Patient, Integer> {
		
	@Query("from Patient where mobileno like ?1")
	public Optional<Patient> searchbymobileno(String mobileno);

	@Query("from Patient where email like ?1")
	public Optional<Patient> searchbyemail(String email);
	
	//Custom method using multiple Tables
	@Query("SELECT new com.faith.app.dto.PatientStaffDto(p.patientId, p.patientName, p.dob, p.mobileno, p.gender, p.bloodGroup, p.address, p.email, s.fullName)FROM Patient p INNER JOIN p.staff s ORDER BY p.patientId")
	public List<PatientStaffDto> listalldtoPatients();
	
	@Query("SELECT new com.faith.app.dto.PatientStaffDto(p.patientId, p.patientName, p.dob, p.mobileno, p.gender, p.bloodGroup, p.address, p.email, s.fullName)FROM Patient p INNER JOIN p.staff s where p.mobileno like ?1")
	public Optional<PatientStaffDto> searchbymobileno1(String mobileno);
	
	@Query("SELECT new com.faith.app.dto.PatientStaffDto(p.patientId, p.patientName, p.dob, p.mobileno, p.gender, p.bloodGroup, p.address, p.email, s.fullName)FROM Patient p INNER JOIN p.staff s where p.email like ?1")
	public Optional<PatientStaffDto> searchbyemail1(String email);
}
