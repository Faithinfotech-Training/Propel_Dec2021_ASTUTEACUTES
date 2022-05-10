package com.faith.app.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.dao.AppoinmentRepository;

import com.faith.app.dto.AppoinmentPatientStaffDoctor;
import com.faith.app.dto.BillDto;
import com.faith.app.entity.Appointment;



@Service
public class AppoinmetServiceImplli implements IAppoinment {

	@Autowired
	private AppoinmentRepository appoinmentrep;
	
	@Override
	public List<Appointment> getAppoinment(){
		return (List<Appointment>) appoinmentrep.findAll();
	}
	@Override
	public void saveAppointment(Appointment appointment) {
		appoinmentrep.save(appointment);
	}
	@Override
	public List<AppoinmentPatientStaffDoctor> getAppoinment1(){
		return (List<AppoinmentPatientStaffDoctor>) appoinmentrep.ListAllAPS();
	}
	@Override
	public List<BillDto> bill(){
		return appoinmentrep.ShowBill();
	}
	@Override
	public void delete(int id){
		appoinmentrep.deleteById(id);;
	}
}

