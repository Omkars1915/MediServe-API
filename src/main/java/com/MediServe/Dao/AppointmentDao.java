package com.MediServe.Dao;

import java.util.List;

import com.MediServe.entity.Appointment;
import com.MediServe.model.BookAppointment;

public interface AppointmentDao {

	BookAppointment bookappoint(Appointment appointment);

	List<Appointment> getappointments();

}
