package com.faith.app.rest;

import java.util.List;
import java.util.Optional;

import javax.swing.text.html.Option;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.entity.Staff;
import com.faith.app.service.IStaffService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class StaffController {
	
	@Autowired
	private IStaffService staffserv;
	
	//list
	@GetMapping("/staffs")
	public List<Staff> getAllstaffs(){
		return staffserv.getStaffs() ;		
	}
	
	//add 
	@PostMapping("/staffs")
	public void addStaff(@RequestBody Staff staff) {
		staffserv.saveStaff(staff);
	}
	
	//search
	@GetMapping("/staffs/{id}")
	public Optional<Staff> searchStaffById(@PathVariable int id ){
		return staffserv.getStaff(id) ;		
	}
	
	//delete
	@DeleteMapping("/staffs/{Id}")
	public void deletestaff(@PathVariable int Id) {
		staffserv.deleteStaff(Id);
	}
	
	//serach by name 
	@GetMapping("/staffs/name/{name}")
	public List<Staff> searchbyname(@PathVariable String name){
		return 	staffserv.getStaffsByStaffName(name);
	}
}
