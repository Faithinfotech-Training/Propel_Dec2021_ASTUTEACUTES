package com.faith.app.service;

import java.util.List;

import com.faith.app.dto.MedicinePrescribedDTO;
import com.faith.app.entity.MedicinePrescribed;

public interface IMedicinePrescribedService {
	
		//save
		public void saveMedicinePrescribed(MedicinePrescribed medicinePrescribed);
		
		
		//Find all lab test prescriptions by Id
		public List<MedicinePrescribedDTO>  getAllMedicinePrescribedByPatientId(int id);

}
