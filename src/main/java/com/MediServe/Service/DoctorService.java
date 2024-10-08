package com.MediServe.Service;

import com.MediServe.entity.Doctor;
import com.MediServe.entity.Patient;
import com.MediServe.model.LoginRequest;

public interface DoctorService {

	Doctor loginDoctor(Doctor request);

	Patient addPatient(Patient patient);

}
