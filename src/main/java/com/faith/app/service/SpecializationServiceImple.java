package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.dao.IDoctorRepository;
import com.faith.app.dao.ISpecializationRepository;
import com.faith.app.entity.Specialization;

@Service
public class SpecializationServiceImple implements ISpecializationService {

	@Autowired
	private ISpecializationRepository specialrepo;
	
	@Override
	public List<Specialization> getspecialization() {
		return (List<Specialization>) specialrepo.findAll();
	}

	@Override
	public void saveSpecialization(Specialization specialization) {
		specialrepo.save(specialization);		
	}

	@Override
	public Optional<Specialization> getSpecialization(int id) {
		return specialrepo.findById(id);
	}

	@Override
	public void deleteSpecialization(int id) {
		specialrepo.deleteById(id);
	}

}
