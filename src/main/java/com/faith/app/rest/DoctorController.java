package com.faith.app.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.entity.Doctor;
import com.faith.app.entity.Staff;
import com.faith.app.service.IDoctorService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class DoctorController {
	
	@Autowired
	private IDoctorService doctorserv;
	
	//list
	@GetMapping("/doctors")
	public List<Doctor> getAllDoctor(){
		return doctorserv.getdoctors();			
	}
	
	//add 
	@PostMapping("/doctors")
	public void addDoctor(@RequestBody Doctor doctor) {
		doctorserv.saveDoctor(doctor);
	}
	
	//search
	@GetMapping("/doctors/{id}")
	public Optional<Doctor> searchDoctorById(@PathVariable int id ){
		return doctorserv.getDoctor(id) ;		
	}	
	
	//Delete
	@DeleteMapping("/doctors/{id}")
	public void deleteDoctorId(@PathVariable int id) {
		doctorserv.deleteDoctor(id);
	}
	
	//search by name
	@GetMapping("/doctors/{name}")
	public List<Doctor> searchbyname(@PathVariable String name){
		return 	doctorserv.getDoctorName(name);
	}

}
