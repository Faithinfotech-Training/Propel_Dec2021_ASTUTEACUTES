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

import com.faith.app.entity.LabTest;

import com.faith.app.service.ILabTest;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class LabTestController {

	@Autowired
	private ILabTest lab;
	
	//list all labtest
		@GetMapping("/labtests")
		public List<LabTest> getAlllabtests(){
			return lab.getLabtest();
		}
		
	//add new lab test
		@PostMapping("/labtests")
		public void addLabtest(@RequestBody LabTest labTest) {
			lab.saveLabTest(labTest);
		}
		
	//update
		@PutMapping("/labtests")
		public void updateLabtest(@RequestBody LabTest labTest) {
			lab.saveLabTest(labTest);
			
		}
		//Delete Patient
		@DeleteMapping("/labtests/{theId}")
		public void delete(@PathVariable int theId) {
			lab.deleteLabTest(theId);
			
		}
		@GetMapping("/labtests/{theId}")
		public Optional<LabTest> searchById(@PathVariable int theId ){
			return lab.getLabTest(theId);
		}
		
}		
