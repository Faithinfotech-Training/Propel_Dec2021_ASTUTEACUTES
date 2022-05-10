package com.faith.app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.faith.app.entity.Specialization;

public interface ISpecializationRepository extends CrudRepository<Specialization, Integer> {
/*
	//Custom Method by using JPQL 
	@Query("FROM Specialization WHERE specialise_id = ?");
	public Optional<Specialization> findById(Integer id);
	*/
}
