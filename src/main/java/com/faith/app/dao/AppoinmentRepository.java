package com.faith.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.dto.AppoinmentPatientStaffDoctor;
import com.faith.app.dto.BillDto;
import com.faith.app.entity.Appointment;
@Repository
public interface AppoinmentRepository extends CrudRepository<Appointment, Integer> {
	
	@Query("SELECT new com.faith.app.dto.AppoinmentPatientStaffDoctor(a.appoinId, a.tokenno, a.doa, p.patientName, p.dob, p.mobileno, p.gender, p.bloodGroup, s.fullName, d.docName)FROM Appointment a INNER JOIN a.patient p INNER JOIN a.staff s INNER JOIN a.doctor d ORDER BY a.appoinId")
	public List<AppoinmentPatientStaffDoctor> ListAllAPS();
		
	@Query("SELECT new com.faith.app.dto.BillDto(a.appoinId, a.tokenno, a.doa, p.patientName, d.docName, d.consultationfee)FROM Appointment a INNER JOIN a.patient p INNER JOIN a.doctor d ORDER BY a.appoinId")
	public List<BillDto> ShowBill();
}
