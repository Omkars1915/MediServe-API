package com.MediServe.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.MediServe.entity.Appointment;
import com.MediServe.model.BookAppointment;

@Repository
public class AppointmentDaoImple implements AppointmentDao {
	
	@Autowired
	private SessionFactory factory;

	@Override
	public BookAppointment bookappoint(Appointment appointment) {
		Session session=null;
		try {
			session =factory.openSession();
			session.save(appointment);
			session.beginTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		return null;
	}

	@Override
	public List<Appointment> getappointments() {
		Session session=null;
		List<Appointment> list=null;
		try {
			session =factory.openSession();
			Criteria criteria = session.createCriteria(Appointment.class);
			 list = criteria.list();
			return list;
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		return null;
	}
}
