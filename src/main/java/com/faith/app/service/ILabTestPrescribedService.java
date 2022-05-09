package com.faith.app.service;

import java.util.List;

import com.faith.app.dto.LabTestPrescribedtDTO;
import com.faith.app.entity.LabTestPrescribed;

public interface ILabTestPrescribedService {
	
	
	
	//save
	public void saveLabTestPrescribed(LabTestPrescribed labTestPrescribed);
	
	
	
	
	//Delete by Patient ID
	//public void deleteLabTestPrescribedByPatientId(int theId);
	
	//Find all lab test prescriptions by Id
	public List<LabTestPrescribedtDTO>  getAllLabTestPrescribedByPatientId(int id);
	
	
	

}
