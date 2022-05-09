package com.faith.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.faith.app.entity.Medicine;


public interface IMedicineRepository extends CrudRepository<Medicine, Integer> {
	
	
	 //custom methods
		@Query("FROM Medicine WHERE medicineName LIKE %?1%")
		public List<Medicine> findByMedicineName(String name);

}
