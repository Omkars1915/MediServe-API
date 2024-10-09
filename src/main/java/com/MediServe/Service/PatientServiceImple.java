package com.MediServe.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MediServe.Dao.PatientDao;
import com.MediServe.entity.Patient;

@Service
public class PatientServiceImple implements PatientService {
	
	@Autowired
	private PatientDao patientdao;

	@Override
	public Patient addPatient(Patient patient) {
		return patientdao.addpatient(patient);
	}

	@Override
	public List<Patient> getallpatients() {
		return patientdao.getallpatients();
	}
	
}
