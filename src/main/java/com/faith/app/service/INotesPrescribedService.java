package com.faith.app.service;

import java.util.List;

import com.faith.app.dto.NotesPrescribedDTO;
import com.faith.app.entity.Prescriptionnotes;

public interface INotesPrescribedService {
	
	public void saveNotesPrescribed(Prescriptionnotes prescriptionnotes);
	
	//Find all lab notes prescriptions by Id
	public List<NotesPrescribedDTO>  getAllNotesPrescribedByPatientId(int id);

}
