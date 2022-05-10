package com.faith.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.faith.app.entity.Doctor;

public interface IDoctorRepository extends CrudRepository<Doctor, Integer>{
	
	//Custom Method by using JPQL 
	@Query ("from Doctor where doctorName like %?1%")
	public List <Doctor> findDoctorName (String name);

}
