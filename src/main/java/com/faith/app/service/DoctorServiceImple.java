package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.dao.IDoctorRepository;
import com.faith.app.entity.Doctor;
import com.faith.app.entity.Staff;

@Service
public class DoctorServiceImple implements IDoctorService {
	
	@Autowired
	private IDoctorRepository doctorrepo;

	@Override
	public List<Doctor> getdoctors() {
		return (List<Doctor>) doctorrepo.findAll();
	}

	@Override
	public void saveDoctor(Doctor doctor) {
		doctorrepo.save(doctor);
	}

	@Override
	public Optional<Doctor> getDoctor(int id) {
		return doctorrepo.findById(id);
	}

	@Override
	public void deleteDoctor(int id) {
		doctorrepo.deleteById(id);

	}

	@Override
	public List<Doctor> getDoctorName(String Name) {
		return doctorrepo.findDoctorName(Name);
	}

}
