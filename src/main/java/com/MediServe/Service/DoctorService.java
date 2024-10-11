package com.MediServe.Service;

import java.util.List;

import com.MediServe.entity.Doctor;

public interface DoctorService {

	Doctor loginDoctor(Doctor request);

	Doctor addDoctor(Doctor doctor);

	Doctor deletedoctorbyid(long id);

	List<Doctor> getalldoctors();

	Doctor getdoctorbyid(long id);

}
