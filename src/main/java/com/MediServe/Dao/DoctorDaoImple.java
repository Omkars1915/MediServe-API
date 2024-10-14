package com.MediServe.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.MediServe.entity.Doctor;

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
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Doctor adddoctor(Doctor doctor) {
		Session session=null;
		try {
			session=factory.openSession();
			session.save(doctor);
			session.beginTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Doctor deletedoctorbyid(long id) {
		Session session=null;
		try {
			session=factory.openSession();
			Doctor doctor = session.get(Doctor.class, id);
			session.delete(doctor);
			session.beginTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Doctor> getalldoctors() {
		Session session=null;
		try {
			session=factory.openSession();
			Criteria criteria = session.createCriteria(Doctor.class);
			List list = criteria.list();
			return list;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Doctor getdoctorbyid(long id) {
		Session session=null;
		try {
			session=factory.openSession();
			Doctor doctor = session.get(Doctor.class, id);
			return doctor;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
