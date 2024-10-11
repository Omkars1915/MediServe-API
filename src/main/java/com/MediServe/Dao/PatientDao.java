package com.MediServe.Dao;

import java.util.List;

import com.MediServe.entity.Patient;

public interface PatientDao {

	Patient addpatient(Patient patient);

	List<Patient> getallpatients();

	Patient getpatientbyid(long id);

	Patient deletepatientbyid(long id);

}
