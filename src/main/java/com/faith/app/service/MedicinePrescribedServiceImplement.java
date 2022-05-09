package com.faith.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.dao.IMedicinePrescribedRepository;
import com.faith.app.dto.LabTestPrescribedtDTO;
import com.faith.app.dto.MedicinePrescribedDTO;
import com.faith.app.entity.MedicinePrescribed;

@Service
public class MedicinePrescribedServiceImplement implements IMedicinePrescribedService {
	
	@Autowired
	private IMedicinePrescribedRepository medicinePrescribedRepository;

	@Override
	public void saveMedicinePrescribed(MedicinePrescribed medicinePrescribed) {
		 
		medicinePrescribedRepository.save(medicinePrescribed);
	}

	@Override
	public List<MedicinePrescribedDTO> getAllMedicinePrescribedByPatientId(int id) {
		 
		return (List<MedicinePrescribedDTO>) medicinePrescribedRepository.getAllDTOMedicinePrescribedByPatientId(id);
	}

}
