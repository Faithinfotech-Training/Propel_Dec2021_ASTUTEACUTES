package com.faith.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.faith.app.entity.Staff;

public interface IStaffRepository extends CrudRepository<Staff, Integer> {
	
	//Custom Method by using JPQL 
	@Query ("from Staff where staffName like %?1%")
	public List <Staff> findByStaffName (String name);

}
