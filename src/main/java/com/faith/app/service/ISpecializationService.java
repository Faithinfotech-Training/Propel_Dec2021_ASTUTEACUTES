package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import com.faith.app.entity.Specialization;



public interface ISpecializationService {
	
	//List
	public List<Specialization>getspecialization();
		
	//Insert/Update
	public void saveSpecialization(Specialization specialization);
		
	//Search By Id
	public Optional<Specialization> getSpecialization(int id);
		
	//Delete
	public void deleteSpecialization(int id);

}
