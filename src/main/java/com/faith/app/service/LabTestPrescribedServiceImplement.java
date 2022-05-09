package com.faith.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.dao.ILabTestPrescribedRepository;
import com.faith.app.dto.LabTestPrescribedtDTO;
import com.faith.app.entity.LabTestPrescribed;

@Service
public class LabTestPrescribedServiceImplement implements ILabTestPrescribedService {
	
	@Autowired
	private ILabTestPrescribedRepository labTestPrescribedRepository;

	@Override
	public void saveLabTestPrescribed(LabTestPrescribed labTestPrescribed) {
		 
		labTestPrescribedRepository.save(labTestPrescribed);
	}

	 /*
	@Override
	public void deleteLabTestPrescribedByPatientId(int theId) {
		labTestPrescribedRepository.deleteLabTestPrescribedByPatientId(theId);
		
	}
		*/
	
	@Override
	public List<LabTestPrescribedtDTO> getAllLabTestPrescribedByPatientId(int id) {
		 
		return (List<LabTestPrescribedtDTO>)labTestPrescribedRepository.getAllDTOLabTestPrescriptionsByPatientId(id);
	}
	




}
