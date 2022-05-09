package com.faith.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.dto.NotesPrescribedDTO;
import com.faith.app.service.INotesPrescribedService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class PrescriptionnotesRestController {
	
	@Autowired
	private INotesPrescribedService  notesPrescribedService;
	
	@GetMapping("/notesprescribed/dto/{id}")
	public List<NotesPrescribedDTO> getAllLabTestPrescribedByPatientId(@PathVariable int id){
		
		return notesPrescribedService.getAllNotesPrescribedByPatientId(id);
		
	}

}
