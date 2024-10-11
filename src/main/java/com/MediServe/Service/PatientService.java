package com.MediServe.Service;

import java.util.List;

import com.MediServe.entity.Patient;

public interface PatientService {

	Patient addPatient(Patient patient);

	List<Patient> getallpatients();

	Patient getpatientbyid(long id);

	Patient deletepatientbyid(long id);

}
