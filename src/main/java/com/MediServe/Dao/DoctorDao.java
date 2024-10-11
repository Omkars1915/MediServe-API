package com.MediServe.Dao;

import java.util.List;

import com.MediServe.entity.Doctor;

public interface DoctorDao {

	Doctor loginDoctor(Doctor request);


	Doctor adddoctor(Doctor doctor);

	Doctor deletedoctorbyid(long id);

	List<Doctor> getalldoctors();


	Doctor getdoctorbyid(long id);

}
