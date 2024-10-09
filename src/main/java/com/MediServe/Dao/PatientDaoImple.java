package com.MediServe.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.MediServe.entity.Patient;

@Repository
public class PatientDaoImple implements PatientDao {
	
	@Autowired
	private SessionFactory factory;

	
	@Override
	public Patient addpatient(Patient patient) {
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


	@Override
	public List<Patient> getallpatients() {
		
		Session session=null;
		
		try {
			session=factory.openSession();
			Criteria criteria = session.createCriteria(Patient.class);
			List list = criteria.list();
			return list;
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	
}
