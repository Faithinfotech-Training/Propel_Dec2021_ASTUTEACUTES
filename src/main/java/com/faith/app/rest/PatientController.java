package com.faith.app.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.dto.PatientStaffDto;
import com.faith.app.entity.Patient;
import com.faith.app.service.Ipatient;


@RestController
@CrossOrigin
@RequestMapping("/api")
public class PatientController {
	
	@Autowired
	private Ipatient patientservice;
	
	//list all patient
	@GetMapping("/patients")
	public List<Patient> getAllPatients(){
		return patientservice.getPatient();
}
	//Get patient By Id
		@GetMapping("/patients/{theId}")
		public Optional<Patient> getPatient(@PathVariable int theId) {
			
			return 	patientservice.getPatient(theId);
		}
		
		
			//Add Patients
			@PostMapping("/patients")
			public void addPatients(@RequestBody Patient patient) {
				patientservice.savePatient(patient);
			}
			
			//Update Patients
			@PutMapping("/patients")
			public void updatePatient(@RequestBody Patient patient) {
				patientservice.savePatient(patient);
				
			}
			
			//Delete Patient
			@DeleteMapping("/patients/{theId}")
			public void deletePatient(@PathVariable int theId) {
				patientservice.deletePatient(theId);
				
			}
			
			//search by no
			
			@GetMapping("/patients/mobileno/{mobileno}")
			public Optional<Patient> getPatientBymobileno(@PathVariable String mobileno ){
				return patientservice.getPatientBymobileno(mobileno) ;
				
			}
			//search by email
			
			@GetMapping("/patients/email/{email}")
			public Optional<Patient> getPatientByemail(@PathVariable String email ){
				return patientservice.getPatientByemail(email) ;
				
			}
			@GetMapping("/patients/dto")
			public List<PatientStaffDto> getAllPatientsDto(){
				return patientservice.getAllPatientDto();
		}
			//search by no
			
			@GetMapping("/patients/mobileno/dto/{mobileno}")
			public Optional<PatientStaffDto> getPatientBymobileno1(@PathVariable String mobileno ){
				return patientservice.getPatientBymobileno1(mobileno) ;
				
			}
			//search by email
			
			@GetMapping("/patients/email/dto/{email}")
			public Optional<PatientStaffDto> getPatientByemail1(@PathVariable String email ){
				return patientservice.getPatientByemail1(email);
				
			}
			
}

