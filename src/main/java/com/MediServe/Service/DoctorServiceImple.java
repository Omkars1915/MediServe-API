package com.MediServe.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MediServe.Dao.DoctorDao;
import com.MediServe.entity.Doctor;
import com.MediServe.entity.Patient;

@Service
public class DoctorServiceImple implements DoctorService {
	
	@Autowired
	private DoctorDao doctordao;

	@Override
	public Doctor loginDoctor(Doctor request) {
		
		return doctordao.loginDoctor(request);
	}

	@Override
	public Patient addPatient(Patient patient) {
		return doctordao.addPatient(patient);
	}

}
