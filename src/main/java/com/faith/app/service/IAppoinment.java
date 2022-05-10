package com.faith.app.service;

import java.util.List;


import com.faith.app.dto.AppoinmentPatientStaffDoctor;
import com.faith.app.dto.BillDto;
import com.faith.app.entity.Appointment;

public interface IAppoinment {

	List<Appointment> getAppoinment();

	void saveAppointment(Appointment appointment);

	List<AppoinmentPatientStaffDoctor> getAppoinment1();

	List<BillDto> bill();

	void delete(int id);

	

	

}
