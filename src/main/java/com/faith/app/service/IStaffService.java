package com.faith.app.service;

import java.util.List;
import java.util.Optional;



import com.faith.app.entity.Staff;

public interface IStaffService {
	
	//List
	public List<Staff>getStaffs();
			
	//Insert/Update
	public void saveStaff(Staff staff);
			
	//Search By Id
	public Optional <Staff> getStaff(int id);
		   
	//Delete
	public void deleteStaff(int id);
		   
	//Find By StaffName--Custom Methods
	public List<Staff> getStaffsByStaffName(String Name);
	
		   
		   
}

	



