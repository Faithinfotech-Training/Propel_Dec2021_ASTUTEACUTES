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

import com.faith.app.entity.Specialization;
import com.faith.app.service.ISpecializationService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class SpecializationController {
	
	@Autowired
	private ISpecializationService specialserv;
	
	//list
	@GetMapping("/Specialization")
	public List<Specialization> getAllSpecialization(){
		return specialserv.getspecialization();
	}
	
	//add
	@PostMapping("/Specialization")
	public void addSpecialization (@RequestBody Specialization specialization) {
		specialserv.saveSpecialization(specialization);
	}
	
	//search
	@GetMapping("/Specialization/{id}")
	public Optional<Specialization> searchSpecializationById(@PathVariable int id ){
		return specialserv.getSpecialization(id);
	}
	
	//delete
	@DeleteMapping("/Specialization/{id}")
	public void deleteSpecializationId(@PathVariable int id) {
		specialserv.deleteSpecialization(id);
	}
	
}
