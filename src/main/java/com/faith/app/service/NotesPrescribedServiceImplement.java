package com.faith.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.dao.IMedicineRepository;
import com.faith.app.dao.INotesPrescribedRepository;
import com.faith.app.dto.MedicinePrescribedDTO;
import com.faith.app.dto.NotesPrescribedDTO;
import com.faith.app.entity.Prescriptionnotes;
@Service
public class NotesPrescribedServiceImplement implements INotesPrescribedService {
	
	@Autowired
	private INotesPrescribedRepository notesPrescribedRepository ;

	@Override
	public void saveNotesPrescribed(Prescriptionnotes prescriptionnotes) {
		 
		notesPrescribedRepository.save(prescriptionnotes);
	}

	@Override
	public List<NotesPrescribedDTO> getAllNotesPrescribedByPatientId(int id) {
		
		return (List<NotesPrescribedDTO>) notesPrescribedRepository.getAllDTONotesPrescribedByPatientId(id);
	}

}
