package com.MediServe.Service;

import java.util.List;

import com.MediServe.entity.Appointment;
import com.MediServe.model.BookAppointment;

public interface AppointmentService {

	BookAppointment bookappoint(BookAppointment bookappoint);

	List<Appointment> getappointments();

}
