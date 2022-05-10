package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.dao.LabTestReposit;
import com.faith.app.entity.LabTest;


@Service
public class LabTestServiceImpli implements ILabTest {

	@Autowired
	private LabTestReposit labrep;
	
	@Override
	public List<LabTest> getLabtest() {
		 
		return (List<LabTest>)labrep.findAll();
	}

	@Override
	public void saveLabTest(LabTest labTest) {
		
		labrep.save(labTest);

	}
	
	
	
	@Override
	public Optional<LabTest> getLabTest(int theId) {
		 
		return labrep.findById(theId);
	}

	@Override
	public void deleteLabTest(int theId) {
		labrep.deleteById(theId);
		
	}
	
	
}
