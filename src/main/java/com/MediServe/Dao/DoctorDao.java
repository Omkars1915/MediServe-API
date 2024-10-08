package com.MediServe.Dao;

import com.MediServe.entity.Doctor;
import com.MediServe.entity.Patient;
import com.MediServe.model.LoginRequest;

public interface DoctorDao {

	Doctor loginDoctor(Doctor request);

	Patient addPatient(Patient patient);

}
