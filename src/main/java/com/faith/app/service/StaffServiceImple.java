package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.dao.IStaffRepository;
import com.faith.app.entity.Staff;

@Service
public class StaffServiceImple implements IStaffService {
	
	@Autowired
	private IStaffRepository staffrepo;

	@Override
	public List<Staff> getStaffs() {	
		return (List<Staff>) staffrepo.findAll();
	}

	@Override
	public void saveStaff(Staff staff) {
	
		staffrepo.save(staff);
	}

	@Override
	public Optional<Staff> getStaff(int id) {		
		return staffrepo.findById(id);
	}

	@Override
	public void deleteStaff(int id) {		
		staffrepo.deleteById(id);
	}

	@Override
	public List<Staff> getStaffsByStaffName(String Name) {	
		return staffrepo.findByStaffName(Name);
	}

}
