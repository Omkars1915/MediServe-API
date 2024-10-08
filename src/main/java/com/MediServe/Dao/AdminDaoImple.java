package com.MediServe.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.MediServe.entity.Admin;
import com.MediServe.entity.Doctor;
@Repository
public class AdminDaoImple implements AdminDao {
	
	@Autowired
	private SessionFactory factory;

	@Override
	public Doctor addDoctor(Doctor doctor) {
		Session openSession = null;
		try {
			openSession=factory.openSession();
			openSession.save(doctor);
			openSession.beginTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		
		return null;
	}

	@Override
	public Admin loginAdmin(Admin adminlogin) {
		Session openSession = null;
		Admin admin=null;
		try {
			openSession=factory.openSession();
			admin = openSession.get(Admin.class, adminlogin.getUsername());
			if(admin!=null && admin.getPassword() != null) {
				if(admin.getPassword().equals(adminlogin.getPassword())){
					return admin;
				}
				
			}else {
				return null;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		
		return null;
	}
		
}
