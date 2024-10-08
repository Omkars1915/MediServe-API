package com.MediServe.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.MediServe.entity.Doctor;
import com.MediServe.entity.Patient;

@Repository
public class DoctorDaoImple implements DoctorDao {
	
	@Autowired
	private SessionFactory factory;

	@Override
	public Doctor loginDoctor(Doctor request) {
		Session session=null;
		Doctor doctor;
		try {
			session=factory.openSession();
			doctor = session.get(Doctor.class, request.getId());
			if(doctor!=null && request.getPassword()!=null) {
				if(doctor.getPassword().equals(request.getPassword())) {
					return doctor;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public Patient addPatient(Patient patient) {
		Session session=null;
		
		try {
			session=factory.openSession();
			session.save(patient);
			session.beginTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
