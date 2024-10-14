package com.MediServe.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MediServe.Dao.AppointmentDao;
import com.MediServe.entity.Appointment;
import com.MediServe.model.BookAppointment;

@Service
public class AppointmentServiceImple implements AppointmentService {
	
	@Autowired
	private AppointmentDao appointmentdao;
	
	@Autowired
	private DoctorService doctorservice;
	
	@Autowired
	private PatientService patientservice;

	@Override
	public BookAppointment bookappoint(BookAppointment bookappoint) {
		
		Appointment appointment=new Appointment();
		appointment.setDate(bookappoint.getDate());
		appointment.setTime(bookappoint.getTime());
		appointment.setDescription(bookappoint.getDescription());
		appointment.setMedicines(bookappoint.getMedicines());
		appointment.setDoctor(doctorservice.getdoctorbyid(bookappoint.getDoctor_id()));
		appointment.setPatient(patientservice.getpatientbyid(bookappoint.getPatient_id()));
		return appointmentdao.bookappoint(appointment);
	}

	@Override
	public List<Appointment> getappointments() {
		return appointmentdao.getappointments();
	}

}
