package com.faith.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.faith.app.dto.LabTestPrescribedtDTO;

import com.faith.app.service.ILabTestPrescribedService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class LabTestPrescribedRestController {
	
	@Autowired
	private ILabTestPrescribedService  labTestPrescribedService;
	
	//Custom methods to Find By Employee name by JPQL
	/*
		@GetMapping("/employees/search/{name}")
		public List<Employee> getAllEmployeesByName(@PathVariable String name){
			
			return employeeService.getEmployeeByEmployeeName(name);
			
		}
		//Custom methods using  JPQL -- DTO -- InnerJoin
		
		@GetMapping("/employees/dto")
		public List<EmployeeDeptDTO> getAllDTOEmployees(){
			
			return employeeService.getAllDTOEmployees();
			
		}
		*/
	
	@GetMapping("/labtestsprescribed/dto/{id}")
	public List<LabTestPrescribedtDTO> getAllLabTestPrescribedByPatientId(@PathVariable int id){
		
		return labTestPrescribedService.getAllLabTestPrescribedByPatientId(id);
		
	}
	

}
