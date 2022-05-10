package com.faith.app.rest;

import java.util.List;

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


import com.faith.app.dto.AppoinmentPatientStaffDoctor;
import com.faith.app.dto.BillDto;
import com.faith.app.entity.Appointment;

import com.faith.app.service.IAppoinment;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class AppoinmetController {

	@Autowired
	private IAppoinment appoin;
	
	//list all appoinments
		@GetMapping("/appoinments")
		public List<Appointment> getAllAppoinments(){
			return appoin.getAppoinment();
		}
		
		
		//Add appoinment
		@PostMapping("/appoinments")
		public void addAppoinments(@RequestBody Appointment appointment) {
			appoin.saveAppointment(appointment);
		}
		
		//Update appoinments
		@PutMapping("/appoinments")
		public void updateAppoinment(@RequestBody  Appointment appointment) {
			appoin.saveAppointment(appointment);
			
		}
		//list all appoinments
				@GetMapping("/appoinments/dto")
				public List<AppoinmentPatientStaffDoctor> getAllAppoinments1(){
					return appoin.getAppoinment1();
				}
				//showbill
				@GetMapping("/appoinments/showbill")
				public List<BillDto> getBill(){
					return appoin.bill();
				}
				
				//Delete Patient
				@DeleteMapping("/appoinments/{theId}")
				public void deleteappoiment(@PathVariable int theId) {
					appoin.delete(theId);
					
				}
}
