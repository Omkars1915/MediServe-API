package com.MediServe.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MediServe.Dao.DoctorDao;
import com.MediServe.entity.Doctor;

@Service
public class DoctorServiceImple implements DoctorService {
	
	@Autowired
	private DoctorDao doctordao;

	@Override
	public Doctor loginDoctor(Doctor request) {
		
		return doctordao.loginDoctor(request);
	}

	@Override
	public Doctor addDoctor(Doctor doctor) {
		return doctordao.adddoctor(doctor);
	}

	@Override
	public Doctor deletedoctorbyid(long id) {
		return doctordao.deletedoctorbyid(id);
	}

	@Override
	public List<Doctor> getalldoctors() {
		return doctordao.getalldoctors();
	}

}
